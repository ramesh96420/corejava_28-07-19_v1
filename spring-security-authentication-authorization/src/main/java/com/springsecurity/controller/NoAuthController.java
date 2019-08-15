package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO: Auto-generated Javadoc
/**
 * The Class NoAuthController.
 */
@RestController
@RequestMapping("/noAuth/rest")
public class NoAuthController {
	
	/**
	 * Say hi.
	 *
	 * @return the string
	 */
	@GetMapping("/sayHi")
	public String sayHi(){
		return "No Authentication this URL.";
	}

}
