package 동물찾기;

import java.util.Random;
import java.util.Scanner;

/**
 * 3x3의 배열에 랜덤으로 세가지 클래스 생성
같은크기의 String 배열 생성
초기값 = "?"

유저는 "?" 의 위치에 맞는 동물이름을 맞춰야 한다.
화면에는 ? 로 이루어진 배열과 남아있는 동물의 수가 나온다.
남아있는 동물의 수를 보고 ? 안에 어떤 동물이 있는지 맞춰본다.
다 맞추면 Game Over

 * @author user
 *
 */
public class Test {

	final static int a = 3;
	final static int b = 3;
	//	static Animal animal[][];
	static String[][] q;

	public static void main(String[] args) {
		//배열 생성
		Animal[][] animal = new Animal[a][b];
		q = new String[a][b];

		//클래스 인스턴스 생성
		Cat cat = new Cat();
		Dog dog = new Dog();
		Lion lion = new Lion();

		//랜덤  숫자 9개 생성
		Random rand = new Random();
		int[] x = new int[a*b];
		for(int i = 0 ; i < x.length; i++ ){
			x[i] = 1 + rand.nextInt(3);
//			System.out.println(x[i]);
		}

		// animal 카운트
		int catCount = 0;
		int dogCount = 0;
		int lionCount = 0;
		/**
		 * x[i] 배열의 변수와 비교하여 1-강아지, 2-고양이, 3-사자
		 */
		// 배열 초기화
		int k=0;
		for(int i = 0 ; i <animal.length; i++) {
			for(int j = 0; j<animal[i].length; j++) {
				if(x[k]==1) {
					animal[i][j] =cat;
					catCount ++;
					k++;
				}
				else if(x[k]==2) {
					animal[i][j] = dog;
					dogCount++;
					k++;
				}
				else {
					animal[i][j] = lion;
					lionCount++;
					k++;
				}
				q[i][j] = "?";
			}
		}

//		//게임 전 테스트
//		for(int i = 0 ; i <a; i++) {
//			for(int j = 0; j<b; j++) {
//				System.out.print(animal[i][j].name+"\t");
//			}
//			System.out.println();
//		}
//		for(int i = 0 ; i <a*b; i++) {
//			System.out.print(x[i] + "/");
//		}
//		System.out.println();

		//게임전 변수설정
		Scanner in = new Scanner(System.in);
		int row = 0;	//입력 받을 좌표
		int col = 0;
		String target = "";
		boolean s = true;
		//게임 시작
		while(s) {
			System.out.println("#########################");
			printArray(q);
			System.out.println("#########################");
			System.out.println("남은 고양이 수 : " + catCount);
			System.out.println("남은 강아지 수 : " + dogCount);
			System.out.println("남은 사자 수 : " + lionCount);
			System.out.println();
			System.out.println("좌표와 동물 선택 : ");	//좌표 , 동물

			row = in.nextInt();
			col = in.nextInt();
			target = in.nextLine().trim();	//nextLine으로 받아오면 앞 공백이 생겨서 trim.
			System.out.println(target);

			if(row>=a ||col>=b ||row<0||col<0 || animal[row][col]==null) {
				System.out.println("\n틀렸습니다.");
				continue;
			}
			else if(animal[row][col].name.equals(target)) {	//맞음
				q[row][col] = target;
				animal[row][col]=null;
				if(target.equals("고양이")) catCount --;
				else if(target.equals("강아지")) dogCount --;
				else if(target.equals("사자")) lionCount--;
			}
			else {
				System.out.println("\n틀렸습니다.");
			}
			if(catCount+dogCount+lionCount == 0) {
				System.out.println("############################");
				System.out.println("\tGame Over!");
				System.out.println("############################");
				System.out.println("\nAnimal Array");
				printArray(q);
				s = false;	//게임 종료
			}
		}
	}

	public static void printArray(String[][] arr){
		for(int i = 0 ; i <arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
