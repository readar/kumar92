package com.base.Controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;



import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.base.model.Product;
import com.base.service.ProductService;


@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService; 
	
	@RequestMapping("/add")
	public ModelAndView displaprdPage(@ModelAttribute("product")Product product){
		System.out.print("\nMyController - displayHomePage as landpage()");
		ModelAndView mv = new ModelAndView("Products");		
		return mv;
	}
	
	
	@RequestMapping(value="/Products", method=RequestMethod.POST)
	public void CreateProduct(@ModelAttribute("product")Product pd,HttpServletRequest request)
	{		
	 	System.out.println("in product controller11");

		//String filename;
	 	byte[]bytes;
	 	System.out.println(pd.getPtname());
	 	
	 	try{
	 		bytes=pd.getImg().getBytes();
	 		String path = request.getSession().getServletContext().getRealPath("/resources/images/" + pd.getPtname()+".jpg");
	 		System.out.println("\nPath : " + path);
	 		System.out.println("\nFilename : " + pd.getImg().getOriginalFilename());
	 		File f= new File(path);
	 		BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(f));
	 		bs.write(bytes);
	 		bs.close();
	 		System.out.println("image uploaded");
	 		
	 	}
	 	catch(Exception ex){
	 		System.out.println("\nExcep - " + ex);
	 	}
	 	productService.saveOrUpdate(pd);
	}
	


}
