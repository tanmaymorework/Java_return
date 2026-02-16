package com.tut;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmbedDemo {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Student student1 = new Student();
		student1.setId(123);
		student1.setName("Pranit patil");
		student1.setCity("Nashik");
		
		Certificate certificate  = new Certificate();
		
		certificate.setCourse("Androide");
		certificate.setDuration("2 Months");
		
		student1.setCerti(certificate);
		
		
		Student student2 = new Student();
		student2.setId(1234);
		student2.setName("Tanmay More");
		student2.setCity("Pune");
		
		Certificate certificate1  = new Certificate();
		
		certificate1.setCourse("AWS");
		certificate1.setDuration("4 Months"); 
		student2.setCerti(certificate1);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		// object save
		s.save(student1);
		s.save(student2);
		
		
		tx.commit();
		factory.close();
	}

}
