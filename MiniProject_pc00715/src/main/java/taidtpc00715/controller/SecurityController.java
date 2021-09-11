package taidtpc00715.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import taidtpc00715.service.UserService;
@CrossOrigin("*")
@Controller
public class SecurityController {
	@Autowired
	HttpServletRequest req;
	
	@RequestMapping("/security/login/form")
	public String loginForm(Model model) {
		if(req.getRemoteUser() != null) {
			return "redirect:/product/list";
		}
		else {
			model.addAttribute("message", "Vui lòng đăng nhập!");
			return "security/login";
		}
		
	}
	
	@RequestMapping("/security/login/error")
	public String erroe(Model model) {
		model.addAttribute("message", "Đăng nhập thất bại!");
		return "security/login";
	}
	
	@RequestMapping("/security/login/success")
	public String loginSuccess(Model model) {		
		model.addAttribute("message", "Đăng nhập thành công");
		return "redirect:/product/list";
	}
	
	
	@RequestMapping("/security/logoff/success")
	public String logoffSuccess(Model model) {
		model.addAttribute("message", "Bạn đã đăng xuất");
		return "security/login";
	}
	
	@Autowired
	UserService userService;
	
}
