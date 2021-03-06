package taidtpc00715.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import taidtpc00715.dao.AccountDao;
import taidtpc00715.dao.AuthorityDao;
import taidtpc00715.entity.Account;
import taidtpc00715.entity.Authority;
import taidtpc00715.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService{

	@Autowired
	AuthorityDao authorityDao;
	@Autowired
	AccountDao accountDao;



	@Override
	public List<Authority> findAll() {
		return authorityDao.findAll();
	}

	@Override
	public Authority create(Authority auth) {
		return authorityDao.save(auth);
	}


	@Override
	public void delete(Integer id) {
		authorityDao.deleteById(id);
		
	}

	@Override
	public void createe(Authority authority) {
		authorityDao.save(authority);
		
	}

	@Override
	public Authority create1(Authority authority) {
		// TODO Auto-generated method stub
		return authorityDao.save(authority);
	}

	@Override
	public void delete(String username) {
		authorityDao.deleteByUsername(username);
		
	}

	@Override
	public void deleteRole(String role) {
		authorityDao.deleteByRole(role);
		
	}

	@Override
	public List<Authority> getAuthoritiesOfAdministators() {
		List<Account> accounts = accountDao.getAdministrators();
		return authorityDao.authoritiesOf(accounts);
	}
	
}
