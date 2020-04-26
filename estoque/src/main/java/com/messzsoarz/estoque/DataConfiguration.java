package com.messzsoarz.estoque;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfiguration {
	
	@Bean
	public DataSource dataSource () {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://tuffi.db.elephantsql.com:5432/jxluuylj");
		ds.setUsername("jxluuylj");
		ds.setPassword("Z768IlRTJbWrLES4AWOPi5xytgR6ukbe");
		return ds;
	}
	
	public JpaVendorAdapter jpaVendorAdapter () {
		HibernateJpaVendorAdapter jva = new HibernateJpaVendorAdapter();
		jva.setDatabase(Database.POSTGRESQL);
		jva.setShowSql(true);
		jva.setGenerateDdl(true);
		jva.setDatabasePlatform("org.hibernate.dialect.PostgreSQLDialect");
		jva.setPrepareConnection(true);
		return jva;
	}
	
}
