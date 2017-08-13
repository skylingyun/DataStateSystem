package com.ybz;

import com.ybz.dao.NodeBusinessTripMapper;
import com.ybz.dao.NodeExpenseMapper;
import com.ybz.entity.NodeBusinessTrip;
import com.ybz.entity.NodeBusinessTripExample;
import com.ybz.entity.NodeExpense;
import com.yonyou.iuap.context.InvocationInfoProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * 申请单测试类
 * Created by Guoru on 2017/8/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-*.xml"})
public class BusinessTripJunit {
    @Autowired
    private NodeBusinessTripMapper nodeBusinessTripMapperDao;

    @Test
    public void getNodeBusinessTripListTest(){
//        NodeBusinessTrip nodeBusinessTrip = new NodeBusinessTrip();
//        Date now = new Date();
        String tenantId = "efgf8xd9";
        InvocationInfoProxy.setTenantid(tenantId);
        NodeBusinessTripExample nodeBusinessTripExample = new NodeBusinessTripExample();
        NodeBusinessTripExample.Criteria criteria = nodeBusinessTripExample.createCriteria();
        nodeBusinessTripExample.setDistinct(true);
        nodeBusinessTripExample.setOrderByClause("ts desc");
        criteria.andValidEqualTo(false);
        /*if(nodeBusinessTrip.getTs() != null){
            criteria.andTsGreaterThanOrEqualTo(now);
        }*/
        List<NodeBusinessTrip> nodeBusinessTripList = nodeBusinessTripMapperDao.selectByExample(nodeBusinessTripExample);
        System.out.println(nodeBusinessTripList.get(0));

    }
}
