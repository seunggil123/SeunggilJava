package 실습8_2;
import java.util.*;
public class ex2 {
	public static void main(String args[]){ 

		boolean done= false;
		Scanner sc = new Scanner(System.in);
		LinkedQueue male = new LinkedQueue(); //남
		LinkedQueue female = new LinkedQueue(); //여

		while(!done){
			System.out.print("성별과 이름을 입력하시오:<종료는 q> <ex> 남 홍길동 :");
			String inputstr = sc.nextLine();
			if(inputstr.equals("q")) {
				done = true;
				System.out.println("종료되었습니다.");
			}
			else
			{
				if((inputstr.charAt(0)+"").equals("남")) {
					QNode temp = new QNode();
					temp.sex="남";
					temp.name=inputstr.substring(2);
					male.enQueue(temp);
					//남자인 경우 큐에 넣어주기	
				}
				else if((inputstr.charAt(0)+"").equals("여")) {
					QNode temp = new QNode();
					temp.sex="여";
					temp.name=inputstr.substring(2);
					female.enQueue(temp);
					//여자인 경우 큐에 넣어주기
				}
				if(male.isEmpty() || female.isEmpty()) 
					System.out.println("아직 대상자가 없습니다. 기다려주세요");
				
				if(!male.isEmpty() && !female.isEmpty())
				{
					//커플탄생 -> male큐과 female큐가 모두 비어있지 않다.
					System.out.println("============================================================");
					System.out.println("★커플이 탄생하였습니다 : "+(male.deQueue()).name+"과(와) "+(female.deQueue()).name+"★");
					System.out.println("============================================================");
					System.out.print("커플 탄생 후 남자 큐 :");
					male.printQueue();
					System.out.print("커플 탄생 후 여자 큐 :");
					female.printQueue();
					System.out.println();
				}
				else {
					System.out.print("남자 큐 : ");
					male.printQueue();
					System.out.print("여자 큐 : ");
					female.printQueue();
					System.out.println();
				}
			}

		}
	}

}

