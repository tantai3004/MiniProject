package taidtpc00715.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import taidtpc00715.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	@Query("SELECT o FROM Product o WHERE o.category.id=?1")
	Page<Product> findByCategoryId(String cid, Pageable pageable);


} 	
