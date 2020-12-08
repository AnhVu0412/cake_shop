package cakesshop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cakesshop.model.Product;
import cakesshop.services.ProductService;


@Controller
public class HomePageController {
	@Autowired
	private ProductService productService;
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String Index(Model model) {
		List<Product> listHP = productService.findALL();
		model.addAttribute("listHP",listHP);
		return "homepage";
	}
}
