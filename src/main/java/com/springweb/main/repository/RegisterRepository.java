package com.springweb.main.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.chaithu.advance1.util.SessionFactoryUtil;
import com.springweb.main.entity.RegisterEntity;

@Repository
public class RegisterRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveUser(RegisterEntity registerEntity)
	{
		
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(registerEntity);
			transaction.commit();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
//	public List<Product> getAllRegs()
//	{
//		try {
//		Session session = sessionFactory.openSession();
//		StringBuilder builder = new StringBuilder();
//		builder.append("from RegisterEntity");
//		
//		Query query = session.createQuery(builder.toString());
//		return query.getResultList();
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
//		return null;
//	}
	
	
	
	
}
