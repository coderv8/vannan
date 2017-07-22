import java.util.*;
public class Digit
        {
public static void main(String[] ar)
{
    int i,l=0,num,d;
    Scanner s=new Scanner(System.in);
    System.out.print("enter the number : ");
    String inp=s.nextLine();
    num=Integer.parseInt(inp);
        System.out.print("enter the no of digits for deletion k : ");
    d=s.nextInt();
    if(inp.length()>d)
    {
      int[] a=new int[inp.length()];
      for(i=0;i<inp.length();i++)
      {
          a[i]=num%10;
          num=num/10;
      }
      Arrays.sort(a);
      System.out.print("Your number is ");
      for(i=0;i<inp.length()-d;i++)
      System.out.print(a[i]);
    }
    else
        System.out.print("inputs dosen't match");
}
}
