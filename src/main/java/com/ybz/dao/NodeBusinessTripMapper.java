package com.ybz.dao;

import com.ybz.entity.NodeBusinessTrip;
import com.ybz.entity.NodeBusinessTripExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeBusinessTripMapper {
    int countByExample(NodeBusinessTripExample example);

    int deleteByExample(NodeBusinessTripExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NodeBusinessTrip record);

    int insertSelective(NodeBusinessTrip record);

    List<NodeBusinessTrip> selectByExampleWithBLOBs(NodeBusinessTripExample example);

    List<NodeBusinessTrip> selectByExample(NodeBusinessTripExample example);

    NodeBusinessTrip selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NodeBusinessTrip record, @Param("example") NodeBusinessTripExample example);

    int updateByExampleWithBLOBs(@Param("record") NodeBusinessTrip record, @Param("example") NodeBusinessTripExample example);

    int updateByExample(@Param("record") NodeBusinessTrip record, @Param("example") NodeBusinessTripExample example);

    int updateByPrimaryKeySelective(NodeBusinessTrip record);

    int updateByPrimaryKeyWithBLOBs(NodeBusinessTrip record);

    int updateByPrimaryKey(NodeBusinessTrip record);
}