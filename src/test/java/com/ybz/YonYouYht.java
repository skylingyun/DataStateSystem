package com.ybz;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.tenant.sdk.TenantCenter;
import com.yonyou.iuap.tenant.sdk.UserCenter;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

/**
 * Created by Administrator on 2017/7/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-*.xml"})
public class YonYouYht {


    /**
     * 友互通查询人员接口
     */
    @Test
    public void getUserByLoginName() {
        String mobile = "15718813475"; // 18019953310
        String loginName = "15718813475";
        //1.手机号查询出pub_tenant_user信息
        System.out.println(UserCenter.getUserByLoginName(mobile));
        System.out.println("********");
        //2.手机号/邮箱查询出pub_tenant_user/pub_app_user中的随机人员信息
//        System.out.println(UserCenter.getUserByCode(loginName));
        System.out.println("********");
        //3.查询pub_app_user和pub_tenant_user中所有人员
        System.out.println(UserCenter.isUserExist(loginName));
        System.out.println("********");
    }

    /**
     * 删除人员中的关联关系接口(张冰)
     */
    @Test
    public void removeFromTenant() {
        String tenantId = "efgf8xd9";
        InvocationInfoProxy.setTenantid(tenantId);
        /**单个人删除关系方法*/
        String mobile = "15950881663";
        JSONObject userJsonObject = JSONObject.fromObject(UserCenter.getUserByLoginName(mobile));
        JSONObject userInfo = JSONObject.fromObject(userJsonObject.get("user"));
        String userId = userInfo.get("userId").toString();
        JSONObject removeResult = JSONObject.fromObject(UserCenter.removeFromTenant(tenantId, new String[]{userId}));
        System.out.println(removeResult);
        /**多个人删除关系方法*/
      /*  List<PubTenantUserRelation> PubTenantUserRelationList = pubTenantUserRelationMapper.selectUserByTenantId(tenantId);
        for (PubTenantUserRelation PubTenantUserRelation : PubTenantUserRelationList) {
            String mobile = PubTenantUserRelation.getMobile();
            JSONObject userJsonObject = JSONObject.fromObject(UserCenter.getUserByLoginName(mobile));
            JSONObject userInfo = JSONObject.fromObject(userJsonObject.get("user"));
            String userId = userInfo.get("userId").toString();
            if (StringUtil.isEmpty(userId)) {
                System.out.println("没有查询到此人");
            } else {
                if (userId.length() < 36) {
                    System.out.println("是pub_app_user中存在的人，删除关系需要谨慎");
                    JSONObject removeResult = JSONObject.fromObject(UserCenter.removeFromTenant(tenantId, new String[]{userId}));
                    System.out.println(removeResult);
                } else {
                    JSONObject removeResult = JSONObject.fromObject(UserCenter.removeFromTenant(tenantId, new String[]{userId}));
                    System.out.println(removeResult);
                }
            }
        }*/
    }

    /**
     * 新增管理员信息、如果已经存在那么直接关联
     */
    public void addAdminAndRelation() {
        String userCode = "";
        String userName = "";
        String userEmail = "";
        String userMobile = "";
        String tenantId = "";
        Map<String, String> adminParams = new HashMap<String, String>();
        adminParams.put("userCode", userCode);
        adminParams.put("userName", userName);
        adminParams.put("userEmail", userEmail);
        adminParams.put("userMobile", userMobile);
        adminParams.put("tenantId", tenantId);
        JSONObject admin = JSONObject.fromObject(TenantCenter.addAdminAndRelation(adminParams));
//        if (StringUtil.isEqual(admin.get("status").toString(), "1")) {
//            System.out.println(admin.get("msg").toString());
//        }

    }

    /**
     * 查询用户所在租户（单个）
     */
    @Test
    public void getUserAndRelation() {
        String mobile = "17778135772";
        JSONObject userJsonObject = JSONObject.fromObject(UserCenter.getUserByLoginName(mobile));
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

    /**
     * 查询用户所在租户（多个）
     */
    /*@Test
    public void getUserAndRelations() {
        int countData = 1;
        String tenantId = "uq0dskd6";
        InvocationInfoProxy.setTenantid(tenantId);
        String userId = null;
        List<User> userList = userMapperDao.selectAllUsers();
        PubTenantUserRelation pubTenantUserRelation = new PubTenantUserRelation();
        for (User user : userList) {
            try {
                JSONObject userJsonObject = JSONObject.fromObject(UserCenter.getUserByLoginName(user.getPhone()));
                if (userJsonObject == null || userJsonObject.isNullObject()) {
                    continue;
                }
                if (!"1".equals(userJsonObject.get("status").toString())) {
                    continue;
                }
                JSONObject userInfo = JSONObject.fromObject(userJsonObject.get("user"));
                if (!userInfo.containsKey("userId")) {
                    continue;
                }
                userId = userInfo.getString("userId");
                JSONObject tenant = JSONObject.fromObject(TenantCenter.findTenantsByUserId(userId));
                JSONArray data = JSONArray.fromObject(tenant.get("data"));
                for (int i = 0; i < data.size(); i++) {
                    JSONObject tenantIds = JSONObject.fromObject(data.get(i));
                    if (tenantIds.containsKey("tenantId")) {
//                        if (tenantId.equals(tenantIds.get("tenantId").toString())) {
                            pubTenantUserRelation.setMobile(user.getPhone());
                            pubTenantUserRelation.setTenantName(tenantIds.get("tenantName").toString());
                            pubTenantUserRelation.setDeptName(user.getDeptName());
                            pubTenantUserRelation.setCompany(user.getCompany());
                            pubTenantUserRelation.setTenantId(tenantIds.get("tenantId").toString());
                            int count = pubTenantUserRelationMapper.insert(pubTenantUserRelation);
//                    System.out.println(count);
//                        }
                    } else {
                        continue;
                    }
//                System.out.print(user.getDeptName() + "   " + user.getPhone() + "——>" + tenantIds.get("tenantId") + ":" + tenantIds.get("tenantName") + "   ");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(countData++);
        }

    }*/

    /**
     * 根据一个手机号查询此人所在租户信息
     */
    @Test
    public void getUserAndRelationsByPhone() {
        String mobile = "15950881663";
        JSONObject userJsonObject = JSONObject.fromObject(UserCenter.getUserByLoginName(mobile));
        JSONObject userInfo = JSONObject.fromObject(userJsonObject.get("user"));
        String userId = userInfo.get("userId").toString();
        System.out.println(userId);
        JSONObject tenant = JSONObject.fromObject(TenantCenter.findTenantsByUserId(userId));
        JSONArray data = JSONArray.fromObject(tenant.get("data"));
        for (int i = 0; i < data.size(); i++) {
            JSONObject tenantIds = JSONObject.fromObject(data.get(i));
            if (tenantIds.containsKey("tenantId")) {
                System.out.println(tenantIds);
                System.out.println("**************************");
            } else {
                System.out.println(mobile + "不知道属于哪个租户");
                continue;
            }
        }
    }






    @Test
    public void addUserAndRelations() {

////        String userCode = "songrl";
////        String userName = "宋荣龙";
//        String mobile = "18192250370";
////        String userEmail = "songrl@yonyou.com";


        /*
        Map<String, String> addParams = new HashMap<>();
        addParams.put("userId",userId);
        addParams.put("tenantId", tenantId);
        //用户中心userCode有唯一校验，添加关系时可能报错，因此添加了随机数区分。
        addParams.put("userCode", userCode + StringUtil.getFourRandom());
        addParams.put("userName", userName);
        addParams.put("userMobile", mobile);
        if (!StringUtils.isEmpty(userEmail)) {
            addParams.put("userEmail", userEmail);
        }
        addParams.put("systemId", TenantUserUtil.SystemId);
        addParams.put("userPassword", ClouldUtils.PASSWORD);
        com.alibaba.fastjson.JSONObject userJson = new com.alibaba.fastjson.JSONObject();
        JSONArray userJsonArray = new JSONArray();
        userJsonArray.add(addParams);
        userJson.put("users", userJsonArray);
        org.json.JSONObject addUserAndRelations = null;
        try {
            addUserAndRelations = new org.json.JSONObject(UserCenter.addUsersAndRelations(tenantId, TenantUserUtil.SystemId, null, "111111", userJson.toJSONString()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //用户中心添加过程
        if (addUserAndRelations.has("status") && addUserAndRelations.optInt("status") == 1) {
            System.out.println(addUserAndRelations.opt("msg"));
        }*/
    }

    /*@Test
    public void addRelationForeach() {
        int count = 1;
        String tenantId = "uq0dskd6";
        InvocationInfoProxy.setTenantid(tenantId);
        List<User> userList = userMapperDao.selectAllUsers();
        for (User user : userList) {
            try {
                JSONObject userJsonObject = JSONObject.fromObject(UserCenter.getUserByLoginName(user.getPhone()));
                System.out.println("**********************************************");
                System.out.println(user.getPhone());
                System.out.println("**********************************************");
                JSONObject userInfo = JSONObject.fromObject(userJsonObject.get("user"));
                System.out.println("===============================================");
                System.out.println(userInfo);
                System.out.println("===============================================");
                if (userInfo == null || userInfo.isNullObject() || userInfo.isEmpty()) {
                    continue;
                }
                String userId = userInfo.get("userId").toString();
                JSONObject addRelationJson = JSONObject.fromObject(UserCenter.addToTenant(tenantId, 11111, new String[]{userId}));
                System.out.println(addRelationJson.optString("msg") + "*******" + count++);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }*/
/*
    @Test
    public void getGuFenUser() {
        int count = 1;
        String tenantId = "ft9fbcrw";
        String userId = "d9a6445d-8a95-46ce-9516-cd99ae4b3435";
        InvocationInfoProxy.setTenantid(tenantId);
        Map ncUserMap = dataExchange.process(new HashMap<String, Object>(), "syncUser", userId);
        JSONObject jsonObject = JSONObject.fromObject(ncUserMap);
        Iterator keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = (String) keys.next();
            Map items = (Map) jsonObject.opt(key);
            if(StringUtil.isEmpty((String)items.get("mobile"))){
                System.out.println(items.get("mobile") + "*****" + count++);
            }
        }

    }*/

   /* @Test
    public void loginCheck(){
        int count = 1;
        String inputPassword = "yonyou@123";
        String tenantId = "ft9fbcrw";
        String msg = "用户名或密码错误";
        InvocationInfoProxy.setTenantid(tenantId);
//        List<User> userList = userMapperDao.selectAllUsers();
//        for (User user: userList) {
            String inputUserName = "17778135772";//user.getPhone();
            try {
                org.json.JSONObject userInfo = new org.json.JSONObject(UserCenter.verifyUser(inputUserName, inputPassword, TenantUserUtil.SystemId));
                if(!msg.equals(userInfo.optString("msg"))){
                    System.out.println(userInfo.optString("msg") + "******" + count++);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
//        }
    }*/

}
