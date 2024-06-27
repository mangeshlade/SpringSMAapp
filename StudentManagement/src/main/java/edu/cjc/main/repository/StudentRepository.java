package edu.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cjc.main.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
