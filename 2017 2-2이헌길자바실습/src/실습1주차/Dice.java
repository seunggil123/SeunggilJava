package �ǽ�1����;

import java.util.Random;
public class Dice {
	
	int side; //��������
	
	
	public Dice() {
		side=6; //��6�����ʱ�ȭ
	}
	public Dice(int n) {
		side = n; //�鰳������
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
		number=random.nextInt(this.side)+1; //�鰳���Է¹޾� �ʱ�ȭ
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