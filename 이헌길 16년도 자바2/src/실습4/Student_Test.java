package �ǽ�4;

public class Student_Test {

	public static void main(String[] args) {
		
		System.out.println("�� �л� ��: " + Student.getStudentNum()+"��");
		
		Student s1 = new Student();
		Student s2 = new Student(20140000,"ȫ�浿");
		
		System.out.println("ù��° �л��� �̸�/��ȣ : "+ s1.getName() + "/" + s1.getNumber());
		System.out.println("�ι�° �л��� �̸�/��ȣ : "+ s2.getName() + "/" + s2.getNumber());
		
		System.out.println("�� �л� �� 1 : "+ Student.getStudentNum() + "��");
		System.out.println("�� �л� �� 2 : "+ s1.getStudentNum() + "��");
		System.out.println("�� �л� �� 3 : "+ s2.getStudentNum() + "��");
	}

}
