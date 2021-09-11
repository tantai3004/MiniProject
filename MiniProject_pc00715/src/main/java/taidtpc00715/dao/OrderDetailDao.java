package taidtpc00715.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import taidtpc00715.entity.OrderDetail;

public interface OrderDetailDao extends JpaRepository<OrderDetail, Long>{

}
