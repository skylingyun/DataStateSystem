package com.ybz.controller;

import com.ybz.service.IDataBillsService;
import com.ybz.utils.DataResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 所有单据的接口
 * Created by Guoru on 2017/8/10.
 */
@RestController
@RequestMapping("/bills")
public class DataBillsController {
    @Resource(name = "dataBillsServiceImpl")
    private IDataBillsService dataBillsService;

    @RequestMapping(value = "/getBillsCount", method = RequestMethod.POST)
    public DataResult getBillsCount(@RequestBody Map<String, String> map) {
        String beginTime = map.get("beginTime");
        String endTime = map.get("endTime");
        List<Map<String,Integer>> list = dataBillsService.getDataBillsPage(beginTime, endTime);
        return DataResult.ok().put("data", list);
    }
}
