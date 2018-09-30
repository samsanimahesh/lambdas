package com.mahesh.lambda3;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaTest {
	public static void main(String[] args) {
		List<Person> personsList = Person.createShortList();
		RoboContactLambda robo = new RoboContactLambda();
		
		Predicate<Person> allDrivers = (p)->p.getAge()>18;
		Predicate<Person> allDraftees = p -> p.getAge() >= 18 && p.getAge() <= 25 && p.getGender().equals("MALE");
		Predicate<Person> allPilots = p -> p.getAge() >= 23 && p.getAge() <= 65;
		System.out.println("All drivers.....");
		robo.phoneContacts(personsList, allDrivers);
		System.out.println("All draftees....");
		robo.emailContacts(personsList,allDraftees);
		System.out.println("All pilots");
		robo.mailContacts(personsList, allPilots);
		System.out.println("====================================================");
		personsList.stream().filter(allDrivers).collect(Collectors.toList()).forEach(p->System.out.println(p));;
		System.out.println("====================================================");
		System.out.println("using for each");
		personsList.forEach(p->System.out.println(p));
	}

}
