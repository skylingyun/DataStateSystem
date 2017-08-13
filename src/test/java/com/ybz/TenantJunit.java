package com.ybz;

import com.ybz.dao.UserMapper;
import com.ybz.entity.User;
import com.ybz.entity.UserExample;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.tenant.sdk.TenantCenter;
import com.yonyou.iuap.tenant.sdk.UserCenter;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 租户测试类
 *
 * @author zhangybt
 * @create 2017年08月02日 13:49
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-*.xml"})
public class TenantJunit {

    @Autowired
    private UserMapper userMapperDao;

    @Test
    public void getUserByUserMobile() {
        String userMobile = "13810613549";
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andPhoneEqualTo(userMobile);
        criteria.andDrEqualTo(false);
        userExample.setDistinct(true);
        userExample.setOrderByClause("ts desc");
        List<User> userList = userMapperDao.selectByExample(userExample);
        System.out.println(userList);
    }

    @Test
    public void getUserByPhone(){

//        System.out.println(TenantCenter.getTenantById("ft9fbcrw"));
        String userMobile = "17778135772";
        JSONObject userJsonObject = JSONObject.fromObject(UserCenter.getUserByLoginName(userMobile));
        JSONObject userInfo = JSONObject.fromObject(userJsonObject.get("user"));
        String userId = userInfo.get("userId").toString();
        JSONObject tenant = JSONObject.fromObject(TenantCenter.findTenantsByUserId(userId));
        JSONArray data = JSONArray.fromObject(tenant.get("data"));
        for (int i = 0; i < data.size(); i++) {
            JSONObject tenantIds = JSONObject.fromObject(data.get(i));
            System.out.println(tenantIds.get("tenantId").toString());
            System.out.println(tenantIds.get("tenantName").toString());
        }
    }

}
