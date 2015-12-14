package com.kdo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kdo on 2015-12-15.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    @RequestMapping(method = RequestMethod.GET)
    String list() {
        return "article/articleList";
    }
}
