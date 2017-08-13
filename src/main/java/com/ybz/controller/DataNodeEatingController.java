package com.ybz.controller;

import com.ybz.entity.NodeEating;
import com.ybz.service.IDataNodeEatingService;
import com.ybz.utils.DataResult;
import com.yonyou.iuap.context.InvocationInfoProxy;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 餐饮记事
 *
 * @author zhangybt
 * @create 2017年08月04日 16:14
 **/
@RestController
@RequestMapping("/eating")
public class DataNodeEatingController {

    @Resource(name = "dataNodeEatingServiceImpl")
    private IDataNodeEatingService nodeEatingService;

    @RequestMapping(value = "/eatingList", method = RequestMethod.GET)
    public DataResult getEatingList(String tenantId, String currentTime) {
        InvocationInfoProxy.setTenantid(tenantId);
        List<NodeEating> eatingList = nodeEatingService.getNodeEatingList(currentTime);
        return DataResult.ok().put("data", eatingList);
    }

    @RequestMapping(value = "getTravelCount",method = RequestMethod.POST)
    public DataResult getTravelCount(@RequestBody Map<String, String> map){
        int totalCount = nodeEatingService.countByExample(map.get("beginTime"),map.get("endTime"));
        return DataResult.ok().put("data",totalCount);
    }
}
