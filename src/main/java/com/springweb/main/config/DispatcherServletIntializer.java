package com.springweb.main.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletIntializer implements WebApplicationInitializer {

	//@SuppressWarnings("resource")
	@Override
	public void onStartup(ServletContext servletContext)  {
	//	AnnotationConfigApplicationContext context = new();
	
		AnnotationConfigWebApplicationContext context
		= new AnnotationConfigWebApplicationContext();
		context.register(AppConfiguration1.class);
		DispatcherServlet servlet = new DispatcherServlet(context);
		Dynamic dynamic = servletContext.addServlet("dispatcher",servlet);
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
		
		
		
	}

}
