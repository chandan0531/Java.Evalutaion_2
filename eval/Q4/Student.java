package com.eval.Q4;

public class Student extends Person {
	
	int studentId;
	String courseEnrolled;
	int courseFee;
	
	@Override
	public String toString() {
		
		return studentId +courseEnrolled + courseFee  ;
	}
}
