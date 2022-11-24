package com.jamal.student.dal;

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
		student.setName("Jamal");
		student.setCourse("Java Web Services");
		student.setFee(30d);
		
		studentRepository.save(student);
	}

}
