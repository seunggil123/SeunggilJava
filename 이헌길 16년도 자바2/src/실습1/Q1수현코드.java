package �ǽ�1;

import java.util.Scanner;

public class Q1�����ڵ� {

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("���ڿ� �Է�: ");
         String str = input.nextLine();
         System.out.println("���� �Է�: ");
         int count = input.nextInt();

         char[] array = new char[str.length()];

         for(int j = 0 ; j <array.length; j++) 
            array[j] = str.charAt(j);

         //      for(int j = 0; j<array.length; j++) 
         //         System.out.print(array[j]);

         int index;
         char[] back = new char[count];   //���ο� �迭 �޺κ�
         char[] front = new char[array.length-count]; //�պκ�
          
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