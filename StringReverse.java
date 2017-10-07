import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] in=sc.nextLine().split(" ");
		String out="";
		for(int i=0;i<in.length;i++)
		{
			if(i%2==0)
				out+=in[i]+" ";
			else
				out+=String.valueOf(new StringBuffer(in[i]).reverse())+" ";
		}
		System.out.print(out.trim());
    }
}
