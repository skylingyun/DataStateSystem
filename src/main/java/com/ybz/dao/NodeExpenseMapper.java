package com.ybz.dao;

import com.ybz.entity.NodeExpense;
import com.ybz.entity.NodeExpenseExample;
import com.ybz.entity.NodeExpenseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeExpenseMapper {
    int countByExample(NodeExpenseExample example);

    int deleteByExample(NodeExpenseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NodeExpenseWithBLOBs record);

    int insertSelective(NodeExpenseWithBLOBs record);

    List<NodeExpenseWithBLOBs> selectByExampleWithBLOBs(NodeExpenseExample example);

    List<NodeExpense> selectByExample(NodeExpenseExample example);

    NodeExpenseWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NodeExpenseWithBLOBs record, @Param("example") NodeExpenseExample example);

    int updateByExampleWithBLOBs(@Param("record") NodeExpenseWithBLOBs record, @Param("example") NodeExpenseExample example);

    int updateByExample(@Param("record") NodeExpense record, @Param("example") NodeExpenseExample example);

    int updateByPrimaryKeySelective(NodeExpenseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NodeExpenseWithBLOBs record);

    int updateByPrimaryKey(NodeExpense record);
}