package com.ybz.dao;

import com.ybz.entity.NodeLoanBill;
import com.ybz.entity.NodeLoanBillExample;
import com.ybz.entity.NodeLoanBillWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeLoanBillMapper {
    int countByExample(NodeLoanBillExample example);

    int deleteByExample(NodeLoanBillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NodeLoanBillWithBLOBs record);

    int insertSelective(NodeLoanBillWithBLOBs record);

    List<NodeLoanBillWithBLOBs> selectByExampleWithBLOBs(NodeLoanBillExample example);

    List<NodeLoanBill> selectByExample(NodeLoanBillExample example);

    NodeLoanBillWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NodeLoanBillWithBLOBs record, @Param("example") NodeLoanBillExample example);

    int updateByExampleWithBLOBs(@Param("record") NodeLoanBillWithBLOBs record, @Param("example") NodeLoanBillExample example);

    int updateByExample(@Param("record") NodeLoanBill record, @Param("example") NodeLoanBillExample example);

    int updateByPrimaryKeySelective(NodeLoanBillWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NodeLoanBillWithBLOBs record);

    int updateByPrimaryKey(NodeLoanBill record);
}