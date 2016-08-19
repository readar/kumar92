package com.base.Controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.base.model.Product;
import com.base.service.ProductService;
import com.google.gson.Gson;


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
	
    	public String CreateProduct(@ModelAttribute("product")Product product,HttpServletRequest request)
    	{		
    	 	System.out.println("in product controller11");

    		@SuppressWarnings("unused")
			String filename;
    	 	@SuppressWarnings("unused")
			byte[]bytes;
    	 	System.out.println(product.getPtdescription());
    	 	
    	 	//--------notepadcopy-------------//
    	 	
    	 		System.out.println("image uploaded");
    	 		
    	///////////notepad/////////////
    	
    	
    	System.out.println("product controller called");
    	MultipartFile image=product.getImg();
    	Path path;
    	path=Paths.get("D:/project/base/src/main/webapp/resources/images/"+product.getPtname() +".jpg");
    	
    	System.out.println("Path = " + path);
        System.out.println("File name = " + product.getImg().getOriginalFilename());
        if(image!=null && !image.isEmpty())
        {
        	try
        	{
        	 image.transferTo(new File(path.toString()));
        	  System.out.println("Image Saved in:"+path.toString());
        	}catch(Exception e)
        	{
        e.printStackTrace();
        		System.out.println("Image not saved");
        	}
      }
	 	productService.saveOrUpdate(product);
		return "viewproductpage";
	}
	
	@RequestMapping("/viewproductpage")
	public ModelAndView viewItems() throws JsonGenerationException, JsonMappingException, IOException
	{
		List<Product> list = productService.list();
		System.out.println("product list="+list);
		ObjectMapper om = new ObjectMapper();
		String listjson = om.writeValueAsString(list);
		System.out.println(listjson);
		return new ModelAndView("viewproductpage","listofitem",listjson);
		
	
	}
	
	
	@RequestMapping("/deleteItem")
	public String removeProduct(@RequestParam int ptid) throws Exception {
	System.out.println("In delete");
	System.out.println(ptid);

	    try {
	        productService.delete(ptid);
	      //  model.addAttribute("message", "Successfully Added");
	    } catch (Exception e) {
	     //   model.addAttribute("message", e.getMessage());
	        e.printStackTrace();
	    }
	    // redirectAttrs.addFlashAttribute(arg0, arg1)
	    return "redirect:/viewprods";
	}
	
/*	@RequestMapping("/editProduct")
	public ModelAndView editItem(@RequestParam("ptid") int ptid)
	{
	System.out.println("id:"+ptid);
	Product product=productService.get(ptid);
	System.out.println("Product Name:"+product.getPtname());
	return new ModelAndView("updateproduct","product",product);
	}
	
	@RequestMapping("/updateproduct")
	public String updateProduct(@RequestParam int ptid,@RequestParam("ptname") String ptname,@RequestParam("ptdescription") String ptdescription,@RequestParam int ptprice, @RequestParam("ptquantity") String ptquantity)
	{
	//int prodId=Integer.parseInt(pid);
   Product product=productService.get(ptid);
   product.setPtid(ptid);
	product.setPtname(ptname);
	product.setPtdescription(ptdescription);
	product.setPtprice(ptprice);
	productService.manageProduct(product);

	        return "redirect:/Products";
	        }
	/*@RequestMapping("edit")
	public ModelAndView editProduct(@RequestParam int pid, @ModelAttribute Product product)
	{
		
		Product prodObject = productService.get(pid);
		return new ModelAndView("product", "prodObject", prodObject);
	}
	*/
	
	

	
	


}
