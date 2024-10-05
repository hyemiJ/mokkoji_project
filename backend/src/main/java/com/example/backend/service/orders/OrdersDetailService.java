package com.example.backend.service.orders;

import java.util.List;

import com.example.backend.domain.CartDTO;
import com.example.backend.entity.orders.OrdersDetail;

public interface OrdersDetailService {

	List<OrdersDetail> ordersDetail(int purchaseNumber);
	
	void insertDtoList (List<CartDTO> list , int purchaseNumber);

}
