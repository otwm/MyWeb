package com.kdo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kdo on 2015-12-23.
 */
@Controller
@RequestMapping("/photos")
public class PhotoController {
    @RequestMapping(method = RequestMethod.GET)
    String list(Model model) {
        return "article/articleList";
    }
}
