package com.cg.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static final SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure();
		if (sessionFactory == null) {
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
}
