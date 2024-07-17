package com.registry.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registry.pojo.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
