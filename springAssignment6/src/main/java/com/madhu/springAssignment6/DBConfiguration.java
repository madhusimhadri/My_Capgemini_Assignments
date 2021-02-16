package com.madhu.springAssignment6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:db.properties")
@PropertySource("classpath:root.properties")

public class DBConfiguration {

	@Autowired
    Environment env;
	
	@Bean
    public DBConnection getDBConnection() {
		System.out.println("Getting DBConnection Bean for App: "+env.getProperty("APP_NAME"));
		DBConnection dbConnection = new DBConnection(env.getProperty("DB_DRIVER_CLASS"), env.getProperty("DB_URL"), env.getProperty("DB_USERNAME"), env.getProperty("DB_PASSWORD").toCharArray());
        return dbConnection;
    }
	
}
