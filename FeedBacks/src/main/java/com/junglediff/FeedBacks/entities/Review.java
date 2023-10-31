package com.junglediff.FeedBacks.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Review")
public class Review {
    @Id
    private String id;
    private String carId;
    private String userId;
    private String comment;
    private String date;

    @DBRef
    Rating rating ;
}
