package �ǽ�1����;
	

import java.util.Random;
import java.util.Scanner;
 
public class DiceTest {
 public static void main(String[] args) {
  
  Scanner input=new Scanner(System.in);
 
  Dice dice1 = new Dice(); // �ֻ���1����
  System.out.println("�ֻ��� ���Ǽ�:"+dice1.getDiceside());
  
  System.out.print("�ֻ��� ���� Ƚ�� ����:");
  int n=input.nextInt(); 
  
  int number=0;
  
  for(int i=1; i<=n; i++)
  {
   number=dice1.rollDice(); //rollDice �޼ҵ�ȣ��
   System.out.println(i+"��° ���� "+number);
   //����Ƚ�� �Է�
  }
  
  System.out.println("������� �ֻ��� ���� ��:"+dice1.sum_Dice());
  System.out.println("������� �ֻ��� ������ ���:"+dice1.average_Dice(n));
  
  System.out.println();
  
  System.out.print("�ι�° �ֻ��� ���Ǽ�:");
  int side_n2=input.nextInt();
  Dice dice2 = new Dice(side_n2); //�ι�°�ֻ�������
  
  System.out.println("���� �ֻ��� ���� ��:"+dice2.getDiceside());
  System.out.print("�ֻ��� ���� Ƚ�� ����:");
  int n2=input.nextInt();
  
  for(int i=1; i<=n2; i++)
  {
   number=dice2.rollDice();
   System.out.println(i+"��° ���� "+number);
  }
  
  System.out.println("������� �ֻ��� ���� ��:"+dice2.sum_Dice());
  System.out.println("������� �ֻ��� ������ ���:"+dice2.average_Dice(n2));
  
 }
} 
 