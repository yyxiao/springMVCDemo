package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(HttpServletRequest request, ModelMap modelMap){
        String code = request.getParameter("code");
        modelMap.addAttribute("message", "Hello world");
        return "index";
    }
}
