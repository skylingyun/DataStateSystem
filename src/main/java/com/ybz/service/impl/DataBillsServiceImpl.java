package com.ybz.service.impl;

import com.ybz.service.IDataBillsService;
import com.ybz.service.IDataNodeBusinessTripService;
import com.ybz.service.IDataNodeExpenseService;
import com.ybz.service.IDataNodeLoanBillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Guoru on 2017/8/10.
 */
@Service
public class DataBillsServiceImpl implements IDataBillsService {
    @Resource(name = "dataNodeBusinessTripServiceImpl")
    IDataNodeBusinessTripService dataNodeBusinessTripService;

    @Resource(name = "dataNodeExpenseServiceImpl")
    IDataNodeExpenseService dataNodeExpenseService;

    @Resource(name = "dataNodeLoanBillServiceImpl")
    IDataNodeLoanBillService dataNodeLoanBillService;

    public List<Map<String,Integer>> getDataBillsPage(String beginTime, String endTime){
        List<Map<String,Integer>> list = new LinkedList<Map<String,Integer>>();
        Map<String,Integer> map = new HashMap<String, Integer>();
        int businessTripCount = dataNodeBusinessTripService.countByExample(beginTime, endTime);
        int expenseCount = dataNodeExpenseService.countByExample(beginTime, endTime);
        int loanBillCount = dataNodeLoanBillService.countByExample(beginTime, endTime);
        map.put("businessTrip",businessTripCount);
        map.put("expense",expenseCount);
        map.put("loanBill",loanBillCount);
        list.add(map);
        return list;
    }
}
