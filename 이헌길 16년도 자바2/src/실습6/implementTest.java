package 실습6;

public class implementTest {

	public static void main(String[] args) {
		
		Employee ems[] = new Employee[3];
		
		ems[0] = new Employee("짱구", 21 , 2000);
		ems[1] = new Employee("짱가", 23 , 4000);
		ems[2] = new Employee("짱아", 25 , 6000);
		
		System.out.println(ems[0].toString());
		
		if(ems[0].compareTo(ems[1])==0)
		{
			System.out.println("급여가 같습니다.");
		}
		else if(ems[0].compareTo(ems[1]) > 0)
		{
			System.out.println("급여가 더 적습니다.");
		}
		else
			System.out.println("급여가 더 많습니다.");
	
		ems[0].compareTo("AA");
	
	}

}
