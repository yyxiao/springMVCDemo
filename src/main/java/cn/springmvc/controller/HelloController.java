package cn.springmvc.controller;

import cn.springmvc.model.City;
import cn.springmvc.service.CityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * HelloController
 * cn.springmvc.controller
 *
 * @author xiaoyy
 * @description
 * @create 2016-11-28 下午3:35
 * The word 'impossible' is not in my dictionary.
 */

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Resource
    private CityService cityService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(HttpServletRequest request, ModelMap modelMap){
        String code = request.getParameter("code");
        City city = cityService.getCityByCode(code);
        modelMap.addAttribute("city", city);
        modelMap.addAttribute("message", "Hello world");
        return "index";
    }
}
