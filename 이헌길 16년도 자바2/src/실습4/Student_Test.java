package 실습4;

public class Student_Test {

	public static void main(String[] args) {
		
		System.out.println("총 학생 수: " + Student.getStudentNum()+"명");
		
		Student s1 = new Student();
		Student s2 = new Student(20140000,"홍길동");
		
		System.out.println("첫번째 학생의 이름/번호 : "+ s1.getName() + "/" + s1.getNumber());
		System.out.println("두번째 학생의 이름/번호 : "+ s2.getName() + "/" + s2.getNumber());
		
		System.out.println("총 학생 수 1 : "+ Student.getStudentNum() + "명");
		System.out.println("총 학생 수 2 : "+ s1.getStudentNum() + "명");
		System.out.println("총 학생 수 3 : "+ s2.getStudentNum() + "명");
	}

}
