import java.util.*;

public class LongestPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next(),output="";
		for(int i=0;i<input.length();i++)
		{
			for(int j=i;j<=input.length();j++)
			{
				String check=input.substring(i,j);
				if(check.equalsIgnoreCase(String.valueOf(new StringBuffer(check).reverse())))
				{
				if(check.length()>output.length())
					output=check;
				}
			}
		}
		System.out.println(output);
	}
}
