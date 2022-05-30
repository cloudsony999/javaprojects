package service;

import entity.Student;
import entity.Teacher;

public class Relation {

	public static void giveClass(Student s) {
		System.out.println("the teacher is teaching " + s.getName());
	}

	public static void takeClass(Teacher t) {
		System.out
				.println("the student is taking class under " + t.getTname() + " and the subject is " + t.getSubject());
	}

}
