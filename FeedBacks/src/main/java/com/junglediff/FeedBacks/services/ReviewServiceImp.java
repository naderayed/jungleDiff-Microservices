package com.junglediff.FeedBacks.services;

import com.junglediff.FeedBacks.entities.Review;
import com.junglediff.FeedBacks.repositories.FeedBackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReviewServiceImp implements ReviewService{
    private final FeedBackRepository feedBackRepository;

    @Override
    public Review createReview(Review review) {
        return feedBackRepository.save(review);
    }

    @Override
    public Review getReviewById(String id) {
        return feedBackRepository.findById(id).orElse(null);
    }

    @Override
    public List<Review> getAllReview() {
        return feedBackRepository.findAll();
    }

    @Override
    public Review updateReview(Review review) {
        return feedBackRepository.save(review);
    }

    @Override
    public void deleteReview(String id) {
        feedBackRepository.deleteById(id);
    }
}
