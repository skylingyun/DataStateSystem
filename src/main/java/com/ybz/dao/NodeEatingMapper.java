package com.ybz.dao;

import com.ybz.entity.NodeEating;
import com.ybz.entity.NodeEatingExample;
import com.ybz.entity.NodeEatingWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeEatingMapper {
    int countByExample(NodeEatingExample example);

    int deleteByExample(NodeEatingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NodeEatingWithBLOBs record);

    int insertSelective(NodeEatingWithBLOBs record);

    List<NodeEatingWithBLOBs> selectByExampleWithBLOBs(NodeEatingExample example);

    List<NodeEating> selectByExample(NodeEatingExample example);

    NodeEatingWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NodeEatingWithBLOBs record, @Param("example") NodeEatingExample example);

    int updateByExampleWithBLOBs(@Param("record") NodeEatingWithBLOBs record, @Param("example") NodeEatingExample example);

    int updateByExample(@Param("record") NodeEating record, @Param("example") NodeEatingExample example);

    int updateByPrimaryKeySelective(NodeEatingWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NodeEatingWithBLOBs record);

    int updateByPrimaryKey(NodeEating record);

    Double queryMoneyByDate(NodeEatingExample example);
}