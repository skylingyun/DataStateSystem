package com.ybz.dao;

import com.ybz.entity.NodeTravel;
import com.ybz.entity.NodeTravelExample;
import com.ybz.entity.NodeTravelWithBLOBs;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeTravelMapper {
    int countByExample(NodeTravelExample example);

    int deleteByExample(NodeTravelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NodeTravelWithBLOBs record);

    int insertSelective(NodeTravelWithBLOBs record);

    List<NodeTravelWithBLOBs> selectByExampleWithBLOBs(NodeTravelExample example);

    List<NodeTravel> selectByExample(NodeTravelExample example);

    NodeTravelWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NodeTravelWithBLOBs record, @Param("example") NodeTravelExample example);

    int updateByExampleWithBLOBs(@Param("record") NodeTravelWithBLOBs record, @Param("example") NodeTravelExample example);

    int updateByExample(@Param("record") NodeTravel record, @Param("example") NodeTravelExample example);

    int updateByPrimaryKeySelective(NodeTravelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NodeTravelWithBLOBs record);

    int updateByPrimaryKey(NodeTravel record);

    Double queryMoneyByDate(NodeTravelExample example);
}