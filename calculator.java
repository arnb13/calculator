import java.util.Scanner;


public class calculator {

 public static void main(String[] args) {
  Scanner arn = new Scanner(System.in);
  
  double result1 = 0.0;
  double result2 = 1.0;
  double fr = 0.0;
  
  
  System.out.println("enter a number");
  double num1 = arn.nextDouble();
  
  for (int i = 0; i < 10; i--) {
   System.out.println("+ or - or * or /");
   String wtd = arn.nextLine();
   
   //System.out.println("enter a number");
   //double num2 = arn.nextDouble();
   
   if (wtd.equals("+")) {
    result1 = result1 + num1; //+ num2;
   }
   
   if(wtd.equals("-")) {
    result1 = result1 + num1; //- num2;
   }
   
   if(wtd.equals("*")) {
    result2 = result2 * num1; //* num2;
   }
   
   if(wtd.equals("/")) {
    result2 = result2 / num1; // num2;
   }
   
   if(wtd.equals("=")) {
    fr = result1 + result2;
    System.out.println("result is= " + fr);
    break;
   }
   num1 = 0;
   
  }
  
 }

}
