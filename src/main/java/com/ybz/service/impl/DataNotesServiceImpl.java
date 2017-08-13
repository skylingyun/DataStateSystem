package com.ybz.service.impl;

import com.ybz.entity.NodeNotes;
import com.ybz.service.*;
import com.ybz.utils.DataBaseUtils;
import com.yonyou.iuap.context.InvocationInfoProxy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * 所有记事实现类
 *
 * @author zhangybt
 * @create 2017年08月09日 19:31
 **/
@Service
public class DataNotesServiceImpl implements IDataNotesService {

    @Resource(name = "dataNodeEatingServiceImpl")
    private IDataNodeEatingService nodeEatingService;

    @Resource(name = "dataNodeGatherServiceImpl")
    private IDataNodeGatherService nodeGatherService;

    @Resource(name = "dataNodeHotelServiceImpl")
    private IDataNodeHotelService nodeHotelService;

    @Resource(name = "dataNodeOtherServiceImpl")
    private IDataNodeOtherService nodeOtherService;

    @Resource(name = "dataNodeTravelServiceImpl")
    private IDataNodeTravelService nodeTravelService;

    public List<List<NodeNotes>> getDataNotesPage(String beginTime, String endTime) {
        List<List<NodeNotes>> notesLists = new ArrayList<List<NodeNotes>>();
        try {
            List<String> dataBasesList = DataBaseUtils.queryDataBasesList();
            for (int i = 0; i < dataBasesList.size(); i++) {
                if (dataBasesList.get(i).length() != 8) {
                    continue;
                }
                InvocationInfoProxy.setTenantid(dataBasesList.get(i));
                List<NodeNotes> nodeNotesList = queryNotesByTenantId(beginTime, endTime, dataBasesList.get(i));
                notesLists.add(nodeNotesList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return notesLists;
    }

    private List<NodeNotes> queryNotesByTenantId(String beginTime, String endTime, String tenantId) {
        NodeNotes nodeNotes = new NodeNotes();
        List<NodeNotes> list = new LinkedList<NodeNotes>();
        int travelCount = nodeTravelService.countByExample(beginTime, endTime);
        Double travelMoney = nodeTravelService.queryMoneyByDate(beginTime, endTime);
        int eatingCount = nodeEatingService.countByExample(beginTime, endTime);
        Double eatingMoney = nodeEatingService.queryMoneyByDate(beginTime, endTime);
        int gatherCount = nodeGatherService.countByExample(beginTime, endTime);
        Double gatherMoney = nodeGatherService.queryMoneyByDate(beginTime, endTime);
        int hotelCount = nodeHotelService.countByExample(beginTime, endTime);
        Double hotelMoney = nodeHotelService.queryMoneyByDate(beginTime, endTime);
        int otherCount = nodeOtherService.countByExample(beginTime, endTime);
        Double otherMoney = nodeOtherService.queryMoneyByDate(beginTime, endTime);
        Double totalMoney = travelMoney + eatingMoney + gatherMoney + hotelMoney + otherMoney;
        nodeNotes.setTenantId(tenantId);
        nodeNotes.setTravel(travelCount);
        nodeNotes.setTravelMoney(travelMoney);
        nodeNotes.setEating(eatingCount);
        nodeNotes.setEatingMoney(eatingMoney);
        nodeNotes.setGather(gatherCount);
        nodeNotes.setGatherMoney(gatherMoney);
        nodeNotes.setHotel(hotelCount);
        nodeNotes.setHotelMoney(hotelMoney);
        nodeNotes.setOther(otherCount);
        nodeNotes.setOtherMoney(otherMoney);
        nodeNotes.setTotalMoney(totalMoney);
        list.add(nodeNotes);
        return list;
    }


}
