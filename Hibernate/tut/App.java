package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

//import javax.sql.rowset.spi.TransactionalWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException{
		System.out.println("Project started..");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// Creating Student

		Student st = new Student();
		st.setId(102);
		st.setName("Pranit");
		st.setCity("Pune");

		System.out.println(st);

//		Session session = factory.openSession();
//
//		Transaction tx =session.beginTransaction();
//		session.save(st);
//		session.save(ad);
//		tx.commit();
//		session.close();

		
		// creating object of address class
		Address ad =  new Address();
		ad.setStreet("Street1");
		ad.setCity("Pune");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(12150.2613);
		
		// Reading Image
		FileInputStream fis = new FileInputStream("src/main/java/pic.png");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);
		
		
		
		Session session = factory.openSession();
		Transaction tx =session.beginTransaction();
		session.save(st);
		session.save(ad);
		tx.commit();
		session.close();
		System.out.println("Done..");
	}
}
