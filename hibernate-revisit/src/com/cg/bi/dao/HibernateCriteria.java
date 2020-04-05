package com.cg.bi.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import com.cg.bi.dto.Address;
import com.cg.bi.dto.Mobile;
import com.cg.bi.dto.Person;
import com.cg.bi.dto.Student;
import com.cg.hibernate.util.HibernateUtil;

public class HibernateCriteria {
	public static void main(String[] args) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Criteria cr = session.createCriteria(Person.class);
			// cr.add(Restrictions.isNotNull("personId"));
			Criterion like = Restrictions.like("name", "r%");
			Criterion gt = Restrictions.gt("age", 35);
			LogicalExpression and = Restrictions.and(like, gt);

			cr.add(and);
			List<Person> list = cr.list();

			for (Person person : list) {
				System.out.println(person.getName());
			}

			Criteria cr2 = session.createCriteria(Person.class);
			cr2.setProjection(Projections.avg("age"));
			List list2 = cr2.list();
			for (Object object : list2) {
				System.out.println(object);
			}

			List<Object[]> list33 = session.createSQLQuery(
							"Select {a.*},{b.*} from hbl_bi_Address_2 a inner join hbl_bi_student_2 b on a.student_id=b.id")
					.addEntity("a", Address.class).addJoin("b", "a.student").list();
			//query.addEntity(Address.class);
			/*List<Address> list3 = query.list();
			for (Address address : list3) {

				System.out.println(address.getCity());
			}*/
			
			for (Object[] objects : list33) {
				Address addr=(Address) objects[0];
				System.out.println(addr.getCity());
				
				Student student=(Student) objects[1];
				System.out.println(student.getFirstName());
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
