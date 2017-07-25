import java.util.*;
public class Pattern
{
    public static void main(String arg[])
    {
        int i,j,k=0;
        Scanner scan=new Scanner(System.in);
        int inp=scan.nextInt();
        for(i=0;i<inp;i++,k++)
        {
            for(j=i;j<inp*2-k;j++)
            {
                if(j==inp)
                System.out.print(" ");
                System.out.print("*");
            }
           System.out.println();
        }
    }
