package com.springweb.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springweb.main.repository.RegisterRepository;

@Controller
public class RestController {

	@Autowired
	RegisterRepository repository;
	
//	@RequestMapping(value = "getAllRegisters")
//	public List getAllRegisters()
//	{
//		return  repository.getAllRegs();
//	}
}
