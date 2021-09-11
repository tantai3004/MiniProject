package taidtpc00715.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import taidtpc00715.dao.ProductDao;
import taidtpc00715.entity.Product;
import taidtpc00715.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao pDao;

	@Override
	public List<Product> findAll() {
		return pDao.findAll();
	}

	@Override
	public Product findById(Integer id) {

		return pDao.findById(id).get();
	}

	
	@Override
	public Product create(Product product) {
		return pDao.save(product);
	}

	@Override
	public Product update(Product product) {
		return pDao.save(product);
	}

	@Override
	public void delete(Integer id) {
		pDao.deleteById(id);
	}

	@Override
	public Page<Product> findByCategoryId(String cid, Pageable pageable) {
		return pDao.findByCategoryId(cid, pageable);
		
	}


	@Override
	public Page<Product> findAll2(Pageable pageable) {
		// TODO Auto-generated method stub
		return pDao.findAll(pageable);
	}
}
