package com.madhu.springsecurity;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter
{

	@Autowired
	DataSource dataSource;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//jdbc configuration
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery("select username,password,enabled" +" from users" + "where username=?")
			.authoritiesByUsernameQuery("select username,authority" +" from authorities" + "where username=?");
			/*.withDefaultSchema()
			.withUser(User.withUsername("user").password("pass").roles("USER"))
			.withUser(User.withUsername("admin").password("pass").roles("ADMIN"));*/
			//usersByUsernameQuery and authorities are used so that if we want to make any changes like changing users table to our requirements.
			//else this is default we need not write it.
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("USER","ADMIN")
		//Any role is used so that giving multiple access to urls
		//.antMatchers("/user").hasRole("USER")
		.antMatchers("/").permitAll()
		.and().formLogin();
	}
	
	
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	
	
	
}
