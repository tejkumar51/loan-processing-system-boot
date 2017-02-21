package com.osi.loan.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.osi.loan.repository.jpa")
public class UserConfiguration {

}
