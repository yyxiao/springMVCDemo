package cn.springmvc.service;

import cn.springmvc.model.Boohee;

import java.util.List;

/**
 * BooheeService
 * cn.springmvc.service.impl
 *
 * @author xiaoyy
 * @description springmvc获取数据
 * @create 2016-11-28 下午5:18
 * The word 'impossible' is not in my dictionary.
 */
public interface BooheeService {

    public List<Boohee> findBoohees() throws Exception;
}
