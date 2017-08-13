package com.ybz.service.impl;

import com.ybz.dao.NodeOtherMapper;
import com.ybz.entity.NodeOther;
import com.ybz.entity.NodeOtherExample;
import com.ybz.service.IDataNodeOtherService;
import com.ybz.utils.DateUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 其它记事实现类
 *
 * @author zhangybt
 * @create 2017年08月05日 9:31
 **/
@Service
public class DataNodeOtherServiceImpl implements IDataNodeOtherService {

    @Autowired
    private NodeOtherMapper nodeOtherMapperDao;

    @Override
    public List<NodeOther> getOtherList(String currentTime) {
        NodeOtherExample nodeOtherExample = new NodeOtherExample();
        nodeOtherExample.isDistinct();
        nodeOtherExample.setOrderByClause("ts desc");
        NodeOtherExample.Criteria criteria = nodeOtherExample.createCriteria();
        criteria.andValidEqualTo(true);
        if (StringUtils.isNotEmpty(currentTime)) {
            Date currentDate = DateUtils.format(currentTime);
            criteria.andTsGreaterThanOrEqualTo(currentDate);
        }
        return nodeOtherMapperDao.selectByExample(nodeOtherExample);
    }


    @Override
    public int countByExample(String beginTime,String endTime) {
        NodeOtherExample NodeOtherExample = new NodeOtherExample();
        NodeOtherExample.isDistinct();
        NodeOtherExample.setOrderByClause("ts desc");
        NodeOtherExample.Criteria criteria = NodeOtherExample.createCriteria();
        criteria.andValidEqualTo(true);
        if (StringUtils.isNotEmpty(beginTime) && StringUtils.isNotEmpty(endTime)) {
            Date beginData = DateUtils.format(beginTime);
            Date endData = DateUtils.format(endTime);
            criteria.andTsBetween(beginData,endData);
        }
        return nodeOtherMapperDao.countByExample(NodeOtherExample);

    }

    @Override
    public Double queryMoneyByDate(String beginTime, String endTime) {
        NodeOtherExample nodeTravelExample = new NodeOtherExample();
        nodeTravelExample.setDistinct(true);
        NodeOtherExample.Criteria criteria = nodeTravelExample.createCriteria();
        criteria.andValidEqualTo(true);
        if(StringUtils.isNotEmpty(beginTime) && StringUtils.isNotEmpty(endTime)){
            Date beginDate = DateUtils.format(beginTime);
            Date endDate = DateUtils.format(endTime);
            criteria.andTsBetween(beginDate,endDate);
        }
        return nodeOtherMapperDao.queryMoneyByDate(nodeTravelExample);
    }
}
