package com.ybz.service.impl;

import com.ybz.dao.UserMapper;
import com.ybz.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhangybt on 2017/8/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-*.xml"})
public class DataTenantServiceImplTest {

    @Autowired
    private UserMapper userMapperDao;

    @Test
    public void queryUserListByValid() throws Exception {
//        List<User> userList = userMapperDao.queryUserListByValid(0,1);
//        System.out.println(userList);
    }

}