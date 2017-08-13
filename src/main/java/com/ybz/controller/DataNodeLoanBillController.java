package com.ybz.controller;

import com.ybz.entity.NodeBusinessTrip;
import com.ybz.entity.NodeLoanBill;
import com.ybz.service.IDataNodeBusinessTripService;
import com.ybz.service.IDataNodeLoanBillService;
import com.ybz.utils.DataResult;
import com.yonyou.iuap.context.InvocationInfoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 借还款单据统计
 * Created by Guoru on 2017/8/3.
 */
@Controller
@RequestMapping("/nodeLoanBill")
public class DataNodeLoanBillController {
    @Resource(name = "dataNodeLoanBillServiceImpl")
    private IDataNodeLoanBillService dataNodeLoanBillService;

    @RequestMapping(value = "/getNodeLoanBillList", method = RequestMethod.POST)
    public @ResponseBody
    DataResult getNodeLoanBillList(String tenantId, String currentTime) {
        InvocationInfoProxy.setTenantid(tenantId);
        List<NodeLoanBill> nodeLoanBillList = dataNodeLoanBillService.getNodeLoanBillList(currentTime);
        return DataResult.ok().put("data", nodeLoanBillList);
    }
}
