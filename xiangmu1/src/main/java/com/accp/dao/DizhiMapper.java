package com.accp.dao;

import com.accp.domain.Dizhi;
import com.accp.domain.DizhiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DizhiMapper {
    int countByExample(DizhiExample example);

    int deleteByExample(DizhiExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Dizhi record);

    int insertSelective(Dizhi record);

    List<Dizhi> selectByExample(DizhiExample example);

    Dizhi selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Dizhi record, @Param("example") DizhiExample example);

    int updateByExample(@Param("record") Dizhi record, @Param("example") DizhiExample example);

    int updateByPrimaryKeySelective(Dizhi record);

    int updateByPrimaryKey(Dizhi record);
}