package 실습1;

import java.util.Scanner;

public class 수현회문 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
         Scanner input = new Scanner(System.in);

         System.out.println("문자열 입력: ");
         String str = input.nextLine();
         
         //문자열 배열에 넣기
         char[] array = new char[str.length()];
         int i, j = 0;
         for(j = 0 ; j <array.length; j++) 
               array[j] = str.charAt(j);
         printArray(array);
         
         //문자열을 배열에 거꾸로 넣기
         char[] backArray = new char[array.length];
         j = backArray.length-1;
         for(i = 0 ; i<array.length; i++) {
            backArray[j] = array[i];
            j--;
         }
         printArray(backArray);
         boolean reverse = false;
         for(i=0 ; i<array.length; i++ ) {
            if(array[i] == (backArray[i]))
               reverse = true;
         }
         
         if(reverse)
            System.out.println("회문입니다.");
         else
            System.out.println("회문이 아닙니다.");
         
   }
   
     public static void printArray(char[] array) {
        for(int i = 0; i<array.length; i++) {
           System.out.print(array[i] + " ");
        }
        System.out.println();
     }

}