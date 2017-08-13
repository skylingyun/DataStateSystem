package com.ybz.controller;

import com.ybz.service.IDataNodeGatherService;
import com.ybz.utils.DataResult;
import com.yonyou.iuap.context.InvocationInfoProxy;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 某记事
 *
 * @author zhangybt
 * @create 2017年08月05日 10:55
 **/
@RestController
@RequestMapping("/gather")
public class DataNodeGatherController {

    @Resource(name = "dataNodeGatherServiceImpl")
    private IDataNodeGatherService nodeGatherService;

    @RequestMapping(value = "/getGatherList", method = RequestMethod.GET)
    public DataResult getGatherList(String tenantId, String currentTime) {
        InvocationInfoProxy.setTenantid(tenantId);
        return DataResult.ok().put("data", nodeGatherService.getNodeGatherList(currentTime));
    }

    @RequestMapping(value = "getTravelCount",method = RequestMethod.POST)
    public DataResult getTravelCount(@RequestBody Map<String, String> map){
        int totalCount = nodeGatherService.countByExample(map.get("beginTime"),map.get("endTime"));
        return DataResult.ok().put("data",totalCount);
    }

}
