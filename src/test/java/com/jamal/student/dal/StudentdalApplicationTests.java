package com.jamal.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jamal.student.dal.entities.Student;
import com.jamal.student.dal.repos.StudentRepository;



@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;	
    
	@Test
	public void testCreateStudent() {
	   Student student = new Student();
	   
	   student.setName("Hussein");
	   student.setCourse("web server");
	   student.setFee(30d);
	   studentRepository.save(student);	
	}
	
	@Test
	public void testFindStudentById() {
		Optional<Student> student = studentRepository.findById(6l);
		System.out.println(student);
		
	}
	
	

}
