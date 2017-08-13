package com.ybz.dao;

import com.ybz.entity.NodeOther;
import com.ybz.entity.NodeOtherExample;
import com.ybz.entity.NodeOtherWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeOtherMapper {
    int countByExample(NodeOtherExample example);

    int deleteByExample(NodeOtherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NodeOtherWithBLOBs record);

    int insertSelective(NodeOtherWithBLOBs record);

    List<NodeOtherWithBLOBs> selectByExampleWithBLOBs(NodeOtherExample example);

    List<NodeOther> selectByExample(NodeOtherExample example);

    NodeOtherWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NodeOtherWithBLOBs record, @Param("example") NodeOtherExample example);

    int updateByExampleWithBLOBs(@Param("record") NodeOtherWithBLOBs record, @Param("example") NodeOtherExample example);

    int updateByExample(@Param("record") NodeOther record, @Param("example") NodeOtherExample example);

    int updateByPrimaryKeySelective(NodeOtherWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NodeOtherWithBLOBs record);

    int updateByPrimaryKey(NodeOther record);

    Double queryMoneyByDate(NodeOtherExample example);
}