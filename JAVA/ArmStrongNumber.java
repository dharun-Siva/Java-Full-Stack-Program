import java.util.Scanner;

public class ArmStrongNumber {
  public static void main (String args [])
  {
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter the number");
     int n=sc.nextInt();
    String str=String.valueOf(n);
    char ch[]=str.toCharArray();
    int len=(String.valueOf(n)).length();

int t=n;
int sum=0;
int temp=0;

for(int i=0;i<ch.length;i++)
{
int rem=n%10;
 temp=(int)Math.pow(rem,len);
sum+=temp;
n=n/10;
}
System.out.println(sum);
if(sum==t)
{
System.out.println("Arm");
}
else
{
System.out.println("Not Arm");
}

     }
}