import java.util.*;
import java.io.*;
class OddEven
{
	public static void main (String[] args)
	{
		int inp;
		Scanner s=new Scanner(System.in);
		inp=s.nextInt();
		if(inp%2==0)
		System.out.print("even");
		else
		System.out.print("odd");
	}
}
