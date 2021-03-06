package taidtpc00715.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import taidtpc00715.dao.OrderDao;
import taidtpc00715.dao.OrderDetailDao;
import taidtpc00715.entity.Order;
import taidtpc00715.entity.OrderDetail;
import taidtpc00715.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderDao oDao;
	@Autowired
	OrderDetailDao dDao;

	@Override
	public Order create(JsonNode orderData) {
		ObjectMapper mapper = new ObjectMapper();
		
		Order order = mapper.convertValue(orderData, Order.class);
		oDao.save(order);
		
		TypeReference<List<OrderDetail>> type = new TypeReference<List<OrderDetail>>() {};
		List<OrderDetail> details = mapper.convertValue(orderData.get("orderDetails"), type)
				.stream().peek(d -> d.setOrder(order)).collect(Collectors.toList());
		
		dDao.saveAll(details);
		
		return order;
	}
	
	@Override
	public Object findById(Long id) {
		return oDao.findById(id).get();
	}

	@Override
	public List<Order> findByUsername(String username) {
		return oDao.findByUsername(username);
	}

	
}
