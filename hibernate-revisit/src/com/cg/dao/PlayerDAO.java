package com.cg.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cg.dto.Player;

public class PlayerDAO {
	private static SessionFactory factory;

	public static void main(String[] args) {

		/*try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}*/
		Player player = new Player(1, "Virat", "kohli", "India", Arrays.asList("Chiku", "Viru"));
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		beginTransaction.begin();
		session.save(player);
		beginTransaction.commit();
		System.out.println("commited");

		// new PlayerDAO().updatePlayer(1, "Singhu");
		// new PlayerDAO().deletePlayer(1);
	}

	public void savePlayer(Player player) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		beginTransaction.begin();
		session.save(player);
		beginTransaction.commit();
		System.out.println("ommited");
	}

	public List<Player> findAll() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		beginTransaction.begin();
		List<Player> list = session.createQuery("From Player").list();
		for (Player player2 : list) {
			System.out.println(player2);
		}

		System.out.println("saved");
		return list;
	}

	public void updatePlayer(int playerId, String lastName) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Player employee = (Player) session.get(Player.class, playerId);
			employee.setLastName(lastName);
			session.update(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void deletePlayer(int playerId) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Player employee = (Player) session.get(Player.class, playerId);
			// employee.setLastName(lastName);
			session.delete(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
