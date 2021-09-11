package taidtpc00715.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import taidtpc00715.dao.CategoryDao;
import taidtpc00715.entity.Category;
import taidtpc00715.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryDao cDao;

	@Override
	public List<Category> findAll() {
		return cDao.findAll();
	}

	@Override
	public Category create(Category category) {
		return cDao.save(category);
	}

	@Override
	public Category update(Category category) {
		return cDao.save(category);
	}

	@Override
	public void delete(String id) {
		cDao.deleteById(id);
		
	}
}
