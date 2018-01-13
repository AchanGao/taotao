package com.taotao.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 欢迎页面
 * @author gyx
 * @version 1.0
 * @description com.taotao.manager.controller
 * @date 2018/1/10
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("{pageName}")
    public String pageController(@PathVariable("pageName") String pageName){
        return pageName;
    }

}
