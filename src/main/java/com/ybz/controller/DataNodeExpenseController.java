package com.ybz.controller;

import com.ybz.entity.NodeExpense;
import com.ybz.service.IDataNodeExpenseService;
import com.ybz.utils.DataResult;
import com.yonyou.iuap.context.InvocationInfoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 报销单据统计
 *
 * @author zhangybt
 * @create 2017年08月02日 15:11
 **/
@Controller
@RequestMapping("/nodeExpense")
public class DataNodeExpenseController {

    @Resource(name = "dataNodeExpenseServiceImpl")
    private IDataNodeExpenseService dataNodeExpenseService;

    @RequestMapping(value = "/getNodeExpenseList", method = RequestMethod.POST)
    public @ResponseBody
    DataResult getNodeExpenseList(String tenantId, String currentTime) {
        InvocationInfoProxy.setTenantid(tenantId);
        List<NodeExpense> nodeExpenseList = dataNodeExpenseService.getNodeExpenseList(currentTime);
        return DataResult.ok().put("data", nodeExpenseList);
    }


}
