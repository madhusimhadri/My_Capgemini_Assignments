package com.madhu.springMVC4.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.madhu.springMVC4.model.User;





public class UserDaoImpl implements UserDao 
{

	private JdbcTemplate jdbcTemplate;
	
	public UserDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int registerUser(User user) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO USER_DATA VALUES(?,?,?)";

		try {
			
			int counter= jdbcTemplate.update(sql, new Object[] {user.getUsername(),user.getPassword(),user.getEmail()});
			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public String loginUser(User user) {
		// TODO Auto-generated method stub
		
String sql = "SELECT USER_ID FROM USER_DATA WHERE USER_ID=? AND USER_PASS=? AND USER_EMAIL=?";
		
		try {

			String username = jdbcTemplate.queryForObject(sql, new Object[] {
					user.getUsername(), user.getPassword() }, String.class);

			return username;
			
		} catch (Exception e) {
			return null;
		}
	
		
	}

	

	
	
}
