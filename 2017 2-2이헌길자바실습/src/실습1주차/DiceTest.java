package 실습1주차;
	

import java.util.Random;
import java.util.Scanner;
 
public class DiceTest {
 public static void main(String[] args) {
  
  Scanner input=new Scanner(System.in);
 
  Dice dice1 = new Dice(); // 주사위1생성
  System.out.println("주사위 면의수:"+dice1.getDiceside());
  
  System.out.print("주사위 굴림 횟수 설정:");
  int n=input.nextInt(); 
  
  int number=0;
  
  for(int i=1; i<=n; i++)
  {
   number=dice1.rollDice(); //rollDice 메소드호출
   System.out.println(i+"번째 굴림 "+number);
   //굴릴횟수 입력
  }
  
  System.out.println("현재까지 주사위 눈금 합:"+dice1.sum_Dice());
  System.out.println("현재까지 주사위 눈금의 평균:"+dice1.average_Dice(n));
  
  System.out.println();
  
  System.out.print("두번째 주사위 면의수:");
  int side_n2=input.nextInt();
  Dice dice2 = new Dice(side_n2); //두번째주사위생성
  
  System.out.println("현재 주사위 면의 수:"+dice2.getDiceside());
  System.out.print("주사위 굴림 횟수 설정:");
  int n2=input.nextInt();
  
  for(int i=1; i<=n2; i++)
  {
   number=dice2.rollDice();
   System.out.println(i+"번째 굴림 "+number);
  }
  
  System.out.println("현재까지 주사위 눈금 합:"+dice2.sum_Dice());
  System.out.println("현재까지 주사위 눈금의 평균:"+dice2.average_Dice(n2));
  
 }
} 
 