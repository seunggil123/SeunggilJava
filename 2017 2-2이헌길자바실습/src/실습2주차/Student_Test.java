package �ǽ�2����;

import �ǽ�2����.Student;

public class Student_Test {

	public static void main(String[] args) {
		
		System.out.println("�� �л� ��: " + Student.getStudentNum()+"��");
		
		Student s1 = new Student();
		
		System.out.println("ù��° �л��� �й�/�̸� : "+ s1.getNumber() + "/" + s1.getName());
		System.out.println("�� �л� ��  : "+ Student.getStudentNum() + "��");
		
		Student s2 = new Student(201712345,"��ī��");
		
		System.out.println("�ι�° �л��� �й�/�̸� : "+ s2.getNumber() + "/" + s2.getName());
		
		System.out.println("�� �л� ��  : "+ Student.getStudentNum() + "��");
		
	}

}
