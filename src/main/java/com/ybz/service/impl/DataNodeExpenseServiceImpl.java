package com.ybz.service.impl;

import com.ybz.dao.NodeExpenseMapper;
import com.ybz.entity.NodeExpense;
import com.ybz.entity.NodeExpenseExample;
import com.ybz.service.IDataNodeExpenseService;
import com.ybz.utils.DateUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 报销单据实现类
 *
 * @author zhangybt
 * @create 2017年08月02日 15:17
 **/
@Service
public class DataNodeExpenseServiceImpl implements IDataNodeExpenseService {

    @Autowired
    private NodeExpenseMapper nodeExpenseMapperDao;

    public List<NodeExpense> getNodeExpenseList(String currentTime) {
        NodeExpenseExample nodeExpenseExample = new NodeExpenseExample();
        NodeExpenseExample.Criteria criteria = nodeExpenseExample.createCriteria();
        nodeExpenseExample.setDistinct(true);
        nodeExpenseExample.setOrderByClause("ts desc");
        criteria.andValidEqualTo(true);
        if (currentTime != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd ");
                Date currentDate = simpleDateFormat.parse(currentTime);
                criteria.andTsGreaterThanOrEqualTo(currentDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return nodeExpenseMapperDao.selectByExample(nodeExpenseExample);
    }

    @Override
    public int countByExample(String beginTime, String endTime) {
        NodeExpenseExample nodeExpenseExample = new NodeExpenseExample();
        nodeExpenseExample.isDistinct();
        nodeExpenseExample.setOrderByClause("ts desc");
        NodeExpenseExample.Criteria criteria = nodeExpenseExample.createCriteria();
        criteria.andValidEqualTo(true);
        if (StringUtils.isNotEmpty(beginTime) && StringUtils.isNotEmpty(endTime)) {
            Date beginDate = DateUtils.format(beginTime);
            Date endDate = DateUtils.format(endTime);
            criteria.andTsBetween(beginDate, endDate);
        }
        return nodeExpenseMapperDao.countByExample(nodeExpenseExample);
    }
}
