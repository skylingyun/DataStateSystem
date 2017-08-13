package com.ybz.dao;

import com.ybz.entity.NcUser;
import com.ybz.entity.NcUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcUserMapper {
    int countByExample(NcUserExample example);

    int deleteByExample(NcUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NcUser record);

    int insertSelective(NcUser record);

    List<NcUser> selectByExample(NcUserExample example);

    NcUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NcUser record, @Param("example") NcUserExample example);

    int updateByExample(@Param("record") NcUser record, @Param("example") NcUserExample example);

    int updateByPrimaryKeySelective(NcUser record);

    int updateByPrimaryKey(NcUser record);

}