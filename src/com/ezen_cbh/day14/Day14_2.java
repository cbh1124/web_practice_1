package com.ezen_cbh.day14;

import java.util.Arrays;

import com.ezen_cbh.day7.Person;

public class Day14_2 {
	public static void main(String[] args) {
		
		// 제네릭 
			// 1. 자체적으로 new 연산자 불가 
		
		//19번째줄 
		Course<Person> personCourse = new Course<>("일반인과정", 5);
			// Person 클래스로 배열이 생성 
			personCourse.add(new Person("일반인"));
			personCourse.add(new Worker("직장인"));
			personCourse.add(new Student("학생"));
			personCourse.add(new HighStudent("고등학생"));
				// 해당 배열에 add는 일반인, 직장인, 학생, 고등학생 
			
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
			//workerCourse.add(new Person("일반인"));
			workerCourse.add(new Worker("직장인"));
			//workerCourse.add(new Student("학생"));
			//workerCourse.add(new HighStudent("고등학생"));
			
		Course<Student> studentCourse = new Course<>("학생과정", 5);
			//studentCourse.add(new Person("일반인"));
			//studentCourse.add(new Worker("직장인"));
			studentCourse.add(new Student("학생"));
			studentCourse.add(new HighStudent("고등학생"));
				// Student 클래스로 배열이 생성
				// 해당 배열에 add는 학생, 고등학생 
			
		Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
			//highStudentCourse.add(new Person("일반인"));
			//highStudentCourse.add(new Worker("직장인"));
			//highStudentCourse.add(new Student("학생"));
			highStudentCourse.add(new HighStudent("고등학생"));
				// highStudent 클래스로 배열이 생성 
				// 해당 배열에 add는 고등학생
	} // main 끝
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
	
	// 코스 인원 명단 출력 메소드 // ? : 와일드 카드 [모든 클래스 대응]
	public static void registerCourse(Course<?> course ) {
		System.out.println(course.getName() + "수강생 명단 : " + 
					Arrays.toString(course.getStudents() ));
	}									//코스내 배열 호출 
	
	// 학생 목록 출력 메소드 // ?super 학생 [학생 클래스로부터 상속받은 클래스만 가능(본인포함)]
	public static void registerCourseStudent(Course<? extends Student > course) {
		System.out.println(course.getName() + "수강생 명단 : " + 
				Arrays.toString(course.getStudents() ));
	}
	
	// 직장인 목록 출력 메소드 // ?super 직장인  [직장인 클래스의 부모클래스만 가능(본인포함)]
	public static void registerCourseWorker( Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생 명단 : " + 
				Arrays.toString(course.getStudents() ));
	}
}
