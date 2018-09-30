package com.mahesh.lambda3;

import java.util.List;

public class RoboContactAnon {
	public void phoneContacts(List<Person> pl, MyTest<Person> aTest){
		for(Person p:pl){
			if (aTest.test(p)){
				roboCall(p);
			}
		}
	}

	private void roboCall(Person p) {
		System.out.println("Calling " + p.getName() + " " + p.getSurName() + " age" + p.getAge());
		
	}
	
}
