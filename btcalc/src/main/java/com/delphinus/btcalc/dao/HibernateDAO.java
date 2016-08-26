package com.delphinus.btcalc.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateDAO
{
	@Autowired
	protected SessionFactory sessionFactory;

	protected Session getSession()
	{
		Session session;
		try
		{
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e)
		{
			session = sessionFactory.openSession();
		}
		return session;
	}
}
