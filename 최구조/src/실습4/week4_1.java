package 실습4;
import java.util.*;
public class week4_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String poly1 = args[0]; //첫번째 다항식
		String poly2 = args[1]; //두번째 다항식
		
			
		String[] split_poly1 = poly1.split("\\+"); //한개의 다항식에서 +를 기준으로 나누기
		//split_poly1 에는  poly1의 각각의 식들이 들어가있다.

		int[] degree1 = new int[split_poly1.length+1]; //차수들을 모아놓은 배열

		/*
		 * 최고차수부터 찾자
		 */
		for(int i=0; i<split_poly1.length; i++) //최고 차수 찾기
		{
			int degree1_index = split_poly1[i].indexOf("^");
			String temp = split_poly1[i].substring(degree1_index+1,split_poly1[i].length());
			degree1[i] = Integer.parseInt(temp);
			//degree1은 차수들을 모아놓은 배열이다.
		}

		int max1 = degree1[0];

		for(int i=0; i<degree1.length; i++)
		{

			for(int j=0; j<degree1.length; j++) {
				if(max1 < degree1[i])
					max1 = degree1[i];
			}
		} //max = 최고차수
		////////////////////
		
		int count1 = max1+1;//최대항의개수 -> 0이여도 포함시켜줘야함
		
		int[] de1 = new int[count1];
		for(int i=0; i<max1+1; i++)
		{
			if(count1-1 == degree1[i])
			{
				de1[i] = degree1[i];
			}
			else
				de1[i] = 0;
			
			count1--;
		}

		count1 = max1;
		int count2 = max1+1;//다시초기화
		
		float[] poly1_coef1 = new float[count2]; //계수 배열(float형)

		
		for(int i=0; i<count2; i++)//poly1에서 각각 한개의 식에서 계수를 추출
		{	
			if(count1 == de1[i] && split_poly1.length > i) {
				int index1 = split_poly1[i].indexOf("x"); //계수의 인덱스찾기
				String coef1_str = split_poly1[i].substring(0,index1); //계수 추출
				poly1_coef1[i] = Float.valueOf(coef1_str); //계수를 float배열에 넣기 
			}
			else if(count1 != de1[i]){
				poly1_coef1[i] = 0; //계수가 없다면 0으로 넣어주기

			}
			count1--;
//			System.out.println(poly1_coef1[i]);
			//			System.out.println(poly1_coef1[i]);
		} // poly1_coef1 -> 계수를 모아놓은 float 배열
		
		////////////////////////////////////////////////////////////////////
		


		String[] split_poly2 = poly2.split("\\+"); //한개의 다항식에서 +를 기준으로 나누기
		//split_poly2 에는  poly2의 각각의 식들이 들어가있다.

		int[] degree2 = new int[split_poly2.length+1]; //차수들을 모아놓은 배열

		/*
		 * 최고차수부터 찾자
		 */
		for(int i=0; i<split_poly2.length; i++) //최고 차수 찾기
		{
			int degree2_index = split_poly2[i].indexOf("^");
			String temp = split_poly2[i].substring(degree2_index+1,split_poly2[i].length());
			degree2[i] = Integer.parseInt(temp);
			//degree2은 차수들을 모아놓은 배열이다.
		}

		int max2 = degree2[0];

		for(int i=0; i<degree2.length; i++)
		{

			for(int j=0; j<degree2.length; j++) {
				if(max2 < degree2[i])
					max2 = degree2[i];
			}
		} //max = 최고차수
		////////////////////
		
		int count3 = max2+1;//최대항의개수 -> 0이여도 포함시켜줘야함
		
		int[] de2 = new int[count3];
		for(int i=0; i<max2+1; i++)
		{
			if(count3-1 == degree2[i])
			{
				de2[i] = degree2[i];
			}
			else //count3와 같지않으면 degree에있는 차수들은 뒤로 한칸씩 밀려야한다.
			{
				for(int k=degree2.length-1; k>i; k--)
				{
					degree2[k] = degree2[k-1];
				}
				de2[i] = 0;
			}
			count3--;
		}

		count3 = max2;
		int count4 = max2+1;//다시초기화
		
		float[] poly2_coef2 = new float[count4]; //계수 배열(float형)


		int coef_minus=0;
		for(int i=0; i<count4; i++)//poly1에서 각각 한개의 식에서 계수를 추출
		{	
			if(count3 == de2[i] && split_poly2.length >= i) {
				int index2 = split_poly2[coef_minus].indexOf("x"); //계수의 인덱스찾기
				String coef2_str = split_poly2[coef_minus].substring(0,index2); //계수 추출
				poly2_coef2[i] = Float.valueOf(coef2_str); //계수를 float배열에 넣기 
				
			}
			else if(count3 != de2[i]){
				poly2_coef2[i] = 0;//계수가 없다면 0으로 넣어주기
				coef_minus--;

			}
			coef_minus++;
			count3--;
			//			System.out.println(poly1_coef1[i]);
		} // poly1_coef1 -> 계수를 모아놓은 float 배열



		//		float a[] = new float[] {4,3,5,0}; //계수 
		//		float b[] = new float[] {3,1,1};

		Polynomial A = new Polynomial(max1,poly1_coef1); //3 -> 차수 (3차항)
		Polynomial B = new Polynomial(max2,poly2_coef2);
		OperatePoly optPoly = new OperatePoly();
		Polynomial C = optPoly.addPoly(A,B);

		System.out.println("A(x) = ");
		A.printPoly();
		System.out.println("B(x) = ");
		B.printPoly();
		System.out.println("C(x) = ");
		C.printPoly();
	}
}


class OperatePoly{
	private int degree_A=0, degree_B=0, degree_C=0, index_A=0,index_B=0,
			index_C=0;


	private int expo_A, expo_B; 
	private float coef_A, coef_B, coef_C; // 계수

	public Polynomial addPoly(Polynomial A, Polynomial B){
		degree_A = A.getDegree();
		degree_B = B.getDegree();
		expo_A = degree_A;
		expo_B = degree_B;

		if(degree_A >= degree_B) // degree = 차수
			degree_C=degree_A;
		else 
			degree_C=degree_B; //높은 차수 판별

		Polynomial C = new Polynomial(degree_C);
		while(index_A <= degree_A && index_B <= degree_B){
			if(expo_A > expo_B){
				C.setCoef(index_C++, A.getCoef(index_A++));
				expo_A--;
			}
			else if(expo_A == expo_B){
				C.setCoef(index_C++, A.getCoef(index_A++)+B.getCoef(index_B++));
				expo_A--; 
				expo_B--;
			}
			else 
			{
				C.setCoef(index_C++, B.getCoef(index_B++));
				expo_B--;
			}
		}
		return C;
	}
}

class Polynomial //Polynomial = 다항식
{
	private int degree;
	private float coef[]=new float[20];

	Polynomial (int degree, float coef[])
	{
		this.degree = degree;
		this.coef = coef;
	}

	Polynomial (int degree){
		this.degree = degree;
		for(int i=0; i<=degree; i++)
			this.coef[i] = 0;
	}
	public int getDegree(){
		return this.degree;
	}
	public float getCoef(int i){
		return this.coef[i];
	}
	public float setCoef(int i, float coef){
		return this.coef[i]=coef;
	}
	public void printPoly(){
		int temp= this.degree;
		for(int i=0; i<=this.degree; i++){
			System.out.printf("%3.0fx^%d", this.coef[i], temp--);
		}

		System.out.println();
	}
}