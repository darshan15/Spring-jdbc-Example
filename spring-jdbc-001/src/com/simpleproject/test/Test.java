package com.simpleproject.test;

import com.simpleproject.api.Student;
import com.simpleproject.dao.StudentDAO;
import com.simpleproject.dao.StudentDAOImpl;


public class Test {

	public static void main(String[] args) {
		
		Student newStudent1 = new Student();
		
		newStudent1.setRollNo(001);
		newStudent1.setName("Payal");
		newStudent1.setAddress("Scranton");
		
		StudentDAO studentDAO = new StudentDAOImpl();
		studentDAO.insert(newStudent1);
		
	}

}
