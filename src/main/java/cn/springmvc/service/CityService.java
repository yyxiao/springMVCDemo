package cn.springmvc.service;

import cn.springmvc.model.City;

/**
 * CityService
 * cn.springmvc.service
 *
 * @author xiaoyy
 * @description
 * @create 2016-11-30 上午11:21
 * You have to believe in yourself. That‘s the secret of success.
 */
public interface CityService {
    City getCityByCode(String code);
}
