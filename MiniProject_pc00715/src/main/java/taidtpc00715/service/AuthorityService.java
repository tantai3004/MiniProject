package taidtpc00715.service;

import java.util.List;

import taidtpc00715.entity.Account;
import taidtpc00715.entity.Authority;

public interface AuthorityService {



	List<Authority> findAll();

	Authority create(Authority auth);

	void delete(String username);

	void createe(Authority authority);

	Authority create1(Authority authority);

	void delete(Integer id);

	void deleteRole(String role);

	List<Authority> getAuthoritiesOfAdministators();

}
