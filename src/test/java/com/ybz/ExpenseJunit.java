package com.ybz;

import com.ybz.dao.NodeExpenseMapper;
import com.ybz.entity.NodeExpense;
import com.ybz.entity.NodeExpenseExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

/**
 * 报销单测试类
 *
 * @author zhangybt
 * @create 2017年08月02日 15:59
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-*.xml"})
public class ExpenseJunit {
    @Autowired
    private NodeExpenseMapper nodeExpenseMapperDao;

    @Test
    public void getNodeExpenseListTest(){
        NodeExpense nodeExpense = new NodeExpense();
        Date now = new Date();
        NodeExpenseExample nodeExpenseExample = new NodeExpenseExample();
        NodeExpenseExample.Criteria criteria = nodeExpenseExample.createCriteria();
        nodeExpenseExample.setDistinct(true);
        nodeExpenseExample.setOrderByClause("ts desc");
        criteria.andValidEqualTo(true);
        if(nodeExpense.getTs() != null){
            criteria.andTsGreaterThanOrEqualTo(now);
        }
        List<NodeExpense> nodeExpenseList = nodeExpenseMapperDao.selectByExample(nodeExpenseExample);
        System.out.println(nodeExpenseList.get(0));
    }
}
