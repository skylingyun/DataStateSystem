package com.ybz.service.impl;

import com.ybz.dao.NodeTravelMapper;
import com.ybz.entity.NodeTravel;
import com.ybz.entity.NodeTravelExample;
import com.ybz.service.IDataNodeTravelService;
import com.ybz.utils.DateUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 出行实现类
 *
 * @author zhangybt
 * @create 2017年08月04日 10:17
 **/
@Service
public class DataNodeTravelServiceImpl implements IDataNodeTravelService {

    @Autowired
    private NodeTravelMapper nodeTravelMapperDao;

    @Override
    public List<NodeTravel> getNodeTravelList(String currentTime, Integer pageSize, Integer currPage) { //List<Map<String,Object>>
//        List<Map<String,Object>> nodeTravelMapList = new LinkedList<Map<String, Object>>();
        NodeTravelExample nodeTravelExample = new NodeTravelExample();
        nodeTravelExample.isDistinct();
        nodeTravelExample.setOrderByClause("ts desc");
        nodeTravelExample.setStartRow((currPage - 1) * pageSize);
        nodeTravelExample.setPageSize(pageSize);
        NodeTravelExample.Criteria criteria = nodeTravelExample.createCriteria();
        criteria.andValidEqualTo(true);
        if (StringUtils.isNotEmpty(currentTime)) {
            Date currentDate = DateUtils.format(currentTime);
            criteria.andTsGreaterThanOrEqualTo(currentDate);
        }
        List<NodeTravel> nodeTravelList = nodeTravelMapperDao.selectByExample(nodeTravelExample);
        return nodeTravelList;
         /*for (NodeTravel nodeTravel: nodeTravelList) {
            Map<String,Object> nodeTravelMap = new HashMap<String, Object>();
            nodeTravelMap.put("fromCity",nodeTravel.getFromCity());
            nodeTravelMap.put("toCity",nodeTravel.getToCity());
            nodeTravelMap.put("travelWay",nodeTravel.getTravelWay());
            nodeTravelMap.put("money",nodeTravel.getMoney());
            nodeTravelMap.put("valid",nodeTravel.getValid());
            nodeTravelMapList.add(nodeTravelMap);
        }*/
    }

    @Override
    public int countByExample(String beginTime,String endTime) {
        NodeTravelExample nodeTravelExample = new NodeTravelExample();
        nodeTravelExample.isDistinct();
        nodeTravelExample.setOrderByClause("ts desc");
        NodeTravelExample.Criteria criteria = nodeTravelExample.createCriteria();
        criteria.andValidEqualTo(true);
        if (StringUtils.isNotEmpty(beginTime) && StringUtils.isNotEmpty(endTime)) {
            Date beginDate = DateUtils.format(beginTime);
            Date endDate = DateUtils.format(endTime);
            criteria.andTsBetween(beginDate,endDate);
        }
        return nodeTravelMapperDao.countByExample(nodeTravelExample);

    }

    @Override
    public Double queryMoneyByDate(String beginTime, String endTime) {
        NodeTravelExample nodeTravelExample = new NodeTravelExample();
        nodeTravelExample.setDistinct(true);
        NodeTravelExample.Criteria criteria = nodeTravelExample.createCriteria();
        criteria.andValidEqualTo(true);
        if(StringUtils.isNotEmpty(beginTime) && StringUtils.isNotEmpty(endTime)){
            Date beginDate = DateUtils.format(beginTime);
            Date endDate = DateUtils.format(endTime);
            criteria.andTsBetween(beginDate,endDate);
        }
        return nodeTravelMapperDao.queryMoneyByDate(nodeTravelExample);
    }


}
