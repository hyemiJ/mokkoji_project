package com.example.backend.repository.myPage;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.backend.entity.myPage.Reviews;

import java.util.List;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Integer> {

	// review를 productId로 조회, 날짜순으로 내림차순
	List<Reviews> findByProductIdOrderByReviewDate(long productId);

	// review를 userId로 조회, 날짜순으로 내림차순
	List<Reviews> findByUserIdOrderByReviewDateDesc(String userId);

	// review 내용을 수정
	@Modifying
	@Transactional
	@Query("UPDATE Reviews AS r SET r.reviewContent = :reviewContent WHERE r.reviewId = :reviewId")
	void updateReview(@Param("reviewId") int reviewId, @Param("reviewContent") String reviewContent);

}
