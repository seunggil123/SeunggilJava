package 실습1주차;

import java.util.Random;
public class Dice {
	
	int side; //전역변수
	
	
	public Dice() {
		side=6; //면6으로초기화
	}
	public Dice(int n) {
		side = n; //면개수변경
	}
	public int getDiceside() {
		this.side=side;
		return side;
	}
	public void changeDiceside(int n) {
		this.side = n;
	}
	int sum;
	
	public int rollDice()
	{
		Random random=new Random();
		int number=0;
		number=random.nextInt(this.side)+1; //면개수입력받아 초기화
		this.sum=sum+number;
		
		return number;
 
	}
	public int sum_Dice()
	{
		this.sum = sum;
		return sum;
	}
 
	public double average_Dice(int n)
	{
		double average=(double)this.sum/n;
		return average;
	}
} 