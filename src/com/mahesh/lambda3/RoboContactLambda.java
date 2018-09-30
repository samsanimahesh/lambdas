package com.mahesh.lambda3;

import java.util.List;
import java.util.function.Predicate;

public class RoboContactLambda {
	public void phoneContacts(List<Person> pl, Predicate<Person> aTest){
		for(Person p:pl){
			if (aTest.test(p)){
				roboCall(p);
			}
		}
	}
	
	public void emailContacts(List<Person> personsList, Predicate<Person> allDraftees) {
		for(Person p:personsList){
			if (allDraftees.test(p)){
				roboCall(p);
			}
		}
		
	}
	
	public void mailContacts(List<Person> personsList, Predicate<Person> allPilots) {
		for(Person p:personsList){
			if (allPilots.test(p)){
				roboCall(p);
			}
		}
	}

	private void roboCall(Person p) {
		System.out.println("Calling " + p.getName() + " " + p.getSurName() + " age" + p.getAge());
	}
}
