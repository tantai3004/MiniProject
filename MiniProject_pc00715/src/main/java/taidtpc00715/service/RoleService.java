package taidtpc00715.service;

import java.util.List;

import taidtpc00715.entity.Role;


public interface RoleService {

	List<Role> findAll();

	Role findById(String string);

	Role create(Role role);

	Role update(Role role);

	void delete(String id);

}
