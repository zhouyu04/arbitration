package com.yrkj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/1/29 0029.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){

        System.out.println("coming...");
        return "success";
    }
}
