package com.junglediff.articles.services;

import com.junglediff.articles.entities.Article;
import com.junglediff.articles.repositories.ArticlesRepository;
import com.junglediff.notification.NotificationClient;
import com.junglediff.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class ArticleServiceImp implements ArticleService {
    private final ArticlesRepository articleRepository;
    private final NotificationClient notificationClient;

    @Override
    public Article addArticle(Article article) {
        try {
            article.setCreationDate(LocalDate.now());
            Article savedArticle = articleRepository.saveAndFlush(article);
            notificationClient.sendNotification(
                    new NotificationRequest(
                            savedArticle.getArticleId(),
                            savedArticle.getArticleTitle(),
                            String.format("New article to junglediff : %s", savedArticle.getArticleTitle())
                    )
            );
            return savedArticle;
        }   catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Article updateArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article getArticleById(Integer id) {
        return articleRepository.findById(id)
                .orElse(Article.builder().articleContent("No such article").build());
    }

    @Override
    public List<Article> getAllArticle() {
        return articleRepository.findAll();
    }

    @Override
    public void deleteArticle(Integer articleId) {
         articleRepository.deleteById(articleId);
    }
}
