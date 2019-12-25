/**
 * 
 */
package com.azure.activedirectory.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PRASADBolla
 *
 */
@CrossOrigin
@RestController
public class AzureADAuthenticationController {
	@Autowired
	@PreAuthorize("hasRole('Users')")
	@RequestMapping("/")
	public String helloWorld() {
		return "Hello Users!";
	}
	@RequestMapping("/account")
    public Authentication getAccount() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
    
	@PreAuthorize("hasRole('Group1')")
	@RequestMapping("/Group1")
	public String groupOne() {
		return "Hello Group 1 Users!";
	}

	@PreAuthorize("hasRole('Group2')")
	@RequestMapping("/Group2")
	public String groupTwo() {
		return "Hello Group 2 Users!";
	}
}
