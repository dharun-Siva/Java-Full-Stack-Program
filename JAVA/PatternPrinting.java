import java.util.Scanner;   


public class PatternPrinting  {   
   public static void main(String args[])   
    {   

       Scanner s=new Scanner(System.in);
       int n=5;

     for(int i=0;i<n;i++)
     {
            if(i==0 || i==n-1)
           {
                for(int j=0;j<n;j++)
               {
                     System.out.print("* ");
               }
                     
           }
           else
           {
                System.out.print("  *     *"); 
           }
           System.out.println();

     }
   }   
}  