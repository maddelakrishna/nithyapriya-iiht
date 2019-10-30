package com.iiht.ecart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Homecontroller {
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String home()
	{
		return "home";
	}

}
