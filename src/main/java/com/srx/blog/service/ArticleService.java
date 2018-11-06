package com.srx.blog.service;

import com.github.pagehelper.Page;
import com.srx.blog.domain.Article;

public interface ArticleService {

    Page<Article> getArticlePages(Article article, Integer pageNum, Integer pageSize);

    int createArticle(Article article);

    Article getArticleById(String id);

    int updateArticle(Article article);
}
