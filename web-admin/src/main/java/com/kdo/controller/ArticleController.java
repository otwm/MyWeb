package com.kdo.controller;

import com.kdo.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by kdo on 2015-12-15.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    @Resource
    private ArticleRepository articleRepository;

    @RequestMapping(method = RequestMethod.GET)
    String find(Model model) {
        model.addAttribute("articles", articleRepository.findAll());
        return "article/articleList";
    }
}
