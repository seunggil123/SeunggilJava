package 실습10;

import java.util.Scanner;

public class UnsupportedFunctionExceptionTest
{
	public static void main(String[] args) {
		throw new UnsupportedFunctionException("지원하지않는 기능입니다", 100);


	}
}