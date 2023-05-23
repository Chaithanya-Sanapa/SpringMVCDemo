package com.springweb.main.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;


@Configuration
public class MysqlDbConfiguration {
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory()
	{
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(getDataSource());
		sessionFactoryBean.setHibernateProperties(getConnectionProperties());
		sessionFactoryBean.setPackagesToScan("com.springweb.main.entity");
		
		return sessionFactoryBean;
	}
	
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/realme_db");
		source.setUsername("root");
		source.setPassword("root");
		return source;
		
	}
	
	
	public static Properties getConnectionProperties()
	{
		Properties properties = new Properties();
//		properties.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
//		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/realme_db");
//		properties.setProperty("hibernate.connection.username","root");
//		properties.setProperty("hibernate.connection.password","root");
		properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		properties.setProperty("hibernate.show_sql","true" );
		properties.setProperty("hibernate.hbm2ddl.auto","update");
		return properties;

	}
	
}
