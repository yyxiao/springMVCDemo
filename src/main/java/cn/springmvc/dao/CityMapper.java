package cn.springmvc.dao;

import cn.springmvc.model.City;

public interface CityMapper {
    int deleteByPrimaryKey(String code);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}