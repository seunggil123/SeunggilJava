package 실습6;

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
			System.out.println("학생 클래스 입니다.");
			System.out.println("학번 : " + ((Student) p).getNumber());
			System.out.println();
		}
		else if ( p instanceof Employee)
		{	
			System.out.println("직원 클래스 입니다.");
			System.out.println("월급 : " + ((Employee) p).getSalary());
			System.out.println();
		}
		else
		{	
			System.out.println("해당하는 클래스가 없습니다. ");
			System.out.println();	
		}
	}


}
