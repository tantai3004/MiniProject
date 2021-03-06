package taidtpc00715.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import taidtpc00715.entity.Account;
import taidtpc00715.entity.Authority;

public interface AuthorityDao extends JpaRepository<Authority, Integer>{
	 @Modifying
	 @Transactional
	@Query( value = "DELETE FROM authorities WHERE username = ?1", nativeQuery = true)
	void deleteByUsername(String username);

	 @Modifying
	 @Transactional
	@Query( value = "DELETE FROM authorities WHERE role = ?1", nativeQuery = true)
	void deleteByRole(String role);

	@Query("SELECT DISTINCT a FROM Authority a WHERE a.account IN ?1")
	List<Authority> authoritiesOf(List<Account> accounts);

}
