package taidtpc00715.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import taidtpc00715.entity.Product;
import taidtpc00715.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	@RequestMapping("/product/list")
	public String list(Model model, @RequestParam("cid") Optional<String> cid, @RequestParam("p") Optional<Integer> p) {
		int paging = p.orElse(0);
		Pageable pageable = PageRequest.of(paging, 12);
		if (paging < 0) {
			paging = 0;
		}
		
		
		model.addAttribute("pp", paging);
		if(cid.isPresent()) {
			model.addAttribute("loai", cid.get());
			Page<Product> list = productService.findByCategoryId(cid.get(), pageable);
			model.addAttribute("items", list);
		}
		else {
			Page<Product> list = productService.findAll2(pageable);
			model.addAttribute("items", list);
		}
		
		return "product/list";
	}
	
	@RequestMapping("/product/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id) {
		Product item = productService.findById(id);
		model.addAttribute("item", item);
		return "product/detail";
	}
}
