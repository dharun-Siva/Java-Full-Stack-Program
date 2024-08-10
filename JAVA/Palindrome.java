import java.util.Scanner;

public class Palindrome {
  public static void main (String args [])
  {
     Scanner s=new Scanner(System.in);

     System.out.println("Enter the String");

     String str=s.next();

     StringBuffer sb= new StringBuffer(str);
     String newStr=(sb.reverse()).toString();
     System.out.println(newStr);

     if(newStr.equals(str))
        { 
            System.out.print("Palindrome");
         }

     else
     {
         System.out.println("Not Palindrome");
    }
     
  }
}