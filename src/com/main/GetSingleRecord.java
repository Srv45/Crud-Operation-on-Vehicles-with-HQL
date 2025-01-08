package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Vehicles;

public class GetSingleRecord {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicles.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Vehicles where vehicle_No =:no";
		Query<Vehicles> query = ss.createQuery(hqlQuery, Vehicles.class);
		query.setParameter("no", "MH-12-AB-8769");
		Vehicles v = query.getSingleResult();
		tr.commit();

		System.out.println(v);
		ss.close();

	}

}
