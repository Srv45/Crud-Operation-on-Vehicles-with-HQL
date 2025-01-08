package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Vehicles;

public class UpdataData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicles.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "update Vehicles set price =:newprice where vehicle_No =:no";
		MutationQuery mtquery = ss.createMutationQuery(hqlQuery);
		mtquery.setParameter("newprice", 2500000);
		mtquery.setParameter("no", "MH-12-AB-8769");
		mtquery.executeUpdate();
		tr.commit();

		System.out.println("Data updated successufully...");
		ss.close();

	}

}
