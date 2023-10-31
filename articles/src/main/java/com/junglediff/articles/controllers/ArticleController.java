package com.junglediff.articles.controllers;

import com.junglediff.articles.entities.Article;
import com.junglediff.articles.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/articles/")
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("{articleId}")
    public ResponseEntity<Article> getArticleById(@PathVariable(name = "articleId") Integer articleId){
        return ResponseEntity.ok(articleService.getArticleById(articleId));
    }

    @GetMapping()
    public ResponseEntity<List<Article>> getAllArticle(){
        return ResponseEntity.ok(articleService.getAllArticle());
    }

    @PostMapping
    public ResponseEntity<Article> addArticle(@RequestBody Article article){
        return ResponseEntity.ok(articleService.addArticle(article));
    }

    @PatchMapping
    public ResponseEntity<Article> updateArticle(@RequestBody Article article){
        return ResponseEntity.ok(articleService.updateArticle(article));
    }

    @DeleteMapping
    public ResponseEntity<String> addArticle(@RequestParam Integer articleId){
        articleService.deleteArticle(articleId);
        return ResponseEntity.ok("Article deleted successfully");
    }
}
