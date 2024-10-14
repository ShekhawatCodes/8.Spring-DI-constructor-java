package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	private String name;
	private long rollNo;
	private Address address;

	public Student(String name,long rollNo, Address address) {
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("rollNo : "+rollNo);
		System.out.println("address : "+address);
	}
	
	
}
