package com.kdo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kdo on 2015-12-10.
 * main controller
 */
@Controller
public class MainController {

    /**
     * 메인 메서드
     *
     * @return
     */
    @RequestMapping("/")
    String home() {
        return "main";
    }
}
