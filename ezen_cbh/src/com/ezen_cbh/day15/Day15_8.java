package com.ezen_cbh.day15;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Set;

public class Day15_8 {
	// 1. Map 컬렉션 객체 선언
	public static void main(String[] args) {
		
	
		TreeMap<Integer, String> scores = new TreeMap<>();
			// 키=integer, 값=string
	// 2. map에 객체 넣기 
		scores.put( 87, "홍길동");
		scores.put( 98, "이동수");
		scores.put( 75, "박길순");
		scores.put( 95, "신용권");
		scores.put( 80, "김자바");
	
		NavigableMap<Integer, String> desc = scores.descendingMap();
	// Set< Map.Entry<Integer, String> > set = desc.entrySet();
		for( Map.Entry<Integer, String> entry : desc.entrySet() ) {
			System.out.println(entry.getKey()+"-"+entry.getValue() + " ");
		}
	
	// 3. 오름차순
		NavigableMap<Integer, String> asc = desc.descendingMap();
	
		for( Map.Entry<Integer, String> entry : asc.entrySet() ) {
			System.out.println(entry.getKey()+"-"+entry.getValue() + " ");
		}
	
	
	}
}
