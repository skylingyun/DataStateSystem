package com.ybz.controller;

import com.ybz.entity.NodeTravel;
import com.ybz.service.IDataNodeTravelService;
import com.ybz.utils.DataResult;
import com.ybz.utils.PageUtils;
import com.yonyou.iuap.context.InvocationInfoProxy;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * 出行记事
 *
 * @author zhangybt
 * @create 2017年08月04日 10:16
 **/
@RestController
@RequestMapping("/travel")
public class DataNodeTravelController {

    @Resource(name = "dataNodeTravelServiceImpl")
    private IDataNodeTravelService nodeTravelService;

    @RequestMapping(value = "/getTravelList", method = RequestMethod.POST)
    public DataResult getTravelList(@RequestBody Map<String, String> map) {//String tenantId, String currentTime,Integer pageSize, Integer currPage
        InvocationInfoProxy.setTenantid(map.get("tenantId"));
        List<NodeTravel> nodeTravelList = nodeTravelService.getNodeTravelList(map.get("currentTime"), Integer.parseInt(map.get("totalPage")), Integer.parseInt(map.get("activePage")));
        int totalCount = nodeTravelService.countByExample(map.get("beginTime"), map.get("endTime"));
        PageUtils pageUtils = new PageUtils(nodeTravelList, totalCount, Integer.parseInt(map.get("totalPage")), Integer.parseInt(map.get("activePage")));
        return DataResult.ok().put("data", pageUtils);
    }

    @RequestMapping(value = "getTravelCount", method = RequestMethod.POST)
    public DataResult getTravelCount(@RequestBody Map<String, String> map) {
        int totalCount = nodeTravelService.countByExample(map.get("beginTime"), map.get("endTime"));
        return DataResult.ok().put("data", totalCount);
    }

}
