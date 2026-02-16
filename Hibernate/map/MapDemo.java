package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		// creating Question 
		
		
		Question q1 = new Question();
		q1.setQuestion_id(1212);
		q1.setQuestion("What is Java ?");
		
		
		// creating answer
		
		Answer answer = new Answer();
		answer.setAnswerId(343);;
		answer.setAnswer("Java is programing language..");
		q1.setAnswer(answer);
		
		
		// Session 
		
		Session s = factory.openSession();
		
		Transaction tx = s.beginTransaction();
		
		// save 
		s.save(q1);
		s.save(answer);
		
		tx.commit();
		
		
		// fetching 
		
		Question newQ = (Question)s.get(Question.class, 1212);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		
		s.close();
		
		factory.close();
	}

}
