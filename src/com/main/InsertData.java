package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Vehicles;

public class InsertData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicles.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into Vehicles(vehicle_No, maker, model, color, type, price)values(:no,:maker,:model,:color,:type,:price)";
		MutationQuery mtquery = ss.createMutationQuery(hqlQuery);
		mtquery.setParameter("no", "MH-12-AB-8769");
		mtquery.setParameter("maker", "Mahindra");
		mtquery.setParameter("model", "Thar");
		mtquery.setParameter("color", "Black");
		mtquery.setParameter("type", "SUV");
		mtquery.setParameter("price", 2000000);
		mtquery.executeUpdate();
		tr.commit();

		System.out.println("Data inserted successufully...");
		ss.close();
	}

}
