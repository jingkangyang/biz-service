package com.yjk.biz.mapper;



import com.yjk.biz.domain.Appl;

public interface ApplMapper {

    int insert(Appl record);

    int insertSelective(Appl record);
    
    Appl select(String applCde);

}