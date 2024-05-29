/* 
Swap Without using third variable Code (Java Pattern Programs Free)
*/

 import java.util.Scanner;
 
 class SwapWithoutUsingThirdVariable
 {
   public static void main(String args[])
   {
       int a;
       int b;
 
       Scanner sc=new Scanner(System.in);
 
       System.out.print("Enter value for A : ");
       a = sc.nextInt();
       System.out.print("Enter value for B : ");
       b = sc.nextInt();
 
       System.out.print("\nvalue of A and B before swapping is 
                     A : "+a+" B : "+b);
       a = a + b;
       b = a - b;
       a = a - b;
       System.out.print("\nvalue of A and B after swapping is A 
                     : "+a+" B : "+b);
       
      }
}
