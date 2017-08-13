package com.ybz.dao;

import com.ybz.entity.NodeGather;
import com.ybz.entity.NodeGatherExample;
import com.ybz.entity.NodeGatherWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeGatherMapper {
    int countByExample(NodeGatherExample example);

    int deleteByExample(NodeGatherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NodeGatherWithBLOBs record);

    int insertSelective(NodeGatherWithBLOBs record);

    List<NodeGatherWithBLOBs> selectByExampleWithBLOBs(NodeGatherExample example);

    List<NodeGather> selectByExample(NodeGatherExample example);

    NodeGatherWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NodeGatherWithBLOBs record, @Param("example") NodeGatherExample example);

    int updateByExampleWithBLOBs(@Param("record") NodeGatherWithBLOBs record, @Param("example") NodeGatherExample example);

    int updateByExample(@Param("record") NodeGather record, @Param("example") NodeGatherExample example);

    int updateByPrimaryKeySelective(NodeGatherWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NodeGatherWithBLOBs record);

    int updateByPrimaryKey(NodeGather record);

    Double queryMoneyByDate(NodeGatherExample example);
}