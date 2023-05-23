package com.springweb.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springweb.main.entity.RegisterEntity;
import com.springweb.main.repository.RegisterRepository;
import com.springweb.main.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private RegisterRepository repository;
	
	
	@Override
	public void processUserInfo(RegisterEntity registerEntity) {
		repository.saveUser(registerEntity);
		
		
	}

}
