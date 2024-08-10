import java.util.Scanner;

public class LargerNumber {
   public static void main (String args[] ) {
      int A;
      int B;

         Scanner sc = new Scanner (System.in);

      System.out.println("Enter a number");
      A = sc.nextInt();
     System.out.println("Enter another number");
      B = sc.nextInt();

        if(A >  B)
       {
         System.out.println(A + " is Larger");
      }
     else
    { 
         System.out.println(B + " is Larger");
    }

   }
}