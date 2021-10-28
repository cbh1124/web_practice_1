package com.ezen_cbh.day15;

public class Person implements Comparable<Person> {
						// Comparable<정렬 대상> : 정렬 인터페이스
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
	
		if(age < o.age ) return -1;
		else if(age == o.age) return 0;
		else return 1;
	}
}
