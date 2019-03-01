package 실습2주차;

import 실습2주차.Student;

public class Student_Test {

	public static void main(String[] args) {
		
		System.out.println("총 학생 수: " + Student.getStudentNum()+"명");
		
		Student s1 = new Student();
		
		System.out.println("첫번째 학생의 학번/이름 : "+ s1.getNumber() + "/" + s1.getName());
		System.out.println("총 학생 수  : "+ Student.getStudentNum() + "명");
		
		Student s2 = new Student(201712345,"피카츄");
		
		System.out.println("두번째 학생의 학번/이름 : "+ s2.getNumber() + "/" + s2.getName());
		
		System.out.println("총 학생 수  : "+ Student.getStudentNum() + "명");
		
	}

}
