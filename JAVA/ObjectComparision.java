import java.util.Scanner;

public class ObjectComparision  
{  
public static void main(String[] args)   
{  
       Scanner s=new Scanner(System.in);

       String str1=s.next();
       String str2=s.next();

      if(str1.equals(str2))
             System.out.println("Same Strings");  

     else
             System.out.println("Different Strings");  
}  
}  