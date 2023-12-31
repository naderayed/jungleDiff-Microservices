package com.junglediff.articles.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer articleId;
    String articleTitle;
    String articleContent;
    LocalDate creationDate;
    String articleImage;
}
