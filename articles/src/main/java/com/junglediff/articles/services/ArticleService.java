package com.junglediff.articles.services;

import com.junglediff.articles.entities.Article;

import java.util.List;

public interface ArticleService {
    Article addArticle(Article article);
    Article updateArticle(Article article);
    Article getArticleById(Integer id);
    List<Article> getAllArticle();
    void deleteArticle(Integer articleId);
}
