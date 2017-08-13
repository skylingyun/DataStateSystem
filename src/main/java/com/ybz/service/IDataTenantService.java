package com.ybz.service;

import com.ybz.entity.User;
import com.ybz.utils.DataResult;

import java.util.List;


/**
 * 用户和租户的接口
 *
 * @author zhangybt
 * @create 2017年08月02日 13:35
 **/
public interface IDataTenantService {

    DataResult getUserByPhone(String tenantId, String userMobile);

    List<User> queryUserListByValid(int userValid, int ncUserValid, int offset, int limit, String beginTime, String endTime);

    int countByValid(int userValid, int ncUserValid, String beginTime, String endTime);

}
