package cn.springmvc.service;

import cn.springmvc.model.City;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import com.google.gson.Gson;

/**
 * CityServiceTest
 * cn.springmvc.service
 *
 * @author xiaoyy
 * @description
 * @create 2016-11-30 上午11:30
 * The word 'impossible' is not in my dictionary.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = ("classpath:spring-mybatis.xml"))
public class CityServiceTest {
    private static Logger logger = Logger.getLogger(CityServiceTest.class);
    @Resource
    private CityService cityService;

    @Test
    public void test(){
        Gson gson = new Gson();
        City city = cityService.getCityByCode("01");
        logger.info(gson.toJson(city));
    }
}
