import java.util.*;
import java.util.Arrays;
public class Digit
        {
public static void main(String[] ar)
{
    int i,k,j,l=0,b,t,p,d;
    Scanner s=new Scanner(System.in);
    System.out.print("enter the number   ");
    b=s.nextInt();
        System.out.print("enter the nof digits for deletion    ");
    d=s.nextInt();
    p=b;
    while(b>0)
    {
        b=b/10;
        l++;
    }
    if(l>d)
    {
      int[] a=new int[l];
      for(i=0;i<l;i++)
      {
          a[i]=p%10;
          p=p/10;
      }
      Arrays.sort(a);
      System.out.print("Your number is    ");
      for(i=0;i<l-d;i++)
      System.out.print(a[i]);
    }
    else
        System.out.print("inputs dosent match");
}
}
