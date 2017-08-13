package com.ybz.service.impl;

import com.ybz.dao.NcUserMapper;
import com.ybz.dao.UserMapper;
import com.ybz.entity.NcUser;
import com.ybz.entity.NcUserExample;
import com.ybz.entity.User;
import com.ybz.entity.UserExample;
import com.ybz.service.IDataTenantService;
import com.ybz.utils.DataResult;
import com.ybz.utils.DateUtils;
import com.ybz.utils.TenantUserUtil;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.tenant.sdk.UserCenter;
import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

/**
 * 用户和租户实现类
 *
 * @author zhangybt
 * @create 2017年08月02日 13:37
 **/
@Service
public class DataTenantServiceImpl implements IDataTenantService {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private UserMapper userMapperDao;

    @Autowired
    private NcUserMapper ncUserMapperDao;

    @Override
    public DataResult getUserByPhone(String tenantId, String userMobile) {
        InvocationInfoProxy.setTenantid(tenantId);
        Map<String, String> addParams = new HashMap<String, String>();
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andPhoneEqualTo(userMobile);
        criteria.andDrEqualTo(false);
        userExample.setDistinct(true);
        userExample.setOrderByClause("ts desc");
        List<User> userList = userMapperDao.selectByExample(userExample);
        if (userList.size() == 0) {
            return DataResult.error().put("data", "没有查询到此用户");
        }
        User user = userList.get(0);
        addParams.put("tenantId", tenantId);
        // todo 用户中心userCode有唯一校验，添加关系时可能报错，因此添加了随机数区分。
        addParams.put("userCode", user.getUserCode());
        addParams.put("userName", user.getUserName());
        addParams.put("userMobile", user.getPhone());
        addParams.put("userEmail", user.getEmail());
        addParams.put("systemId", TenantUserUtil.systemId);
        addParams.put("userPassword", TenantUserUtil.password);
        com.alibaba.fastjson.JSONObject userJson = new com.alibaba.fastjson.JSONObject();
        JSONArray userJsonArray = new JSONArray();
        userJsonArray.add(addParams);
        userJson.put("users", userJsonArray);
        try {
            JSONObject addUserAndRelations = JSONObject.fromObject(UserCenter.addUsersAndRelations(tenantId, TenantUserUtil.systemId, null, "111111", userJson.toJSONString()));
            //用户中心添加过程
            if (addUserAndRelations.has("status") && addUserAndRelations.optInt("status") == 1) {
                return DataResult.ok().put("msg", addUserAndRelations.optString("msg"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<User> queryUserListByValid(int userValid, int ncUserValid, int offset, int limit, String beginTime, String endTime) {
        List<String> list = queryUserIdByValid(beginTime, endTime);
        UserExample example = new UserExample();
        example.setDistinct(true);
        example.setOrderByClause("ts desc");
        example.setPageSize(limit);
        example.setStartRow(offset);
        UserExample.Criteria criteria = example.createCriteria();
        if (userValid == 0) {
            criteria.andDrEqualTo(false);
        }
        criteria.andUseridIn(list);
        List<User> userList = userMapperDao.queryUserListByValid(example);
        return userList;
    }

    private List<String> queryUserIdByValid(String beginTime, String endTime) {
        List<String> list = new LinkedList<String>();
        NcUserExample ncUserExample = new NcUserExample();
        ncUserExample.setDistinct(true);
        NcUserExample.Criteria nCriteria = ncUserExample.createCriteria();
        nCriteria.andValidEqualTo(true);
        if (StringUtils.isNotEmpty(beginTime) && StringUtils.isNotEmpty(endTime)) {
            Date beginDate = DateUtils.format(beginTime);
            Date endDate = DateUtils.format(endTime);
            nCriteria.andTsBetween(beginDate, endDate);
        }
        List<NcUser> ncUserList = ncUserMapperDao.selectByExample(ncUserExample);
        for (NcUser ncUser : ncUserList) {
            list.add(ncUser.getUserid());
        }
        return list;
    }

    @Override
    public int countByValid(int userValid, int ncUserValid, String beginTime, String endTime) {
        List<String> list = queryUserIdByValid(beginTime, endTime);
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andDrEqualTo(false);
        if (StringUtils.isNotEmpty(beginTime) && StringUtils.isNotEmpty(endTime)) {
            Date beginDate = DateUtils.format(beginTime);
            Date endDate = DateUtils.format(endTime);
            criteria.andTsBetween(beginDate, endDate);
        }
        criteria.andUseridIn(list);
        int userCount = userMapperDao.countByValid(example);
        return userCount;
    }


}
