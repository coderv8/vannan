import java.util.*;
import java.io.*;
class OddEven
{
	public static void main (String[] args)
	{
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if(a%2==0)
		System.out.print("even");
		else
		System.out.print("odd");
	}
}
