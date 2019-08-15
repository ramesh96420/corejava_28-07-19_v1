package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO: Auto-generated Javadoc
/**
 * The Class ApplicationController.
 */
@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	@GetMapping("/get-message")
	public String getMessage() {
		return "Spring Security Examples";
	}

}
