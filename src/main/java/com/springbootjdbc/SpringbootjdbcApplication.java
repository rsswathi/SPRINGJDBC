package com.springbootjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootjdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringbootjdbcApplication.class, args);
		StudentDaoImpl stDaoImpl=(StudentDaoImpl) ctx.getBean(StudentDaoImpl.class);
		
		Student student=new Student();
		student.setStudentName("Manoj");
		student.setStudentAddress("Hyderabad");;
		
		int i=stDaoImpl.insertStudent(student);
		if(i>0) {
			System.out.println(i+" Student Inserted");
		}else {
			System.out.println("Student Not Inserted");
			System.out.println("first commit");
		}
	}

}
