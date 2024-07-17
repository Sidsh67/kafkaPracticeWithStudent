package com.registry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registry.pojo.Student;
import com.registry.repo.StudentRepository;



@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	public Student save(Student student) {
		return repo.save(student);
	}
	
	public List<Student> getAll() {
		List<Student> st= repo.findAll();
		return st;
	}
	
	
}
