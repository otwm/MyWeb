package com.kdo.controller;

import com.kdo.article.domain.Article;
import com.kdo.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by kdo on 2015-12-15.
 */
@Controller
@RequestMapping("/articles")
public class ArticleController {
    @Resource
    private ArticleRepository articleRepository;

    @RequestMapping(method = RequestMethod.GET)
    String list(Model model) {
        model.addAttribute("articles", articleRepository.findAll());
        return "article/articleList";
    }

    @RequestMapping("/form")
    String creatForm() {
        return "article/articleForm";
    }

    @RequestMapping("/{id}/form")
    String editform(Model model, @PathVariable(value = "id") Long id) {
        model.addAttribute("aritcle", articleRepository.findOne(id));
        return "article/articleForm";
    }

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    String save(Article article, BindingResult bindingResult) {
        articleRepository.save(article);
        return "redirect:/articles";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    String delete(@PathVariable("id") Long id) {
        articleRepository.delete(id);
        return "redirect:/articles";
    }
}
