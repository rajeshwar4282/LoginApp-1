package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

     @RequestMapping(value="/123",method=RequestMethod.GET)
     public String home(){
    	 
          return "form";
     }
     @RequestMapping("/")
 	public ModelAndView firstPage() {
 		return new ModelAndView("results");
 	}

 }