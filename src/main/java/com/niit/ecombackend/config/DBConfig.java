package com.niit.ecombackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.niit")
@EnableTransactionManagement
public class DBConfig {
	@Bean
	DataSource myDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:~/myproject7");
		dataSource.setUsername("sa");
		dataSource.setPassword("sa");
		return dataSource;
	}

	Properties myProperties() {
		Properties p = new Properties();
		p.setProperty(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");
		p.setProperty(Environment.HBM2DDL_AUTO, "update");
		p.setProperty(Environment.SHOW_SQL, "true");
		return p;
	}

	@Bean("sf")
	LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(myDataSource());
		localSessionFactoryBean.setHibernateProperties(myProperties());
		localSessionFactoryBean.setPackagesToScan("com.niit.ecombackend.model");
		return localSessionFactoryBean;
	}

	@Autowired
	@Bean
	HibernateTransactionManager hibernateTransactionManager(SessionFactory sf) {
		HibernateTransactionManager h = new HibernateTransactionManager();
		h.setSessionFactory(sf);
		return h;
	}
}