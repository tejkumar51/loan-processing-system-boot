package com.osi.loan.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.osi.loan.aspect.CachingAdvice;
import com.osi.loan.dao.UserDAO;
import com.osi.loan.dao.impl.UserDAOImpl;
import com.osi.loan.service.UserService;
import com.osi.loan.service.impl.UserServiceImpl;

@Configuration
@EnableJpaRepositories("com.osi.loan.repository.jpa")
public class UserConfiguration {

	// Will be created by Spring Boot from data source properties
	/*
	 * @Bean public DriverManagerDataSource dataSource() {
	 * DriverManagerDataSource driverManagerDataSource = new
	 * DriverManagerDataSource();
	 * driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/loandb");
	 * driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
	 * driverManagerDataSource.setUsername("root");
	 * driverManagerDataSource.setPassword("root"); return
	 * driverManagerDataSource; }
	 * 
	 * @Bean public JdbcTemplate jdbcTemplate() { JdbcTemplate jdbcTemplate =
	 * new JdbcTemplate(); jdbcTemplate.setDataSource(dataSource()); return
	 * jdbcTemplate; }
	 */
	// @Bean
	public UserDAO userDao() {
		return new UserDAOImpl();
	}

	// @Bean
	public UserService userService() {
		return new UserServiceImpl();
	}

	// @Bean
	public CachingAdvice cachingAdvice() {
		return new CachingAdvice();
	}

	// Will be created by Spring Boot from data source properties
	/*
	 * @Bean public DataSourceTransactionManager dataSourceTransactionManager()
	 * { DataSourceTransactionManager dataSourceTransactionManager = new
	 * DataSourceTransactionManager();
	 * dataSourceTransactionManager.setDataSource(dataSource()); return
	 * dataSourceTransactionManager; }
	 */
}
