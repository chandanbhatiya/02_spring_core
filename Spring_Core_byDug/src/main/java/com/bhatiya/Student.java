package com.bhatiya;

public class Student {
	
	private int StudentId;
	
	private String  StudentName;
	
	private String StudentAddress;

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("setting student id");
		StudentId = studentId;
	}

	public String getStudentName() {
	
		return StudentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("setting student name");
		StudentName = studentName;
	}

	public String getStudentAddress() {
		return StudentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("setting student address");
		StudentAddress = studentAddress;
	}

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentAddress = studentAddress;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}
	
	

}
