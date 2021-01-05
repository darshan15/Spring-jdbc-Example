package com.simpleproject.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.simpleproject.api.Student;

public class StudentDAOImpl implements StudentDAO {

	private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

	@Override
	public void insert(Student student) {

		String sql = "INSERT INTO STUDENT VALUE (?,?,?)";

		Object[] arg = { student.getRollNo(), student.getName(), student.getAddress() };

		int noOfRowInserted = jdbcTemplate.update(sql, arg);

		System.out.println("No of row inserted is " + noOfRowInserted);

	}

	public DataSource getDataSource() {

		String url = "jdbc:mysql://localhost:3306/School?useSSL=false";
		String username = "root";
		String password = "Darshan123";

		DataSource dataSource = new DriverManagerDataSource(url, username, password);

		return dataSource;
	}

}
