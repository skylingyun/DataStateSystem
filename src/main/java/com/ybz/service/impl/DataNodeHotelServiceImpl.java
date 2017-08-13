package com.ybz.service.impl;

import com.ybz.dao.NodeHotelMapper;
import com.ybz.entity.NodeHotel;
import com.ybz.entity.NodeHotelExample;
import com.ybz.service.IDataNodeHotelService;
import com.ybz.utils.DateUtils;
import org.apache.commons.lang.CharUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 住宿记事实现类
 *
 * @author zhangybt
 * @create 2017年08月05日 10:14
 **/
@Service
public class DataNodeHotelServiceImpl implements IDataNodeHotelService {

    @Autowired
    private NodeHotelMapper nodeHotelMapperDao;

    @Override
    public List<NodeHotel> getNodeHotelList(String currentTime, Integer pageSize, Integer currPage) {
        NodeHotelExample NodeHotelExample = new NodeHotelExample();
        NodeHotelExample.isDistinct();
        NodeHotelExample.setOrderByClause("ts desc");
        NodeHotelExample.setStartRow((currPage - 1) * pageSize);
        NodeHotelExample.setPageSize(pageSize);
        NodeHotelExample.Criteria criteria = NodeHotelExample.createCriteria();
        criteria.andValidEqualTo(true);
        if (StringUtils.isNotEmpty(currentTime)) {
            Date currentDate = DateUtils.format(currentTime);
            criteria.andTsGreaterThanOrEqualTo(currentDate);
        }
        List<NodeHotel> NodeHotelList = nodeHotelMapperDao.selectByExample(NodeHotelExample);
        return NodeHotelList;
    }

    @Override
    public int countByExample(String beginTime,String endTime) {
        NodeHotelExample NodeHotelExample = new NodeHotelExample();
        NodeHotelExample.isDistinct();
        NodeHotelExample.setOrderByClause("ts desc");
        NodeHotelExample.Criteria criteria = NodeHotelExample.createCriteria();
        criteria.andValidEqualTo(true);
        if (StringUtils.isNotEmpty(beginTime) && StringUtils.isNotEmpty(endTime)) {
            Date beginDate = DateUtils.format(beginTime);
            Date endDate = DateUtils.format(endTime);
            criteria.andTsBetween(beginDate,endDate);
        }
        return nodeHotelMapperDao.countByExample(NodeHotelExample);

    }

    @Override
    public Double queryMoneyByDate(String beginTime, String endTime) {
        NodeHotelExample nodeTravelExample = new NodeHotelExample();
        nodeTravelExample.setDistinct(true);
        NodeHotelExample.Criteria criteria = nodeTravelExample.createCriteria();
        criteria.andValidEqualTo(true);
        if(StringUtils.isNotEmpty(beginTime) && StringUtils.isNotEmpty(endTime)){
            Date beginDate = DateUtils.format(beginTime);
            Date endDate = DateUtils.format(endTime);
            criteria.andTsBetween(beginDate,endDate);
        }
        return nodeHotelMapperDao.queryMoneyByDate(nodeTravelExample);
    }
}
