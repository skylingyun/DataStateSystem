package com.ybz.service.impl;

import com.ybz.dao.NodeGatherMapper;
import com.ybz.entity.NodeGather;
import com.ybz.entity.NodeGatherExample;
import com.ybz.service.IDataNodeGatherService;
import com.ybz.utils.DateUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 某记事实现类
 *
 * @author zhangybt
 * @create 2017年08月05日 10:56
 **/
@Service
public class DataNodeGatherServiceImpl implements IDataNodeGatherService {

    @Autowired
    private NodeGatherMapper nodeGatherMapperDao;

    @Override
    public List<NodeGather> getNodeGatherList(String currentTime) {

        NodeGatherExample nodeGatherExample = new NodeGatherExample();
        nodeGatherExample.isDistinct();
        nodeGatherExample.setOrderByClause("ts desc");
        NodeGatherExample.Criteria criteria = nodeGatherExample.createCriteria();
        criteria.andValidEqualTo(true);
        if(StringUtils.isNotEmpty(currentTime)){
            Date currentDate = DateUtils.format(currentTime);
            criteria.andTsGreaterThanOrEqualTo(currentDate);
        }
        return nodeGatherMapperDao.selectByExample(nodeGatherExample);
    }

    @Override
    public int countByExample(String beginTime,String endTime) {
        NodeGatherExample NodeGatherExample = new NodeGatherExample();
        NodeGatherExample.isDistinct();
        NodeGatherExample.setOrderByClause("ts desc");
        NodeGatherExample.Criteria criteria = NodeGatherExample.createCriteria();
        criteria.andValidEqualTo(true);
        if (StringUtils.isNotEmpty(beginTime)) {
            Date beginDate = DateUtils.format(beginTime);
            Date endDate = DateUtils.format(endTime);
            criteria.andTsBetween(beginDate,endDate);

        }
        return nodeGatherMapperDao.countByExample(NodeGatherExample);

    }

    @Override
    public Double queryMoneyByDate(String beginTime, String endTime) {
        NodeGatherExample nodeTravelExample = new NodeGatherExample();
        nodeTravelExample.setDistinct(true);
        NodeGatherExample.Criteria criteria = nodeTravelExample.createCriteria();
        criteria.andValidEqualTo(true);
        if(StringUtils.isNotEmpty(beginTime) && StringUtils.isNotEmpty(endTime)){
            Date beginDate = DateUtils.format(beginTime);
            Date endDate = DateUtils.format(endTime);
            criteria.andTsBetween(beginDate,endDate);
        }
        return nodeGatherMapperDao.queryMoneyByDate(nodeTravelExample);
    }
}
