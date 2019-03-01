package 실습6주차;

public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		int i = 10;  // 기본형
		
		/**
		 * Auto boxing
		 * 기본타입의 값을 자동으로 Wrapper 객체로 변환
		 * ex) int - > Interger
		 * i = 10 -> Integer intObject = 10 기본형 -> 참조형(래퍼클래스)
		 **/
		
		Integer intObject = i; // auto boxing
		System.out.println("intObject = " + intObject);
		
		/**
		 * Wrapper 객체를 자동으로 기본타입의 갑으로 변환
		 * Integer intObject= 10 (참조형) -> int i = 10
		 * 래퍼클래스를 사용하는 이유는 기본타입의 값을 자바클래스에 활용할 수 있도록 
		 * 하기위해서
		 **/
		
		i = intObject + 10; // auto unboxing
		System.out.println("i = " + i);
	}
}