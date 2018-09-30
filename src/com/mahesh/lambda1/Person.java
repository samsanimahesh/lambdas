package com.mahesh.lambda1;

public class Person {
	
	 public enum Sex {
	        MALE, FEMALE
	    }

	    String name;
	    Sex gender;
	    String emailAddress;
	    private int age;
	    
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Sex getGender() {
			return gender;
		}
		public void setGender(Sex gender) {
			this.gender = gender;
		}
		public String getEmailAddress() {
			return emailAddress;
		}
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

	   

}
