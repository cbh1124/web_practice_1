package com.ezen_cbh.day14;

import java.util.Arrays;

import com.ezen_cbh.day7.Person;

public class Day14_2 {
	public static void main(String[] args) {
		
		// ���׸� 
			// 1. ��ü������ new ������ �Ұ� 
		
		//19��°�� 
		Course<Person> personCourse = new Course<>("�Ϲ��ΰ���", 5);
			// Person Ŭ������ �迭�� ���� 
			personCourse.add(new Person("�Ϲ���"));
			personCourse.add(new Worker("������"));
			personCourse.add(new Student("�л�"));
			personCourse.add(new HighStudent("����л�"));
				// �ش� �迭�� add�� �Ϲ���, ������, �л�, ����л� 
			
		Course<Worker> workerCourse = new Course<>("�����ΰ���", 5);
			//workerCourse.add(new Person("�Ϲ���"));
			workerCourse.add(new Worker("������"));
			//workerCourse.add(new Student("�л�"));
			//workerCourse.add(new HighStudent("����л�"));
			
		Course<Student> studentCourse = new Course<>("�л�����", 5);
			//studentCourse.add(new Person("�Ϲ���"));
			//studentCourse.add(new Worker("������"));
			studentCourse.add(new Student("�л�"));
			studentCourse.add(new HighStudent("����л�"));
				// Student Ŭ������ �迭�� ����
				// �ش� �迭�� add�� �л�, ����л� 
			
		Course<HighStudent> highStudentCourse = new Course<>("����л�����", 5);
			//highStudentCourse.add(new Person("�Ϲ���"));
			//highStudentCourse.add(new Worker("������"));
			//highStudentCourse.add(new Student("�л�"));
			highStudentCourse.add(new HighStudent("����л�"));
				// highStudent Ŭ������ �迭�� ���� 
				// �ش� �迭�� add�� ����л�
	} // main ��
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
	
	// �ڽ� �ο� ��� ��� �޼ҵ� // ? : ���ϵ� ī�� [��� Ŭ���� ����]
	public static void registerCourse(Course<?> course ) {
		System.out.println(course.getName() + "������ ��� : " + 
					Arrays.toString(course.getStudents() ));
	}									//�ڽ��� �迭 ȣ�� 
	
	// �л� ��� ��� �޼ҵ� // ?super �л� [�л� Ŭ�����κ��� ��ӹ��� Ŭ������ ����(��������)]
	public static void registerCourseStudent(Course<? extends Student > course) {
		System.out.println(course.getName() + "������ ��� : " + 
				Arrays.toString(course.getStudents() ));
	}
	
	// ������ ��� ��� �޼ҵ� // ?super ������  [������ Ŭ������ �θ�Ŭ������ ����(��������)]
	public static void registerCourseWorker( Course<? super Worker> course) {
		System.out.println(course.getName() + "������ ��� : " + 
				Arrays.toString(course.getStudents() ));
	}
}
