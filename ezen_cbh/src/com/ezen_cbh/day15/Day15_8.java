package com.ezen_cbh.day15;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Set;

public class Day15_8 {
	// 1. Map �÷��� ��ü ����
	public static void main(String[] args) {
		
	
		TreeMap<Integer, String> scores = new TreeMap<>();
			// Ű=integer, ��=string
	// 2. map�� ��ü �ֱ� 
		scores.put( 87, "ȫ�浿");
		scores.put( 98, "�̵���");
		scores.put( 75, "�ڱ��");
		scores.put( 95, "�ſ��");
		scores.put( 80, "���ڹ�");
	
		NavigableMap<Integer, String> desc = scores.descendingMap();
	// Set< Map.Entry<Integer, String> > set = desc.entrySet();
		for( Map.Entry<Integer, String> entry : desc.entrySet() ) {
			System.out.println(entry.getKey()+"-"+entry.getValue() + " ");
		}
	
	// 3. ��������
		NavigableMap<Integer, String> asc = desc.descendingMap();
	
		for( Map.Entry<Integer, String> entry : asc.entrySet() ) {
			System.out.println(entry.getKey()+"-"+entry.getValue() + " ");
		}
	
	
	}
}
