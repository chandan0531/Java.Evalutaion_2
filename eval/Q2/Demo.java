package com.eval.Q2;

import java.util.Scanner;
public class Demo {
	
	int funAverage(Student[] s) {
		
		int average = 0;
		for(Student student:s) {
			average = average + student.getMarks();
		}
		return average/s.length;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student number");
		int num = sc.nextInt();
		
		Student[] s = new Student[num];
		
		
		for (int i = 0; i < s.length; i++) {
			
			System.out.println("Enter student details" + "i+1");
			
			System.out.println("Enter roll");
			int roll = sc.nextInt();
			
			System.out.println("Enter Name");
			String name = sc.next();
			
			System.out.println("Enter Address");
			String address = sc.next();
			
			System.out.println("Enter Marks");
			int marks = sc.nextInt();
			
			s[i] = new Student(roll,name,address,marks);
		}
		
		
		System.out.println("print student details");
		
		for(Student student:s) {
			
			System.out.println("Roll  : " + student.getRoll());
			System.out.println("Name  : " + student.getName());
			System.out.println("Address  : " + student.getAddress());
			System.out.println("Marks  : " + student.getMarks());
		}
		
		Demo d1 = new Demo();
		
		int result = d1.funAverage(s);
		System.out.println(result);
	}
}
