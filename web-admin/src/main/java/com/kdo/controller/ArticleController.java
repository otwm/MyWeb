package com.kdo.controller;

import com.kdo.article.domain.Article;
import com.kdo.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * 게시물 콘트롤러
 * Created by kdo on 2015-12-15.
 */
@Controller
@RequestMapping("/articles")
public class ArticleController {

    @Resource
    private ArticleRepository articleRepository;

    /**
     * 리스트
     *
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    String list(Model model, @PageableDefault(sort = {"id"}, value = 10, direction = Sort.Direction.DESC) Pageable pageable) {
        model.addAttribute("items", articleRepository.findAll(pageable));
        return "article/articleList";
    }

    /**
     * 폼
     *
     * @param model
     * @return
     */
    @RequestMapping("/form")
    String creatForm(Model model) {
        model.addAttribute("article", new Article());
        return "article/articleForm";
    }

    /**
     * 수정 폼
     *
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/{id}/form")
    String editform(Model model, @PathVariable(value = "id") Long id) {
        model.addAttribute("article", articleRepository.findOne(id));
        return "article/articleForm";
    }

    /**
     * 저장
     *
     * @param article
     * @param bindingResult
     * @return
     */
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    String save(Article article, BindingResult bindingResult) {
        articleRepository.save(article);
        return "redirect:/articles";
    }

    /**
     * 삭제
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    String delete(@PathVariable("id") Long id) {
        articleRepository.delete(id);
        return "redirect:/articles";
    }
}
