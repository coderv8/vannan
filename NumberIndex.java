import java.util.Scanner;
import java.util.TreeSet;
public class NumberIndex
        {
public static void main(String[] ar)
{
	Scanner scan=new Scanner(System.in);
    TreeSet<Integer> input=new TreeSet<Integer>();
    int i;
    boolean flag=false;
    System.out.println("enter numbers with space:");
    String inp=scan.nextLine();
   String[] arr=inp.split(" ");
   try{
   for(i=0;i<arr.length;i++)
	   input.add(Integer.parseInt(arr[i]));
   i=0;
   for(int check:input){
	   if(check==i){
		   System.out.println("The number " +check+ " equals its index "+ i);
		   flag=true;
	   }
	   i++;
		   }
   if(flag==false)
	   System.out.println("None of the numbers match with its index");
   }
   catch(NumberFormatException e){
	   System.out.println("Enter numbers in correct format");
   }
}
}
