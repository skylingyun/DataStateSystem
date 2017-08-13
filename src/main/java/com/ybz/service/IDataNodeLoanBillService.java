package com.ybz.service;

import com.ybz.entity.NodeLoanBill;

import java.util.List;

/**
 * 借款还款单据接口
 * Created by Guoru on 2017/8/3.
 */
public interface IDataNodeLoanBillService {
    List<NodeLoanBill> getNodeLoanBillList(String currentTime);
    int countByExample(String beginTime, String endTime);

}
