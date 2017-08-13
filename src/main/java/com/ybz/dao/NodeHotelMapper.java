package com.ybz.dao;

import com.ybz.entity.NodeHotel;
import com.ybz.entity.NodeHotelExample;
import com.ybz.entity.NodeHotelWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeHotelMapper {
    int countByExample(NodeHotelExample example);

    int deleteByExample(NodeHotelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NodeHotelWithBLOBs record);

    int insertSelective(NodeHotelWithBLOBs record);

    List<NodeHotelWithBLOBs> selectByExampleWithBLOBs(NodeHotelExample example);

    List<NodeHotel> selectByExample(NodeHotelExample example);

    NodeHotelWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NodeHotelWithBLOBs record, @Param("example") NodeHotelExample example);

    int updateByExampleWithBLOBs(@Param("record") NodeHotelWithBLOBs record, @Param("example") NodeHotelExample example);

    int updateByExample(@Param("record") NodeHotel record, @Param("example") NodeHotelExample example);

    int updateByPrimaryKeySelective(NodeHotelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NodeHotelWithBLOBs record);

    int updateByPrimaryKey(NodeHotel record);

    Double queryMoneyByDate(NodeHotelExample example);
}