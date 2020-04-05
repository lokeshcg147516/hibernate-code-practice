package com.cg.bi.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.cg.bi.dto.Address;
import com.cg.bi.dto.Mobile;
import com.cg.bi.dto.Person;
import com.cg.bi.dto.Student;
import com.cg.hibernate.util.HibernateUtil;

public class HibernateBiDemo2 {
	public static void main(String[] args) {
		Student student = new Student(2, "Sam", "Disilva", "Maths");
		
		  Address address = new Address(3,"10 Silver street", "NYC", "USA");
		  
		  Session session = HibernateUtil.getSessionFactory().openSession();
		  session.beginTransaction();
		  
		  student.setAddress(address); address.setStudent(student);
		  session.save(student);
		 

		
		/* List<Student> students = (List<Student>)
		 session.createQuery("from Student ").list(); for (Student s : students) {
		 System.out.println("Details : " + s); }*/
		 
		
		 session.getTransaction().commit(); session.close();
		 
		

	}
}
