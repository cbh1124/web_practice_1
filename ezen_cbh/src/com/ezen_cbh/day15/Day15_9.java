package com.ezen_cbh.day15;

import java.util.Iterator;
import java.util.TreeSet;

public class Day15_9 {
	public static void main(String[] args) {
		TreeSet< Person > treeSet = new TreeSet<>();
		
		// 2. tree 객체 넣기 
		treeSet.add(new Person("홍길동", 45) );
		treeSet.add(new Person("김자바", 25) );
		treeSet.add(new Person("박지원", 31) );
		
		// 3. 나이 기준으로 오름차순 
		Iterator<Person> iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			Person person = iterator.next();
			
			System.out.println(person.name + "\t" + person.age );
		}
	}
	
	
}
