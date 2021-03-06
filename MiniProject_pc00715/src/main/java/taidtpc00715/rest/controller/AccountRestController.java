package taidtpc00715.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import taidtpc00715.entity.Account;
import taidtpc00715.entity.Authority;
import taidtpc00715.entity.Role;
import taidtpc00715.service.AccountService;
import taidtpc00715.service.AuthorityService;
import taidtpc00715.service.RoleService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/accounts")
public class AccountRestController {
	@Autowired
	AccountService accountService;
	@Autowired
	RoleService roleService;
	@Autowired
	AuthorityService authorityService;
	
	
	@GetMapping("all")
	public List<Account> getAll(){
		return accountService.findAll();
	}
	
	@PostMapping()
	public Account create(@RequestBody Account account) {	
		return accountService.createe(account);
	}
	
	@PostMapping("role")
	public Authority create1(@RequestBody Authority authority) {
		return authorityService.create1(authority);
	}
	
	@PutMapping("{username}")
	public Account update(@RequestBody Account account, @PathVariable("username") String username) {
		return accountService.updatee(account);
	}
	
	@DeleteMapping("{username}")
	public void delete(@PathVariable("username") String username) {
		accountService.delete(username);
	}
	
	@GetMapping
	public List<Account> getAccounts(@RequestParam("admin") Optional<Boolean> admin){
		if(admin.orElse(false)) {
			return accountService.getAdministrators();
		}
		return accountService.findAll();
	}
}
