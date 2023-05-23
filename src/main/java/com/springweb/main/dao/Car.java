package com.springweb.main.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springweb.main.entity.Vehicle;

@Component
@Qualifier("car")
public class Car implements Vehicle {

	{
		System.err.println(" Car Instance ");
	}
	
}
