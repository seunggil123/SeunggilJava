package �ǽ�1;

import java.util.Scanner;

public class ����ȸ�� {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
         Scanner input = new Scanner(System.in);

         System.out.println("���ڿ� �Է�: ");
         String str = input.nextLine();
         
         //���ڿ� �迭�� �ֱ�
         char[] array = new char[str.length()];
         int i, j = 0;
         for(j = 0 ; j <array.length; j++) 
               array[j] = str.charAt(j);
         printArray(array);
         
         //���ڿ��� �迭�� �Ųٷ� �ֱ�
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
            System.out.println("ȸ���Դϴ�.");
         else
            System.out.println("ȸ���� �ƴմϴ�.");
         
   }
   
     public static void printArray(char[] array) {
        for(int i = 0; i<array.length; i++) {
           System.out.print(array[i] + " ");
        }
        System.out.println();
     }

}