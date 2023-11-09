package com.codo.tpgrupo.springpractices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class SpringPracticesApplication {
	
	@RequestMapping("/")
	@ResponseBody
	public ModelAndView welcome(){
		ModelAndView view = new ModelAndView("index.html");
		
		return view;
	}
	public static void main(String[] args){
		SpringApplication.run(SpringPracticesApplication.class, args);
	}
}
