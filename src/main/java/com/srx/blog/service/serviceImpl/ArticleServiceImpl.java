package com.srx.blog.service.serviceImpl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.srx.blog.domain.Article;
import com.srx.blog.mapper.ArticleMapper;
import com.srx.blog.service.ArticleService;
import com.srx.blog.utils.DistributedIdGen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private DistributedIdGen distributedIdGen;

    @Override
    public Page<Article> getArticlePages(Article article, Integer pageNum, Integer pageSize) {
        Page<Article> page = PageHelper.startPage(pageNum,pageSize);
        List<Article> list = articleMapper.selectArticleOW(article);
        return page;
    }

    @Override
    public int createArticle(Article article) {
        article.setId(distributedIdGen.getId());
        article.setTimestamp(System.currentTimeMillis());
        article.setIsEffective(1);
        return articleMapper.insertSelective(article);
    }

    @Override
    public Article getArticleById(Long id) {
        Article article = articleMapper.selectArticleById(id);
        return article;
    }

    @Override
    public int updateArticle(Article article) {
        return articleMapper.updateByPrimaryKeySelective(article);
    }
}
