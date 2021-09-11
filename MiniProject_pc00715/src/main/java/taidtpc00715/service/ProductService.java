package taidtpc00715.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import taidtpc00715.entity.Product;

public interface ProductService {


	Product findById(Integer id);

	Page<Product> findByCategoryId(String cid, Pageable pageable);

	Product create(Product product);

	Product update(Product product);

	void delete(Integer id);

	Page<Product> findAll2(Pageable pageable);

	List<Product> findAll();

}
