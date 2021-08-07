package com.springbootjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertStudent(Student student) {
		return jdbcTemplate.update("insert into student_details(student_name,student_address) values (?,?)", student.getStudentName(),student.getStudentAddress());
	}

}
