package com.example.backend.repository.orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.entity.orders.OrdersDetail;
import com.example.backend.entity.orders.OrdersDetailId;

import java.util.List;

@Repository
public interface OrdersDetailRepository extends JpaRepository<OrdersDetail, OrdersDetailId> {

	// purchaseNumber에 대해 상세정보 조회
	List<OrdersDetail> findByPurchaseNumberOrderByProductId(int purchaseNumber);

}
