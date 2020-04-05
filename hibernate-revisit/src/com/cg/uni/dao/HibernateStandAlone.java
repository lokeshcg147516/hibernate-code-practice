package com.cg.uni.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cg.hibernate.util.HibernateUtil;
import com.cg.uni.dto.Address;
import com.cg.uni.dto.Student;
import com.cg.uni.dto.University;

public class HibernateStandAlone {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		tx.begin();
		Address address=new Address(12131, "Arvindnagar", "Mysore", "India");
		Student student=new Student(121, "Ramesh", "Rangaiah", "C", address);
		session.save(address);
		University university=new University(12l,"VTU","India");
		session.save(university);
		student.setUniversity(university);
		session.save(student);

		tx.commit();
		System.out.println("saved student successfully");
	}
}
