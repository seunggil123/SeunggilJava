package 실습1;

import java.util.Scanner;

public class Q1수현코드 {

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("문자열 입력: ");
         String str = input.nextLine();
         System.out.println("숫자 입력: ");
         int count = input.nextInt();

         char[] array = new char[str.length()];

         for(int j = 0 ; j <array.length; j++) 
            array[j] = str.charAt(j);

         //      for(int j = 0; j<array.length; j++) 
         //         System.out.print(array[j]);

         int index;
         char[] back = new char[count];   //새로운 배열 뒷부분
         char[] front = new char[array.length-count]; //앞부분
          
         index = (array.length-count);
         for(int i = 0 ; i <back.length; i++) {
            back[i] = array[index];
            index++;
         }
         printArray(back);
         index = 0; 
         for(int j = 0 ; j<front.length; j++) {
            front[j] = array[index];
            index++;
         } 
         printArray(front);
         
         int i,j = 0;
         char[] done = new char[array.length];
         for(i =0; i<back.length; i++) 
            done[i] = back[i];
         
         System.out.println(i);
         for(;i<array.length; i++,j++)
            done[i] = front[j];
         printArray(done);
         
      }   

     public static void printArray(char[] array) {
        for(int i = 0; i<array.length; i++) {
           System.out.print(array[i] + " ");
        }
        System.out.println();
     }
}