package com.junglediff.FeedBacks.repositories;

import com.junglediff.FeedBacks.entities.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeedBackRepository extends MongoRepository<Review,String> {

}
