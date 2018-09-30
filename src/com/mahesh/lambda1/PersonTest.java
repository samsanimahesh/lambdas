package com.mahesh.lambda1;

import java.util.ArrayList;
import java.util.List;

import com.mahesh.lambda1.Person.Sex;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.setGender(Sex.MALE);
		person.setName("mahesh");
		person.setEmailAddress("mahesh@gmail.com");
		person.setAge(21);

		Person person2 = new Person();
		person2.setGender(Sex.MALE);
		person2.setName("babu");
		person2.setEmailAddress("mahesh@gmail.com");
		person2.setAge(27);

		Person person3 = new Person();
		person3.setGender(Sex.MALE);
		person3.setName("samsani");
		person3.setEmailAddress("mahesh@gmail.com");
		person3.setAge(22);

		List<Person> personList = new ArrayList<Person>();
		personList.add(person);
		personList.add(person2);
		personList.add(person3);

		PersonTester tester = new PersonTester() {

			@Override
			public boolean testPerson(Person p) {
				if (person.getGender() == Sex.MALE) {
					return true;
				}
				return false;
			}

		};

		PersonTester personTesterLambda = (Person p) -> p.getGender() == Sex.MALE 
														&& p.getAge() > 18
														&& p.getAge() <= 25;

		// filterPersons(personList,tester);
		filterPersons(personList, personTesterLambda);

	}

	private static void filterPersons(List<Person> personList, PersonTester tester) {
		for (Person person : personList) {
			if (tester.testPerson(person)) {
				System.out.println("Obtained person has gender " + person.getName());
			}
		}
	}

}
