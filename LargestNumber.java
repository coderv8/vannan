import java.util.*;
public class Char
{
    public static void main(String[] ar)
    {
         int i;
        System.out.println("Enter three numbers : ");
        Scanner s=new Scanner(System.in);
        int[] a=new int[3];
        for(i=0;i<3;i++)
            a[i]=s.nextInt();
        Arrays.sort(a);
        System.out.print(a[2]);
    }
}
