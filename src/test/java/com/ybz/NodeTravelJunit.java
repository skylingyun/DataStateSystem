package com.ybz;

import com.ybz.controller.DataNodeTravelController;
import com.ybz.dao.NodeTravelMapper;
import com.ybz.entity.NodeTravelExample;
import com.ybz.utils.DataBaseUtils;
import com.ybz.utils.DateUtils;
import com.yonyou.iuap.context.InvocationInfoProxy;
import org.apache.commons.lang.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Date;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 出行测试
 *
 * @author zhangybt
 * @create 2017年08月04日 10:51
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-*.xml"})
@WebAppConfiguration
public class NodeTravelJunit {

    private MockMvc mockMvc;

    @Autowired
    private NodeTravelMapper nodeTravelMapperDao;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new DataNodeTravelController()).build();
    }

    @Test
    public void nodeTravelController() throws Exception {
        RequestBuilder request = null;
        request = get("/travel/travelList");
        ResultActions resultActions = mockMvc.perform(request).andExpect(status().isOk()).andExpect(content().string(equalTo("[]"))).andDo(print());
    }

    @Test
    public void queryMoneyTest(){
        InvocationInfoProxy.setTenantid("xx9i3hpm");
        String beginTime = "2016-03-20";
        String endTime = "2017-03-20";
        NodeTravelExample nodeTravelExample = new NodeTravelExample();
        nodeTravelExample.setDistinct(true);
        NodeTravelExample.Criteria criteria = nodeTravelExample.createCriteria();
        criteria.andValidEqualTo(true);
        if(StringUtils.isNotEmpty(beginTime) && StringUtils.isNotEmpty(endTime)){
            Date beginDate = DateUtils.format(beginTime);
            Date endDate = DateUtils.format(endTime);
            criteria.andTsBetween(beginDate,endDate);
        }
        System.out.println(nodeTravelMapperDao.queryMoneyByDate(nodeTravelExample));
    }
}
