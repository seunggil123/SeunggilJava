package �ǽ�6;

public class casting_Test {

	public static void main(String[] args) {

		Person persons[] = new Person[3];

		persons[0] = new Student();
		persons[1] = new Employee();
		persons[2] = new Person();

		((Student)persons[0]).studentInfo();
		System.out.println();
		((Employee)persons[1]).employeeInfo();
		System.out.println();
		persons[2].info();

		System.out.println("\n---------------\n");
		for(int i=0; i<3; i++)
			printData(persons[i]);
		System.out.println();


	}
	public static void printData(Person p)
	{
		if( p instanceof Student)
		{
			System.out.println("�л� Ŭ���� �Դϴ�.");
			System.out.println("�й� : " + ((Student) p).getNumber());
			System.out.println();
		}
		else if ( p instanceof Employee)
		{	
			System.out.println("���� Ŭ���� �Դϴ�.");
			System.out.println("���� : " + ((Employee) p).getSalary());
			System.out.println();
		}
		else
		{	
			System.out.println("�ش��ϴ� Ŭ������ �����ϴ�. ");
			System.out.println();	
		}
	}


}
