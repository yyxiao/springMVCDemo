package cn.springmvc.service.impl;

import cn.springmvc.dao.CityMapper;
import cn.springmvc.model.City;
import cn.springmvc.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * CityServiceImpl
 * cn.springmvc.service.impl
 *
 * @author xiaoyy
 * @description
 * @create 2016-11-30 上午11:23
 * The word 'impossible' is not in my dictionary.
 */

@Service("cityService")
public class CityServiceImpl implements CityService{
    @Resource
    private CityMapper cityMapper;

    public CityServiceImpl() {
    }

    public City getCityByCode(String code) {
        return this.cityMapper.selectByPrimaryKey(code);
    }
}
