package �ǽ�5;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿",25,1);
		Employee e1 = new Employee("����", 35,2,2000);
		Manager m1 = new Manager("�Ŵ���",38,3,2000,10);
		
		e1.setName("�迵��");
		e1.salaryUp();
		e1.salaryUp();
		
		m1.salaryUp();
		m1.salaryUp();
		m1.setIncen(20);
		
		p1.info();
		System.out.println();
		
		e1.info();
		System.out.println();
		
		m1.info();
		System.out.println();
		
		
	}

}
