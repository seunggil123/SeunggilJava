package �ǽ�6;

public class implementTest {

	public static void main(String[] args) {
		
		Employee ems[] = new Employee[3];
		
		ems[0] = new Employee("¯��", 21 , 2000);
		ems[1] = new Employee("¯��", 23 , 4000);
		ems[2] = new Employee("¯��", 25 , 6000);
		
		System.out.println(ems[0].toString());
		
		if(ems[0].compareTo(ems[1])==0)
		{
			System.out.println("�޿��� �����ϴ�.");
		}
		else if(ems[0].compareTo(ems[1]) > 0)
		{
			System.out.println("�޿��� �� �����ϴ�.");
		}
		else
			System.out.println("�޿��� �� �����ϴ�.");
	
		ems[0].compareTo("AA");
	
	}

}
