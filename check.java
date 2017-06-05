import java.util.*;
import java.io.*;
class check
{
	public static void main (String[] args)
	{
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if(a==0)
		System.out.print("zero");
		else if(a<0)
		System.out.print("negative");
		else
		System.out.print("positve");
	}
}
