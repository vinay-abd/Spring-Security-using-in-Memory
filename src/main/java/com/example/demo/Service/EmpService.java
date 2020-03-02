package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService
{
	public String getMessage()
	{
		return "called in SERVICE layer by ADMIN";
	}

	public String userMessage()
	{
		return "called by NORMAL USER";
	}
}
