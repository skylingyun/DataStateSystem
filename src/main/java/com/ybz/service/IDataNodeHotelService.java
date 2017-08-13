package com.ybz.service;

import com.ybz.entity.NodeHotel;

import java.util.List;

/**
 * 住宿记事接口
 *
 * @author zhangybt
 * @create 2017年08月05日 10:15
 **/
public interface IDataNodeHotelService {

    List<NodeHotel> getNodeHotelList(String currentTime,Integer pageSize,Integer currPage);

    int countByExample(String beginTime,String endTime);

    Double queryMoneyByDate(String beginTime,String endTime);
}
