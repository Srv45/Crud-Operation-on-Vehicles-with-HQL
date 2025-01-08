package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Vehicles;

public class GetAllRecord {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicles.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Vehicles";
		Query<Vehicles> query = ss.createQuery(hqlQuery, Vehicles.class);
		List<Vehicles> list = query.getResultList();
		tr.commit();

		for (Vehicles vehicles : list) {
			System.out.println(vehicles);
		}
		ss.close();
	}

}
