package com.ybz.service;

import com.ybz.entity.NodeTravel;

import java.util.List;
import java.util.Map;

/**
 * 出行接口
 *
 * @author zhangybt
 * @create 2017年08月04日 10:18
 **/
public interface IDataNodeTravelService {

    List<NodeTravel> getNodeTravelList(String currentTime,Integer pageSize,Integer currPage);

    int countByExample(String beginTime,String endTime);

    Double queryMoneyByDate(String beginTime,String endTime);

}
