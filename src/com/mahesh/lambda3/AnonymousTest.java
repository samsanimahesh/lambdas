package com.mahesh.lambda3;

import java.util.List;

public class AnonymousTest {
	public static void main(String[] args) {
		List<Person> personsList = Person.createShortList();
		RoboContactAnon robo = new RoboContactAnon();
		System.out.println("Calling all drivers...");
		robo.phoneContacts(personsList, new MyTest<Person>(){

			@Override
			public boolean test(Person p) {
				return p.getAge() >=16;
			}
			
		});
		
	}

}
