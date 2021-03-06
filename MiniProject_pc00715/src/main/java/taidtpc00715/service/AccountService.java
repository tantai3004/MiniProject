package taidtpc00715.service;

import java.util.List;

import taidtpc00715.entity.Account;


public interface AccountService {
	Account findById(String username);


	List<Account> findAll();

	void create(Account account);

	void update(Account account);

	Account createe(Account account);

	Account updatee(Account account);

	void delete(String username);


	List<Account> getAdministrators();
}
