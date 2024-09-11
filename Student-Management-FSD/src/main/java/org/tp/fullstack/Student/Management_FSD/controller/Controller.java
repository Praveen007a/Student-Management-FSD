package org.tp.fullstack.Student.Management_FSD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/tp")
	public String message() {
		return "Hello tp Uchiha";
	}
}
