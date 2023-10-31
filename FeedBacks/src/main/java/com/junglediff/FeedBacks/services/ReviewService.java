package com.junglediff.FeedBacks.services;

import com.junglediff.FeedBacks.entities.Review;

import java.util.List;

public interface ReviewService {
    Review createReview(Review review);
    Review getReviewById(String id);
    List<Review> getAllReview();

    Review updateReview(Review review);

    void  deleteReview(String id);
    // Add other CRUD methods
}
