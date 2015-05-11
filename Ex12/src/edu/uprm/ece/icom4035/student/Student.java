package edu.uprm.ece.icom4035.student;

public class Student {
	
	private String stdId;
	private String firstName;
	private String lastName;
	private int age;
	private double gpa;
	private String city;
	
	
	
	public Student(String stdId, String firstName, String lastName, int age,
			double gpa, String city) {
		super();
		if (stdId == null){
			throw new IllegalArgumentException("Parameter cannot be null.");
		}
		this.stdId = stdId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.city = city;
	}
	public String getStdId() {
		return stdId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public double getGpa() {
		return gpa;
	}
	public String getCity() {
		return city;
	}
	
	public String toString(){
		return "(" + this.stdId + ", " + this.firstName+ " " + this.lastName + ", " +
				this.age + ", " + this.gpa + ", " + this.city + ")";
	}

}

