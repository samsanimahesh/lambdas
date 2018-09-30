package com.mahesh.lambda3;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private String surName;
	private int age;
	private String gender;
	private String phone;
	private String address;

	public static class Builder {

		private String givenName = "";
		private String surName = "";
		private int age = 0;
		private String gender = "male";
		private String phone = "";
		private String address = "";

		public Person.Builder givenName(String givenName) {
			this.givenName = givenName;
			return this;
		}

		public Person.Builder surName(String surName) {
			this.surName = surName;
			return this;
		}

		public Person.Builder age(int val) {
			age = val;
			return this;
		}

		public Person.Builder gender(String val) {
			gender = val;
			return this;
		}

		public Person.Builder phoneNumber(String val) {
			phone = val;
			return this;
		}

		public Person.Builder address(String val) {
			address = val;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	private Person(Builder builder) {
		name = builder.givenName;
		surName = builder.surName;
		age = builder.age;
		gender = builder.gender;
		phone = builder.phone;
		address = builder.address;
	}

	private Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	  public String toString(){
	    return "Name: " + name + " " + surName + "\n" + "Age: " + age + "  Gender: " + gender + "\n" ;
	  } 

	  public static List<Person> createShortList(){
	    List<Person> people = new ArrayList<>();
	    
	    people.add(
	      new Person.Builder()
	            .givenName("Bob")
	            .surName("Baker")
	            .age(15)
	            .gender("MALE")
	            .phoneNumber("201-121-4678")
	            .address("44 4th St, Smallville, KS 12333")
	            .build() 
	      );
	    
	    people.add(
	      new Person.Builder()
	            .givenName("Jane")
	            .surName("Doe")
	            .age(25)
	            .gender("FEMALE")
	            .phoneNumber("202-123-4678")
	            .address("33 3rd St, Smallville, KS 12333")
	            .build() 
	      );
	    
	    people.add(
	      new Person.Builder()
	            .givenName("John")
	            .surName("Doe")
	            .age(25)
	            .gender("MALE")
	            .phoneNumber("202-123-4678")
	            .address("33 3rd St, Smallville, KS 12333")
	            .build()
	    );
	    
	    people.add(
	      new Person.Builder()
	            .givenName("James")
	            .surName("Johnson")
	            .age(45)
	            .gender("MALE")
	            .phoneNumber("333-456-1233")
	            .address("201 2nd St, New York, NY 12111")
	            .build()
	    );
	    
	    people.add(
	      new Person.Builder()
	            .givenName("Joe")
	            .surName("Bailey")
	            .age(67)
	            .gender("MALE")
	            .phoneNumber("112-111-1111")
	            .address("111 1st St, Town, CA 11111")
	            .build()
	    );
	    
	    people.add(
	      new Person.Builder()
	            .givenName("Phil")
	            .surName("Smith")
	            .age(55)
	            .gender("MALE")
	            .phoneNumber("222-33-1234")
	            .address("22 2nd St, New Park, CO 222333")
	            .build()
	    );
	    
	    people.add(
	      new Person.Builder()
	            .givenName("Betty")
	            .surName("Jones")
	            .age(85)
	            .gender("FEMALE")
	            .phoneNumber("211-33-1234")
	            .address("22 4th St, New Park, CO 222333")
	            .build()
	    );
	    return people;
	  }
}
