package edu.cjc.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int StudentId;
	private String StudentFullName;
	private String StudentEmail;
	private byte StudentAge;
	private String StudentCollageName;
	private String StudentCourse;
	private String BatchNumber;
	private String BatchMode;
	private String feesPaid;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentFullName() {
		return StudentFullName;
	}
	public void setStudentFullName(String studentFullName) {
		StudentFullName = studentFullName;
	}
	public String getStudentEmail() {
		return StudentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}
	public byte getStudentAge() {
		return StudentAge;
	}
	public void setStudentAge(byte studentAge) {
		StudentAge = studentAge;
	}
	public String getStudentCollageName() {
		return StudentCollageName;
	}
	public void setStudentCollageName(String studentCollageName) {
		StudentCollageName = studentCollageName;
	}
	public String getStudentCourse() {
		return StudentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		StudentCourse = studentCourse;
	}
	public String getBatchNumber() {
		return BatchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		BatchNumber = batchNumber;
	}
	public String getBatchMode() {
		return BatchMode;
	}
	public void setBatchMode(String batchMode) {
		BatchMode = batchMode;
	}
	public String getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(String feesPaid) {
		this.feesPaid = feesPaid;
	}
	

}
