package com.student.schoolprinciple.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.schoolprinciple.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

	void deleteStudentById(Long id);

	Optional<Student> findStudentById(Long id);

}
