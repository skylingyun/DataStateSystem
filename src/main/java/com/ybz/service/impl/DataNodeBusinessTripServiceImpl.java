package com.ybz.service.impl;

import com.ybz.dao.NodeBusinessTripMapper;
import com.ybz.entity.NodeBusinessTrip;
import com.ybz.entity.NodeBusinessTripExample;
import com.ybz.service.IDataNodeBusinessTripService;
import com.ybz.utils.DateUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 申请单据实现类
 * Created by Guoru on 2017/8/3.
 */

@Service
public class DataNodeBusinessTripServiceImpl implements IDataNodeBusinessTripService {
    @Autowired
    private NodeBusinessTripMapper nodeBusinessTripMapperDao;

    public List<NodeBusinessTrip> getNodeBusinessTripList(String currentTime){
        NodeBusinessTripExample nodeBusinessTripExample = new NodeBusinessTripExample();
        NodeBusinessTripExample.Criteria criteria = nodeBusinessTripExample.createCriteria();
        nodeBusinessTripExample.setDistinct(true);
        nodeBusinessTripExample.setOrderByClause("ts desc");
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
        return nodeBusinessTripMapperDao.selectByExample(nodeBusinessTripExample);
    }


    @Override
    public int countByExample(String beginTime, String endTime) {
        NodeBusinessTripExample nodeBusinessTripExample = new NodeBusinessTripExample();
        nodeBusinessTripExample.isDistinct();
        nodeBusinessTripExample.setOrderByClause("ts desc");
        NodeBusinessTripExample.Criteria criteria = nodeBusinessTripExample.createCriteria();
        criteria.andValidEqualTo(true);
        if (StringUtils.isNotEmpty(beginTime) && StringUtils.isNotEmpty(endTime)) {
            Date beginDate = DateUtils.format(beginTime);
            Date endDate = DateUtils.format(endTime);
            criteria.andTsBetween(beginDate, endDate);
        }
        return nodeBusinessTripMapperDao.countByExample(nodeBusinessTripExample);
    }
}
