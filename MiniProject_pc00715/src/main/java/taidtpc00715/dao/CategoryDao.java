package taidtpc00715.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import taidtpc00715.entity.Category;

public interface CategoryDao extends JpaRepository<Category, String>{

}
