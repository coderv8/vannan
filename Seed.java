import java.util.*;
public class Seed
{
    public static void main(String[] ar)
    {
        Scanner s=new Scanner(System.in);
                int a=s.nextInt();
                        int i,p=a,k=a;
                while(a>0)
                {
                  i=a%10;
                  a=a/10;
                  p=p*i;
                }
                System.out.print("seed of "+k+" is "+p);
    }
}
