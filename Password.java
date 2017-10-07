import java.util.*;
public class Password {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.next();
		int total=0;
		byte[] arr=in.getBytes();
		for(int i=0;i<arr.length;i++)
			total+=arr[i];
		System.out.print((char)(total/arr.length));

	}

}
