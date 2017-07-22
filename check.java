import java.util.*;
import java.io.*;
class check
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		int inp=s.nextInt();
		if(inp==0)
		System.out.print("zero");
		else if(inp<0)
		System.out.print("negative");
		else
		System.out.print("positve");
	}
}
