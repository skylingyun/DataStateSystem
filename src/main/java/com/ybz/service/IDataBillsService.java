package com.ybz.service;

import java.util.List;
import java.util.Map;

/**
 * 所有单据接口
 * Created by Guoru on 2017/8/10.
 */
public interface IDataBillsService {
    List<Map<String,Integer>> getDataBillsPage(String beginTime, String endTime);
}
