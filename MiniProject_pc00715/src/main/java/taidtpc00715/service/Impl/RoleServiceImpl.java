package taidtpc00715.service.Impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import taidtpc00715.dao.RoleDao;
import taidtpc00715.entity.Role;
import taidtpc00715.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleDao roleDao;


	public List<Role> findAll() {
		return roleDao.findAll();
	}


	@Override
	public Role findById(String string) {
		return roleDao.findById(string).get();
	}


	@Override
	public Role create(Role role) {
		return roleDao.save(role);
	}


	@Override
	public Role update(Role role) {
		return roleDao.save(role);
	}


	@Override
	public void delete(String id) {
		roleDao.deleteById(id);
		
	}
}
