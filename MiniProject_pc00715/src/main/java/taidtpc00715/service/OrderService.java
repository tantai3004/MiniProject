package taidtpc00715.service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import taidtpc00715.entity.Order;

public interface OrderService {

	Order create(JsonNode orderData);

	List<Order> findByUsername(String username);

	Object findById(Long id);


	
}
