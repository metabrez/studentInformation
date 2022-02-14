package com.student.schoolprinciple.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.schoolprinciple.exception.UserNotFoundException;
import com.student.schoolprinciple.model.Student;
import com.student.schoolprinciple.repo.StudentRepo;
@Service
@Transactional
public class StudentService {
	
private final StudentRepo studentRepo;
@Autowired
public StudentService(StudentRepo studentRepo) {
	this.studentRepo= studentRepo;
}
public Student addStudent(Student student) {
	student.setStudentRollCode(UUID.randomUUID().toString());
	return studentRepo.save(student);
}

public List<Student> findAllStudent(){
	return studentRepo.findAll();
}
public Student updateStudent(Student student) {
	return studentRepo.save(student);
}
public Student findStudentById(Long id) {
	return studentRepo.findStudentById(id).orElseThrow(() -> new UserNotFoundException("User by Id " + id + " was not found"));
}
public void deleteStudent(Long id) {
	studentRepo.deleteStudentById(id);
}
}
