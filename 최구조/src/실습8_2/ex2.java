package �ǽ�8_2;
import java.util.*;
public class ex2 {
	public static void main(String args[]){ 

		boolean done= false;
		Scanner sc = new Scanner(System.in);
		LinkedQueue male = new LinkedQueue(); //��
		LinkedQueue female = new LinkedQueue(); //��

		while(!done){
			System.out.print("������ �̸��� �Է��Ͻÿ�:<����� q> <ex> �� ȫ�浿 :");
			String inputstr = sc.nextLine();
			if(inputstr.equals("q")) {
				done = true;
				System.out.println("����Ǿ����ϴ�.");
			}
			else
			{
				if((inputstr.charAt(0)+"").equals("��")) {
					QNode temp = new QNode();
					temp.sex="��";
					temp.name=inputstr.substring(2);
					male.enQueue(temp);
					//������ ��� ť�� �־��ֱ�	
				}
				else if((inputstr.charAt(0)+"").equals("��")) {
					QNode temp = new QNode();
					temp.sex="��";
					temp.name=inputstr.substring(2);
					female.enQueue(temp);
					//������ ��� ť�� �־��ֱ�
				}
				if(male.isEmpty() || female.isEmpty()) 
					System.out.println("���� ����ڰ� �����ϴ�. ��ٷ��ּ���");
				
				if(!male.isEmpty() && !female.isEmpty())
				{
					//Ŀ��ź�� -> maleť�� femaleť�� ��� ������� �ʴ�.
					System.out.println("============================================================");
					System.out.println("��Ŀ���� ź���Ͽ����ϴ� : "+(male.deQueue()).name+"��(��) "+(female.deQueue()).name+"��");
					System.out.println("============================================================");
					System.out.print("Ŀ�� ź�� �� ���� ť :");
					male.printQueue();
					System.out.print("Ŀ�� ź�� �� ���� ť :");
					female.printQueue();
					System.out.println();
				}
				else {
					System.out.print("���� ť : ");
					male.printQueue();
					System.out.print("���� ť : ");
					female.printQueue();
					System.out.println();
				}
			}

		}
	}

}

