package com.ybz.controller;

import com.ybz.service.IDataNodeOtherService;
import com.ybz.utils.DataResult;
import com.yonyou.iuap.context.InvocationInfoProxy;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 其它记事
 *
 * @author zhangybt
 * @create 2017年08月05日 9:30
 **/
@RestController
@RequestMapping("/other")
public class DataNodeOtherController {

    @Resource(name = "dataNodeOtherServiceImpl")
    private IDataNodeOtherService nodeOtherService;

    @RequestMapping(value = "/getOtherList", method = RequestMethod.GET)
    public DataResult getOtherList(String tenantId, String currentTime) {
        InvocationInfoProxy.setTenantid(tenantId);
        return DataResult.ok().put("data", nodeOtherService.getOtherList(currentTime));
    }

    @RequestMapping(value = "getTravelCount",method = RequestMethod.POST)
    public DataResult getTravelCount(@RequestBody Map<String, String> map){
        int totalCount = nodeOtherService.countByExample(map.get("beginTime"),map.get("endTime"));
        return DataResult.ok().put("data",totalCount);
    }

}
