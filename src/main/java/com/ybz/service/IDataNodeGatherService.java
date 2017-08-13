package com.ybz.service;

import com.ybz.entity.NodeGather;

import java.util.List;

/**
 * 某记事接口
 *
 * @author zhangybt
 * @create 2017年08月05日 10:57
 **/
public interface IDataNodeGatherService {

    List<NodeGather> getNodeGatherList(String currentTime);

    int countByExample(String beginTime, String endTime);

    Double queryMoneyByDate(String beginTime,String endTime);
}
