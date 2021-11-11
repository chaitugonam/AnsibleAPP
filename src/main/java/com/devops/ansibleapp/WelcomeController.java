package com.devops.ansibleapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/")
    public String getWelcome() {
       
        return "Welcome to Our Ansible app";
    }

}
