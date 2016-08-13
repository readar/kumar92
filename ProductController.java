package com.base.Controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;

import com.base.model.Product;
import com.base.service.ProductService;
import com.google.gson.Gson;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView addproduct(Model model) {
		
		
		ModelAndView mv=new ModelAndView("Product");
		return mv;
	}
	
	@ModelAttribute("product")
	public Product returnObject()
	{
		return new Product();
	}



	@RequestMapping(value="/productadd",method=RequestMethod.POST)
	public String CreateProduct(@ModelAttribute("product") Product pd,BindingResult result,
			Model model, HttpServletRequest request)throws IOException
		{
		

	//	String filename;
	// 	byte[]bytes;
	 	productService.saveOrUpdate(pd);
	 	System.out.println("product added from controller");
		//	MultipartFile image=product.getImage();
		//	Path path;
		//	path=Paths.get("D:/project/base/src/main/webapp/resources/images//" +product.getId()+".jpg");
		//	System.out.println("Path = " + path);
        //    System.out.println("File name = " + product.getImage().getOriginalFilename());
          //  if(image!=null && !image.isEmpty())
         //   {
         //   	try
         //   	{
         //   	   image.transferTo(new File(path.toString()));
         //   	   System.out.println("Image Saved in:"+path.toString());
         //   	}catch(Exception e)
         //   	{
         //   		e.printStackTrace();
          //  		System.out.println("Image not saved");
          //  	}
		
		
         //   }
			return "redirect:/Product";
            		

	}
	
	
	String setName;
	List<Product> plist;
	@SuppressWarnings("unchecked")
	@RequestMapping("/GsonCon")
	public @ResponseBody String getValues()throws Exception
	{
		String result = "";
			plist = productService.list();
			Gson gson = new Gson();			  
			result = gson.toJson(plist);			
			return result;
	}

}
