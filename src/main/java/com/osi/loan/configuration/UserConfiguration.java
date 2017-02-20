package com.osi.loan.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.osi.loan.aspect.CachingAdvice;
import com.osi.loan.dao.UserDAO;
import com.osi.loan.dao.impl.UserDAOImpl;
import com.osi.loan.service.UserService;
import com.osi.loan.service.impl.UserServiceImpl;

@Configuration
@EnableTransactionManagement
@EnableAspectJAutoProxy
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
	@Bean
	public UserDAO userDao() {
		return new UserDAOImpl();
	}

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}

	@Bean
	public CachingAdvice cachingAdvice() {
		return new CachingAdvice();
	}

	/*
	 * @Bean public DataSourceTransactionManager dataSourceTransactionManager()
	 * { DataSourceTransactionManager dataSourceTransactionManager = new
	 * DataSourceTransactionManager();
	 * dataSourceTransactionManager.setDataSource(dataSource()); return
	 * dataSourceTransactionManager; }
	 */
}
