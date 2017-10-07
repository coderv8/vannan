import java.util.*;
import java.util.stream.IntStream;

public class Encode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] input=sc.next().replaceAll("\\D","").split("");
		int[] num=Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(num);
		int max=num[num.length-1],min=num[0];
		int total=Arrays.stream(num).sum(),sum1=(total*max)%9;
		if(sum1==0)
			sum1=9;
		num=Arrays.stream(num).map(i -> i+min).toArray();
		int sum2=IntStream.of(num).reduce(1, (a, b) -> a * b)%9;
		if(sum2==0)
			sum2=9;
		int output=sum1<sum2?sum1:sum2;
		System.out.println(output*output);
	}
}
