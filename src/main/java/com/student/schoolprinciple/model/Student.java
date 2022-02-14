package com.student.schoolprinciple.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(nullable=false, updatable=false )
private Long id;
private String name;
private String email;
private String preferredSubject;
private String phone;
private String imageUrl;
@Column(nullable=false, updatable=false )
private String studentRollCode;
public Student() {
	super();
}
public Student(String name, String email, String preferredSubject, String phone, String imageUrl,
		String studentRollCode) {
	super();
	this.name = name;
	this.email = email;
	this.preferredSubject = preferredSubject;
	this.phone = phone;
	this.imageUrl = imageUrl;
	this.studentRollCode = studentRollCode;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPreferredSubject() {
	return preferredSubject;
}
public void setPreferredSubject(String preferredSubject) {
	this.preferredSubject = preferredSubject;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getImageUrl() {
	return imageUrl;
}
public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}
public String getStudentRollCode() {
	return studentRollCode;
}
public void setStudentRollCode(String studentRollCode) {
	this.studentRollCode = studentRollCode;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", preferredSubject=" + preferredSubject
			+ ", phone=" + phone + ", imageUrl=" + imageUrl + ", studentRollCode=" + studentRollCode + "]";
}


}
