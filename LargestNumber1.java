import java.util.Arrays;
import java.util.Scanner;
public class LargestNumber1
        {
public static void main(String[] ar)
{
	Scanner scan=new Scanner(System.in);
	int i,j,k,position,coma=0;
	StringBuffer output=new StringBuffer();
	System.out.print("Enter numbers with space : ");
    String inp=scan.nextLine();
    String[] Stringarr=inp.split(" ");
    int[] Intarr=new int[Stringarr.length];
    try{
    for(i=0;i<Stringarr.length;i++)
    	Intarr[i]=Integer.parseInt(Stringarr[i]);
    Arrays.sort(Intarr);
    int len=String.valueOf(Intarr[Intarr.length-1]).length();
    for(i=0;i<Intarr.length-1;i++)
    {
    	for(j=i+1;j<Intarr.length;j++)
    	{
    		for(k=0;k<len;k++)
    		{
    			try{
    			int num1=Integer.parseInt(Stringarr[i].substring(0,k+1));
    			int num2=Integer.parseInt(Stringarr[j].substring(0,k+1));
    			if(num1<=num2)
    			{
    				String temp=Stringarr[j];
    				Stringarr[j]=Stringarr[i];
    				Stringarr[i]=temp;
    			}
    			}
    			catch(StringIndexOutOfBoundsException e){
    				break;
    			}
    		}
    	}
    	output.append(Stringarr[i]);
   }
    output.append(Stringarr[Stringarr.length-1]);
    position=output.length()%3;
    for(i=0;i<output.length();i++,coma++)
    {
    	System.out.print(output.charAt(i));
    	if(position!=0&&position-1==i){
    		System.out.print(",");
    		coma=-1;
    	}
    	if((coma+1)%3==0&&coma!=-1&&i!=output.length()-1){
    		System.out.print(",");
    	}
    }
    }
    catch(NumberFormatException w){
    	System.out.println("Enter valid number");
    }
}
}
