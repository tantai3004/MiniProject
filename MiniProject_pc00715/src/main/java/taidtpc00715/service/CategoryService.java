package taidtpc00715.service;

import java.util.List;

import taidtpc00715.entity.Category;

public interface CategoryService {

	List<Category> findAll();

	Category create(Category category);

	Category update(Category category);

	void delete(String id);

}
