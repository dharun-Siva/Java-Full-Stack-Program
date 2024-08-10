import java.util.Scanner;

public class PrimeNumberUptoN {
  public static void main (String args [])
  {
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter the number");
     int n=sc.nextInt();
     

     for(int i=2 ; i <=n;i++)
     {
            int count=1;
            for(int j=2; j <=i/2; j++)
           {
               if(i%j==0)
              {
                  count=0;
                  break;
              }
           }
             if(count==1)
             {
                  System.out.print(i+" ");
             }
      }

      
  }
}