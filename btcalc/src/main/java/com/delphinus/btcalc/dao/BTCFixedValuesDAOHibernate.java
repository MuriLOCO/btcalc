package com.delphinus.btcalc.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.delphinus.btcalc.beans.BTCFixedValues;

public class BTCFixedValuesDAOHibernate extends HibernateDAO implements BTCFixedValuesDAO {

	@Override
	public BTCFixedValues getBTCFixedValues() {
		Session session = getSession();
		Criteria crit = session.createCriteria(BTCFixedValues.class);
		return (BTCFixedValues) crit.uniqueResult();
		
	}

	

}
