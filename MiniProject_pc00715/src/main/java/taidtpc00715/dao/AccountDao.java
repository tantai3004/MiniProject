package taidtpc00715.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import taidtpc00715.entity.Account;

public interface AccountDao extends JpaRepository<Account, String>{

	@Query("SELECT DISTINCT ar.account FROM Authority ar WHERE ar.role.id IN ('PM', 'ADMIN')")
	List<Account> getAdministrators();


	
}
