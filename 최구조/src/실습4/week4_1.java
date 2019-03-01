package �ǽ�4;
import java.util.*;
public class week4_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String poly1 = args[0]; //ù��° ���׽�
		String poly2 = args[1]; //�ι�° ���׽�
		
			
		String[] split_poly1 = poly1.split("\\+"); //�Ѱ��� ���׽Ŀ��� +�� �������� ������
		//split_poly1 ����  poly1�� ������ �ĵ��� ���ִ�.

		int[] degree1 = new int[split_poly1.length+1]; //�������� ��Ƴ��� �迭

		/*
		 * �ְ��������� ã��
		 */
		for(int i=0; i<split_poly1.length; i++) //�ְ� ���� ã��
		{
			int degree1_index = split_poly1[i].indexOf("^");
			String temp = split_poly1[i].substring(degree1_index+1,split_poly1[i].length());
			degree1[i] = Integer.parseInt(temp);
			//degree1�� �������� ��Ƴ��� �迭�̴�.
		}

		int max1 = degree1[0];

		for(int i=0; i<degree1.length; i++)
		{

			for(int j=0; j<degree1.length; j++) {
				if(max1 < degree1[i])
					max1 = degree1[i];
			}
		} //max = �ְ�����
		////////////////////
		
		int count1 = max1+1;//�ִ����ǰ��� -> 0�̿��� ���Խ��������
		
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
		int count2 = max1+1;//�ٽ��ʱ�ȭ
		
		float[] poly1_coef1 = new float[count2]; //��� �迭(float��)

		
		for(int i=0; i<count2; i++)//poly1���� ���� �Ѱ��� �Ŀ��� ����� ����
		{	
			if(count1 == de1[i] && split_poly1.length > i) {
				int index1 = split_poly1[i].indexOf("x"); //����� �ε���ã��
				String coef1_str = split_poly1[i].substring(0,index1); //��� ����
				poly1_coef1[i] = Float.valueOf(coef1_str); //����� float�迭�� �ֱ� 
			}
			else if(count1 != de1[i]){
				poly1_coef1[i] = 0; //����� ���ٸ� 0���� �־��ֱ�

			}
			count1--;
//			System.out.println(poly1_coef1[i]);
			//			System.out.println(poly1_coef1[i]);
		} // poly1_coef1 -> ����� ��Ƴ��� float �迭
		
		////////////////////////////////////////////////////////////////////
		


		String[] split_poly2 = poly2.split("\\+"); //�Ѱ��� ���׽Ŀ��� +�� �������� ������
		//split_poly2 ����  poly2�� ������ �ĵ��� ���ִ�.

		int[] degree2 = new int[split_poly2.length+1]; //�������� ��Ƴ��� �迭

		/*
		 * �ְ��������� ã��
		 */
		for(int i=0; i<split_poly2.length; i++) //�ְ� ���� ã��
		{
			int degree2_index = split_poly2[i].indexOf("^");
			String temp = split_poly2[i].substring(degree2_index+1,split_poly2[i].length());
			degree2[i] = Integer.parseInt(temp);
			//degree2�� �������� ��Ƴ��� �迭�̴�.
		}

		int max2 = degree2[0];

		for(int i=0; i<degree2.length; i++)
		{

			for(int j=0; j<degree2.length; j++) {
				if(max2 < degree2[i])
					max2 = degree2[i];
			}
		} //max = �ְ�����
		////////////////////
		
		int count3 = max2+1;//�ִ����ǰ��� -> 0�̿��� ���Խ��������
		
		int[] de2 = new int[count3];
		for(int i=0; i<max2+1; i++)
		{
			if(count3-1 == degree2[i])
			{
				de2[i] = degree2[i];
			}
			else //count3�� ���������� degree���ִ� �������� �ڷ� ��ĭ�� �з����Ѵ�.
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
		int count4 = max2+1;//�ٽ��ʱ�ȭ
		
		float[] poly2_coef2 = new float[count4]; //��� �迭(float��)


		int coef_minus=0;
		for(int i=0; i<count4; i++)//poly1���� ���� �Ѱ��� �Ŀ��� ����� ����
		{	
			if(count3 == de2[i] && split_poly2.length >= i) {
				int index2 = split_poly2[coef_minus].indexOf("x"); //����� �ε���ã��
				String coef2_str = split_poly2[coef_minus].substring(0,index2); //��� ����
				poly2_coef2[i] = Float.valueOf(coef2_str); //����� float�迭�� �ֱ� 
				
			}
			else if(count3 != de2[i]){
				poly2_coef2[i] = 0;//����� ���ٸ� 0���� �־��ֱ�
				coef_minus--;

			}
			coef_minus++;
			count3--;
			//			System.out.println(poly1_coef1[i]);
		} // poly1_coef1 -> ����� ��Ƴ��� float �迭



		//		float a[] = new float[] {4,3,5,0}; //��� 
		//		float b[] = new float[] {3,1,1};

		Polynomial A = new Polynomial(max1,poly1_coef1); //3 -> ���� (3����)
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
	private float coef_A, coef_B, coef_C; // ���

	public Polynomial addPoly(Polynomial A, Polynomial B){
		degree_A = A.getDegree();
		degree_B = B.getDegree();
		expo_A = degree_A;
		expo_B = degree_B;

		if(degree_A >= degree_B) // degree = ����
			degree_C=degree_A;
		else 
			degree_C=degree_B; //���� ���� �Ǻ�

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

class Polynomial //Polynomial = ���׽�
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