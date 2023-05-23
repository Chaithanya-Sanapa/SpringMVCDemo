package com.springweb.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springweb.main.dto.RegisterDto;
import com.springweb.main.entity.RegisterEntity;
import com.springweb.main.repository.RegisterRepository;
import com.springweb.main.service.impl.RegisterServiceImpl;

//@Component
@Controller
public class RegisterController {

	@Autowired
	private RegisterServiceImpl registerServiceImpl;
	
	@Autowired
	private RegisterRepository reposistory;
	
	@RequestMapping(value = "/saveRegisterDetails")
	public ModelAndView saveRegisterDetails( RegisterEntity r)
	{
	System.out.println(r);	
	reposistory.saveUser(r);
	return new ModelAndView("index.jsp");
	}
	
}
