package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
@RequestMapping("/")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap modelMap){
        modelMap.addAttribute("message", "Hello world");
        return "index";
    }
}
