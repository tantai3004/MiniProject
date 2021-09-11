package taidtpc00715.rest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import taidtpc00715.entity.Role;
import taidtpc00715.service.RoleService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/roles")
public class RoleRestController {
	@Autowired
	RoleService roleService;
	
	@GetMapping
	public List<Role> getAll(){
		return roleService.findAll();
	}
	
	@PostMapping()
	public Role create(@RequestBody Role role) {
		return roleService.create(role);
	}
	
	@PutMapping("{id}")
	public Role create(@RequestBody Role role, @PathVariable("id") String id) {
		return roleService.update(role);
	}
	
	@DeleteMapping("{id}")
	public void create(@PathVariable("id") String id) {
		roleService.delete(id);
	}
}
