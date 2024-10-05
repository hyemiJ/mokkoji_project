package com.example.backend.service.orders;

import com.example.backend.domain.OrderRequestDTO;
import com.example.backend.entity.orders.Orders;

import java.util.List;

public interface OrdersService {

	List<Orders> userOrders(String userId);

	Orders insertOrders(Orders entity);
	
	void buyList(OrderRequestDTO request);
}
