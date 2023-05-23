package com.springweb.main.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springweb.main.entity.Vehicle;

@Component
@Qualifier("bike")
public class Bike implements Dao {

	{
		System.err.println(" Bike instance ");
	}
}
