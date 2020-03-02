package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmpService;

@RestController
@RequestMapping("/app")
public class EmpController {
	@Autowired
	private EmpService empService;
	
	//@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping("/get")
	public String fetchMessage() {
		System.out.println("you are fetching data in application using fetchMessage() method....");
		return empService.getMessage();
	}
	
	@RequestMapping("/user")
	public String user()
	{
		System.out.println("normal user called");
		return empService.userMessage();
	}
}
