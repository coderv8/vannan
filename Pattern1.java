import java.util.*;
public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		for(int i=1;i<=input;i++)
		{
			for(int j=0;j<=input;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
