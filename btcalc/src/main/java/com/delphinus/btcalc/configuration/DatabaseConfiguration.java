package com.delphinus.btcalc.configuration;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.delphinus.btcalc.dao.BTCFixedValuesDAOHibernate;

@Configuration
public class DatabaseConfiguration {
	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		final org.apache.commons.dbcp2.BasicDataSource dataSource = new org.apache.commons.dbcp2.BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/btcalc");
		dataSource.setUsername("root");
		dataSource.setPassword("opessoftware");
		dataSource.setInitialSize(5);
		dataSource.setMaxTotal(50);
		dataSource.setLogAbandoned(true);
		dataSource.setMaxIdle(2);
		dataSource.setMaxConnLifetimeMillis(2 * 60 * 1000 ); //Milliseconds (2 minutes)
		dataSource.setPoolPreparedStatements(true);
		
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(dataSource());
		localSessionFactoryBean.setConfigLocation(new ClassPathResource("hibernate.cfg.xml"));
		return localSessionFactoryBean;

	}

	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
	    HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);	 
	    return transactionManager;
	}	
	
	@Bean
	public BTCFixedValuesDAOHibernate btcFixedValuesDAO(){
		return new BTCFixedValuesDAOHibernate();
	}

	
}
