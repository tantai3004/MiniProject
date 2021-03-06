package taidtpc00715.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import taidtpc00715.dao.AccountDao;
import taidtpc00715.entity.Account;
import taidtpc00715.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	AccountDao aDao;

	@Override
	public Account findById(String username) {
		return aDao.findById(username).get();
	}


	@Override
	public List<Account> findAll() {
		return aDao.findAll();
	}

	@Override
	public void create(Account account) {
		aDao.save(account);
		
	}

	@Override
	public void update(Account account) {
		aDao.save(account);
		
	}

	@Override
	public Account createe(Account account) {
		// TODO Auto-generated method stub
		return aDao.save(account);
	}

	@Override
	public Account updatee(Account account) {
		// TODO Auto-generated method stub
		return aDao.save(account);
	}

	@Override
	public void delete(String username) {
		 aDao.deleteById(username);
	}


	@Override
	public List<Account> getAdministrators() {
		// TODO Auto-generated method stub
		return aDao.getAdministrators();
	}
}
