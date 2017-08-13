package com.ybz.controller;

import com.ybz.entity.NodeHotel;
import com.ybz.service.IDataNodeHotelService;
import com.ybz.utils.DataResult;
import com.ybz.utils.PageUtils;
import com.yonyou.iuap.context.InvocationInfoProxy;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 住宿记事
 *
 * @author zhangybt
 * @create 2017年08月05日 10:13
 **/
@RestController
@RequestMapping("/hotel")
public class DataNodeHotelController {

    @Resource(name = "dataNodeHotelServiceImpl")
    private IDataNodeHotelService dataNodeHotelService;

    @RequestMapping(value = "/getHotelList", method = RequestMethod.POST)
    public DataResult getHotelList(@RequestBody Map<String,String> map) {
        InvocationInfoProxy.setTenantid(map.get("tenantId"));
        List<NodeHotel> nodeTravelList = dataNodeHotelService.getNodeHotelList(map.get("currentTime"), Integer.parseInt(map.get("totalPage")), Integer.parseInt(map.get("activePage")));
        int totalCount = dataNodeHotelService.countByExample(map.get("beginTime"),map.get("endTime"));
        PageUtils pageUtils = new PageUtils(nodeTravelList,totalCount , Integer.parseInt(map.get("totalPage")), Integer.parseInt(map.get("activePage")));
        return DataResult.ok().put("data", pageUtils);
    }

    @RequestMapping(value = "/getHotelCount",method = RequestMethod.POST)
    public DataResult getHotelCount(@RequestBody Map<String,String> map){
        int totalCount = dataNodeHotelService.countByExample(map.get("beginTime"),map.get("endTime"));
        return DataResult.ok().put("data", totalCount);
    }

}
