package com.ybz.utils;

import com.yonyou.iuap.tenant.sdk.UserCenter;
import net.sf.json.JSONObject;
import org.springframework.util.StringUtils;

/**
 * 获取用户信息工具类
 *
 * @author zhangybt
 * @create 2017年08月02日 10:28
 **/
public class TenantUserUtil {

    public static final String systemId = "ssc_baozhang";
    public static final String password = "yonyou@123";
    public static final Integer userType = 0;

    public static String getTenantUserIdByPhone(String phone) {
        try {
            String userInfo = UserCenter.getUserByLoginName(phone);
            if (!StringUtils.isEmpty(userInfo)) {
                JSONObject info = JSONObject.fromObject(userInfo);
                if (info.has("status") && "1".equals(info.getString("status"))) {
                    JSONObject userObj = info.getJSONObject("user");
                    return (String) userObj.get("userId");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
