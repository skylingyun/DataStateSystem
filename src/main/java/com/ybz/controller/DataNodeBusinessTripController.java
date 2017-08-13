package com.ybz.controller;

import com.ybz.entity.NodeBusinessTrip;
import com.ybz.service.IDataNodeBusinessTripService;
import com.ybz.utils.DataResult;
import com.yonyou.iuap.context.InvocationInfoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 申请单据统计
 * Created by Guoru on 2017/8/3.
 */
@Controller
@RequestMapping("/nodeBusinessTrip")
public class DataNodeBusinessTripController {
    @Resource(name = "dataNodeBusinessTripServiceImpl")
    private IDataNodeBusinessTripService dataNodeBusinessTripService;

    @RequestMapping(value = "/getNodeBusinessTripList", method = RequestMethod.POST)
    public @ResponseBody
    DataResult getNodeBusinessTripList(String tenantId, String currentTime) {
        InvocationInfoProxy.setTenantid(tenantId);
        List<NodeBusinessTrip> nodeBusinessTripList = dataNodeBusinessTripService.getNodeBusinessTripList(currentTime);
        return DataResult.ok().put("data", nodeBusinessTripList);
    }
}
