package com.nagarro.Devops.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Controller {

  

   


	@GetMapping
	public String myhome() {
		return "this is home";
	}
  
}




