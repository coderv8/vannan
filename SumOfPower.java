import java.util.*;
public class SumOfPower
{
    public static void main(String ar[])
    {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter the value of n: ");
       String in=scan.nextLine()+"0";
       int len=in.length();
       double sum=0;
       for(int i=0;i<len-1;i++)
       {
    	   double pow=Math.pow(Integer.parseInt(in.charAt(i)+""),Integer.parseInt(in.charAt(i+1)+""));
    	   sum+=pow;
       }
       System.out.println("output="+sum);
    }
}
