package executor;

import entity.Student;
import entity.Teacher;
import service.Relation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ShowName s = new ShowName();
//		s.display(args[0]);

		logic();

	}

	static void logic() {
		Student s1 = new Student();
		s1.setId(100);
		s1.setName("Ankan");
		Teacher t = new Teacher();
		t.setTname("amitava");
		t.setSubject("java");
		Relation.giveClass(s1);
		Relation.takeClass(t);
	}

}
