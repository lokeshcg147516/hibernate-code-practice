package com.cg.bi.dao;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cg.bi.dto.HeadOfDept;
import com.cg.bi.dto.Subject;
import com.cg.hibernate.util.HibernateUtil;

public class HibernateBiAssociationMapping {
	public static void main(String[] args) {
		Subject subject=new Subject();
		subject.setSubId(new Random().nextInt());
		subject.setSubName("Physics");
		subject.setSubCategory("Science");
		
		HeadOfDept hod=new HeadOfDept();
		hod.setLeturer_id(new Random().nextInt());
		hod.setExp(22);
		hod.setName("Kamala");
		hod.setSubject(subject);
		
		subject.setHeadOfDept(hod);
		hod.setSubject(subject);
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		tx.begin();
		session.save(hod);
		tx.commit();
		System.out.println("inserted");
	}
}
