package com.base.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.base.model.Product;
import com.base.service.ProductService;


@Controller
public class ProductController {
	@RequestMapping("/Add")
	public ModelAndView showAddpjsp() {
		ModelAndView mv = new ModelAndView("Add");
		System.out.println("sucess addproduct");
		return mv;
	}

	@Autowired
	ProductService productService;
	Product product;

	@RequestMapping("/productadd")
	public ModelAndView Productcontroller1(@ModelAttribute("product")Product product,Model model)

			
	{
		

		productService.saveOrUpdate(product);

		ModelAndView mv = new ModelAndView("Add");
		System.out.println("product controller called");
		return mv;

	}

}
