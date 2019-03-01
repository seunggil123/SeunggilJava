package IntegerCalc;

import java.util.*;
import java.io.*;

public class IntegerCalcTest {

   public static void main(String[] args) throws FileNotFoundException {
      String fileName = "testcase.txt";
      Scanner in = new Scanner(new File(fileName));
      PrintStream out = new PrintStream("output.txt");
      
      while(in.hasNext()) {
         String firstBigInteger = in.nextLine();
         String secondBigInteger = in.nextLine();
         BigIntegerCalc BICalc = new BigIntegerCalc(firstBigInteger, secondBigInteger);
         
         out.println(firstBigInteger);
         out.println(secondBigInteger);
         out.println("Add : " + BICalc.addBigInteger());
         out.println("Sub : " + BICalc.subBigInteger());
         
         if(in.hasNext())
            in.nextLine();   // 공백 라인 구분선
      }
      in.close();
      out.close();

   }

}