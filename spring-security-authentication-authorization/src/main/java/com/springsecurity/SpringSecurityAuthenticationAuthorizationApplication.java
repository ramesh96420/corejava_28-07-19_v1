package com.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

// TODO: Auto-generated Javadoc
/**
 * The Class SpringSecurityAuthenticationAuthorizationApplication.
 */
@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityAuthenticationAuthorizationApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAuthenticationAuthorizationApplication.class, args);
	}

}
