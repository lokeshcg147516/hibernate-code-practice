package com.cg.bi.dao;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cg.bi.dto.Mobile;
import com.cg.bi.dto.Person;
import com.cg.hibernate.util.HibernateUtil;

public class HibernateBiOneMany {
	public static void main(String[] args) {
		Person person=new Person(122,"ram",32);
		Mobile mobile=new Mobile(21,"IMEI32123", 9888399l);
		Mobile mobile1=new Mobile(33,"IMEI32123", 9888399l);
		mobile.setPerson(person);
		mobile1.setPerson(person);
		person.setMobile(Arrays.asList(mobile,mobile1));
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		tx.begin();
		session.save(person);
		tx.commit();
		System.out.println("inmserted");
		
	}
}
