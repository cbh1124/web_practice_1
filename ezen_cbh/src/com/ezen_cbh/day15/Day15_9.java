package com.ezen_cbh.day15;

import java.util.Iterator;
import java.util.TreeSet;

public class Day15_9 {
	public static void main(String[] args) {
		TreeSet< Person > treeSet = new TreeSet<>();
		
		// 2. tree ��ü �ֱ� 
		treeSet.add(new Person("ȫ�浿", 45) );
		treeSet.add(new Person("���ڹ�", 25) );
		treeSet.add(new Person("������", 31) );
		
		// 3. ���� �������� �������� 
		Iterator<Person> iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			Person person = iterator.next();
			
			System.out.println(person.name + "\t" + person.age );
		}
	}
	
	
}
