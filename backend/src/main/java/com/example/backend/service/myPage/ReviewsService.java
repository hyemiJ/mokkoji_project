package com.example.backend.service.myPage;

import com.example.backend.domain.ReviewsDTO;
import com.example.backend.entity.myPage.Reviews;

import java.util.List;

public interface ReviewsService {

	List<Reviews> productReviews(long productId);

	List<ReviewsDTO> userReviews(String userId);

	void insertReviews(Reviews reviews);

	void updateReviews(int reviewId, String reviewContent);

	void deleteReviews(int reviewId);

}
