package com.school.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.school.beans.Student;

public class StudentDao {
	SessionFactory sf= new Configuration().configure().buildSessionFactory();
	Session sn=sf.openSession();
	public String save(Student st)
	{
		Transaction t=sn.beginTransaction();
		sn.persist(st);
		t.commit();
		sn.close();
		return "Sucessfully added";
	}

}
