package com.junglediff.FeedBacks.repositories;

import com.junglediff.FeedBacks.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedBackRepository extends JpaRepository<Review,Long> {

}
