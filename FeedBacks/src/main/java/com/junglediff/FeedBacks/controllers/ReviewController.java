package com.junglediff.FeedBacks.controllers;

import com.junglediff.FeedBacks.entities.Review;
import com.junglediff.FeedBacks.services.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Review/")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;
    @PostMapping
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }

    @GetMapping("{id}")
    public Review getReviewById(@PathVariable long id) {
        return reviewService.getReviewById(id);
    }

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReview();
    }

    @PutMapping
    public Review updateReview(@RequestBody Review updatedReview) {
        return reviewService.updateReview(updatedReview);
    }
    @DeleteMapping("{id}")
    public void deleteReview(@PathVariable long id) {
        reviewService.deleteReview(id);
    }
}
