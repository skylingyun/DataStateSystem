package com.ybz.controller;

import com.ybz.entity.Tenant;
import com.ybz.entity.User;
import com.ybz.service.IDataTenantService;
import com.ybz.utils.DataBaseUtils;
import com.ybz.utils.DataResult;
import com.ybz.utils.PageUtils;
import com.ybz.utils.TenantUserUtil;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.tenant.sdk.TenantCenter;
import com.yonyou.iuap.tenant.sdk.UserCenter;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

/**
 * 友互通和应用中心数据信息
 *
 * @author zhangybt
 * @create 2017-08-01 14:56
 **/
@RestController
@RequestMapping("/tenant")
public class DataTenantController {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "dataTenantServiceImpl")
    private IDataTenantService dataTenantService;

    /**
     * 查询用户属于哪些租户列表
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "/getTenantListByMobile", method = RequestMethod.POST)
    public DataResult getTenantListByUserMobile(@RequestBody Map<String, String> map) {
        List<Object> resultList = new LinkedList<Object>();
        if (StringUtils.isEmpty(map.get("userMobile"))) {
            return DataResult.error().put("data", "手机号为空");
        }
        String userId = TenantUserUtil.getTenantUserIdByPhone(map.get("userMobile"));
        if (StringUtils.isEmpty(userId)) {
            return DataResult.error().put("data", "友互通中没有找到对应的用户,请检查手机号是否正确!");
        }
        JSONObject tenant = JSONObject.fromObject(TenantCenter.findTenantsByUserId(userId));
        JSONArray data = JSONArray.fromObject(tenant.get("data"));
        for (int i = 0; i < data.size(); i++) {
            JSONObject tenantList = JSONObject.fromObject(data.get(i));
            Tenant tenantInfo = new Tenant();
            tenantInfo.setTenantId(tenantList.optString("tenantId"));
            tenantInfo.setTenantName(tenantList.optString("tenantName"));
            tenantInfo.setTenantAddress(tenantList.optString("tenantAddress"));
            tenantInfo.setTenantEmail(tenantList.optString("tenantEmail"));
            tenantInfo.setTenantFullname(tenantList.optString("tenantFullname"));
            tenantInfo.setTenantTel(tenantList.optString("tenantTel"));
            resultList.add(tenantInfo);
        }
        return DataResult.ok().put("data", resultList);
    }

    /**
     * 解除用户和租户关系(单个)
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "/deleteSingleRelation", method = RequestMethod.POST)
    public DataResult deleteSingleRelation(@RequestBody Map<String, String> map) {
        List<String> removeList = new ArrayList<String>();
        try {
            String userId = TenantUserUtil.getTenantUserIdByPhone(map.get("userMobile"));
            JSONObject removeResult = JSONObject.fromObject(UserCenter.removeFromTenant(map.get("tenantId"), new String[]{userId}));
            if (removeResult.containsKey("status") && "1".equals(removeResult.optString("status"))) {
                removeList.add(removeResult.optString("msg"));
            }
            return DataResult.ok().put("data", "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DataResult.error().put("data", "删除失败");

    }

    /**
     * 解除用户和租户关系(批量)
     *
     * @param tenantId
     * @param phone
     * @return
     */
    @RequestMapping(value = "/batchDeleteRelation", method = RequestMethod.POST)
    public DataResult deleteRelation(String tenantId, String[] phone) {
        List<String> removeList = new ArrayList<String>();
        try {
            for (String userMobile : phone) {
                String userId = TenantUserUtil.getTenantUserIdByPhone(userMobile);
                JSONObject removeResult = JSONObject.fromObject(UserCenter.removeFromTenant(tenantId, new String[]{userId}));
                if (removeResult.containsKey("status") && "1".equals(removeResult.optString("status"))) {
                    removeList.add(removeResult.optString("msg"));
                }
            }
            return DataResult.ok().put("msg", removeList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DataResult.error();

    }

    /**
     * 根据租户ID获取租户信息
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "/queryTenantInfoByTenantId", method = RequestMethod.POST)
    public DataResult getTenantInfoByTenantId(@RequestBody Map<String, String> map) {
        Tenant tenant = new Tenant();
        List<Tenant> tenantList = new LinkedList<Tenant>();
        JSONObject tenantInfoJson = JSONObject.fromObject(TenantCenter.getTenantById(map.get("tenantId")));
        if(tenantInfoJson.size() == 0){
            return DataResult.error().put("data", "用户中心无此租户");
        }
        if (tenantInfoJson.containsKey("status") && "1".equals(tenantInfoJson.optString("status"))) {
            if(tenantInfoJson.optJSONObject("tenant") == null){
                return DataResult.error().put("data","用户中心无此租户");
            }
            JSONObject tenantInfo = tenantInfoJson.optJSONObject("tenant");
            tenant.setTenantId(tenantInfo.optString("tenantId"));
            tenant.setTenantName(tenantInfo.optString("tenantName"));
            tenant.setTenantAddress(tenantInfo.optString("tenantAddress"));
            tenant.setTenantEmail(tenantInfo.optString("tenantEmail"));
            tenant.setTenantFullname(tenantInfo.optString("tenantFullname"));
            tenant.setTenantTel(tenantInfo.optString("tenantTel"));
            tenantList.add(tenant);
            return DataResult.ok().put("data", tenantList);
        } else {
            return DataResult.error().put("data", "查询租户信息失败");
        }
    }

    /**
     * 添加关联关系
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "/addToTenant", method = RequestMethod.POST)
    public DataResult addToTenant(@RequestBody Map<String, String> map) {
        String userId = TenantUserUtil.getTenantUserIdByPhone(map.get("userMobile"));
        if (StringUtils.isEmpty(userId)) {
            return DataResult.error().put("data", "用户中心无此用户,请确认手机号是否输入正确!");
        }
        JSONObject addRelation = JSONObject.fromObject(UserCenter.addToTenant(map.get("tenantId"), TenantUserUtil.userType, new String[]{userId}));
        if (addRelation.containsKey("status") && "1".equals(addRelation.optString("status"))) {
            return DataResult.ok().put("data", addRelation.optString("msg"));
        } else {
            return DataResult.error().put("data", addRelation.optString("msg"));
        }
    }

    /**
     * 添加用户以及关联关系
     *
     * @param tenantId   租户ID
     * @param userMobile 手机号
     * @return
     */
    @RequestMapping(value = "/addUserAndRelations", method = RequestMethod.POST)
    public DataResult addUserAndRelations(String tenantId, String userMobile) {
        return dataTenantService.getUserByPhone(tenantId, userMobile);
    }

    @RequestMapping(value = "/getDataBasesList", method = RequestMethod.POST)
    public DataResult getDataBasesList() {
        try {
            List<Map<String,String>> list = DataBaseUtils.getDataBasesList();
            return DataResult.ok().put("data", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DataResult.error().put("data", "没有数据库");
    }

    @RequestMapping(value = "/queryUserListByValid", method = RequestMethod.POST)
    public DataResult queryUserListByValid(@RequestBody Map<String, String> map) {
        InvocationInfoProxy.setTenantid(map.get("tenantId"));
        if (StringUtils.isNotEmpty(map.get("validCode")) && StringUtils.equalsIgnoreCase("true", map.get("validCode"))) {
            int userValid = 0;
            int ncUserValid = 1;
            List<User> userList = dataTenantService.queryUserListByValid(userValid, ncUserValid,Integer.parseInt(map.get("activePage")), Integer.parseInt(map.get("totalPage")),map.get("beginTime"),map.get("endTime") );
            int userCount = dataTenantService.countByValid(userValid, ncUserValid,map.get("beginTime"),map.get("endTime"));
            PageUtils pageUtils = new PageUtils(userList, userCount, Integer.parseInt(map.get("totalPage")), Integer.parseInt(map.get("activePage")));
            return DataResult.ok().put("data", pageUtils);
        } else {
            int userValid = 1;
            int ncUserValid = 0;
            List<User> userList = dataTenantService.queryUserListByValid(userValid, ncUserValid,Integer.parseInt(map.get("activePage")), Integer.parseInt(map.get("totalPage")),map.get("beginTime"),map.get("endTime") );
            int userCount = dataTenantService.countByValid(userValid, ncUserValid,map.get("beginTime"),map.get("endTime"));
            PageUtils pageUtils = new PageUtils(userList, userCount, Integer.parseInt(map.get("totalPage")), Integer.parseInt(map.get("activePage")));
            return DataResult.ok().put("data", pageUtils);
        }
    }


}
