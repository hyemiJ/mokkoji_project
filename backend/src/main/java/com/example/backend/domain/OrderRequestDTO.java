package com.example.backend.domain;

import java.util.List;

import com.example.backend.entity.login.Address;
import com.example.backend.entity.orders.Orders;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderRequestDTO {
	private List<Address> addressList;
	private Orders order ;
	private List<CartDTO> cartList;
	private Address purchaseAddress;
}
