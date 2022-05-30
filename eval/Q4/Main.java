package com.eval.Q4;

public class Main {
	
	
	public static Person generatePerson(Person person) {
		
		return person;
	}
	
	@Override
	public String toString() {

		return "name";
	}
		
		public static void main(String[] args) {
			Main m = new Main();
				Student s = new Student();
				Person p = new Person();
				Instructor i = new Instructor();
				p.address = new Address();
				
				
				p.gender = "male";
				p.name = "Some";
				p.address.city = "HZ";
				p.address.pincode = "123456";
				
				
				Person newStudent = Main.generatePerson(new Student());
				Person newInstructor = Main.generatePerson(new Instructor());
				
				System.out.println(p.gender);
		}
	
}
