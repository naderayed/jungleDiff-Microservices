package com.junglediff.articles.repositories;

import com.junglediff.articles.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticlesRepository extends JpaRepository<Article,Integer> {

}
