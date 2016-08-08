package com.base.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public ModelAndView displaywelcomepage(){
		ModelAndView v1=new ModelAndView("Welcomepage");
		System.out.println("Welcome is from controller");
		return v1;
	}
	@RequestMapping("/Novels")
	public ModelAndView displayHomepage(){
		ModelAndView q1=new ModelAndView("Novels");
		System.out.println("Novels is from controller");
		return q1;
	}
	@RequestMapping("/Product")
	public ModelAndView displayProductpage(){
		ModelAndView q2=new ModelAndView("Product");
		System.out.println("Product is from controller");
		return q2;
	}
	
	
	@RequestMapping("/Log")
	public ModelAndView displayLoginpage(){
		ModelAndView v=new ModelAndView("Log");
		System.out.println("Login page by controller");
		return v;
	}
	@RequestMapping("/RegisterPage")
	public ModelAndView displayRegpage(){
		ModelAndView r1=new ModelAndView("RegisterPage");
		System.out.println("reg page is from controller");
		return r1;
	}
	
	@RequestMapping("/Categories")
	public ModelAndView displayCategoriespage(){
		ModelAndView v2=new ModelAndView("Categories");
		System.out.println("Categories also from controller");
		return v2;
	}
	
	@RequestMapping("/Genres")
	public ModelAndView displayGenrespage(){
		ModelAndView v3=new ModelAndView("Genres");
		System.out.println("Genres also from controller");
		return v3;
	}
	
	@RequestMapping("/Author")
	public ModelAndView displayAuthorpage(){
		ModelAndView v4=new ModelAndView("Author");
		System.out.println("Author also from controller");
		return v4;
	}
	
	@RequestMapping("/Literature")
	public ModelAndView displayLiteraturepage(){
		ModelAndView v5=new ModelAndView("Literature");
		System.out.println("Literature also from controller");
		return v5;
	}
	@RequestMapping("/history")
	public ModelAndView displayhistorypage(){
		ModelAndView v6=new ModelAndView("history");
		System.out.println("history also from controller");
		return v6;
	}	
	@RequestMapping("/children")
	public ModelAndView displaychildrenpage(){
		ModelAndView v7=new ModelAndView("children");
		System.out.println("children also from controller");
		return v7;
	}	
	@RequestMapping("/Biog")
	public ModelAndView displayBiopage(){
		ModelAndView v8=new ModelAndView("Biog");
		System.out.println("Biography also from controller");
		return v8;
	}	
	@RequestMapping("/Award")
	public ModelAndView displayAwardpage(){
		ModelAndView v9=new ModelAndView("Award");
		System.out.println("Award also from controller");
		return v9;
	}	
	@RequestMapping("/ChetanBooks")
	public ModelAndView displayChetanBookspage(){
		ModelAndView r1=new ModelAndView("ChetanBooks");
		System.out.println("ChetanBooks also from controller");
		return r1;
	}
	@RequestMapping("/RKnarayanBooks")
	public ModelAndView displayRKnarayanBookspage(){
		ModelAndView r2=new ModelAndView("RKnarayanBooks");
		System.out.println("RKnarayanBooks also from controller");
		return r2;
	}
	@RequestMapping("/Ronaldsegalbooks")
	public ModelAndView displayRonaldsegalbookspage(){
		ModelAndView r3=new ModelAndView("Ronaldsegalbooks");
		System.out.println("Ronaldsegalbooks also from controller");
		return r3;
	}
	@RequestMapping("/SirArthurBooks")
	public ModelAndView displaySirArthurBookspage(){
		ModelAndView r4=new ModelAndView("SirArthurBooks");
		System.out.println("SirArthurBooks also from controller");
		return r4;
	}
	@RequestMapping("/Thrill")
	public ModelAndView displayThrillpage(){
		ModelAndView r5=new ModelAndView("Thrill");
		System.out.println("Thrill also from controller");
		return r5;
	}
	@RequestMapping("/fantasy")
	public ModelAndView displayfantasypage(){
		ModelAndView r6=new ModelAndView("fantasy");
		System.out.println("fantasy also from controller");
		return r6;
	}
	@RequestMapping("/Adventure")
	public ModelAndView displayAdventurepage(){
		ModelAndView r7=new ModelAndView("Adventure");
		System.out.println("Adventure also from controller");
		return r7;
	}
	@RequestMapping("/Business")
	public ModelAndView displayBusinesspage(){
		ModelAndView r8=new ModelAndView("Business");
		System.out.println("SirArthurBooks also from controller");
		return r8;
	}
	@RequestMapping("/Horror")
	public ModelAndView displayHorrorpage(){
		ModelAndView r9=new ModelAndView("Horror");
		System.out.println("Horror also from controller");
		return r9;
	}

}
