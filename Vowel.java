import java.io.*;
import java.util.*;
public class Vowel {
    public static void main(String[] args) 
    {
	    System.out.println("Enter the character : ");
        Scanner s=new Scanner(System.in);
		char char1=s.next().charAt(0);
                if((char1=='a') || (char1=='e') ||(char1=='i') || (char1=='o') || (char1=='u'))
                    System.out.println("Entered character is an vowel");
                else
                    System.out.println("Entered character is an consonant");
    }
}
