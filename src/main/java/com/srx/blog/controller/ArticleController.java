package com.srx.blog.controller;

import com.github.pagehelper.Page;

import com.srx.blog.domain.Article;
import com.srx.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jane
 * @date 2018年9月29日10:35:06
 */
    @RequestMapping("ArticleController")
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/getArticlePages")
    public Page<Article> getArticlePages(Article article, Integer pageNum, Integer pageSize){
        Page<Article> articlePages = articleService.getArticlePages(article,pageNum,pageSize);
        return  articlePages;
    }

    @RequestMapping(value = "/createArticle")
    public int createArticle(Article article){
        return articleService.createArticle(article);
    }

    @RequestMapping(value = "/updateArticle")
    public int updateArticle(Article article){
        return articleService.updateArticle(article);
    }

    @RequestMapping(value = "/getArticleById")
    public Article getArticleById(String id){
        return articleService.getArticleById(id);
    }
}
