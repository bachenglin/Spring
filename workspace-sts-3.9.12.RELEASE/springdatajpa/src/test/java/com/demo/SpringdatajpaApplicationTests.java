package com.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.model.Student;
import com.demo.repository.StudentRepository;

@SpringBootTest
class SpringbootDatajpaApplicationTests {

	@Autowired
	private StudentRepository repository;
	
	@Test
	public void createStudent() {
		Student student = new Student();
		student.setId(10);
		student.setName("Robert Miles");
		student.setScore(98);
		
		repository.save(student);
		
		Student createdStudent = repository.findById(10).get();
		assertNotNull(createdStudent);
	}

}