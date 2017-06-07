import java.util.*;
public class IsChar
{
    public static void main(String[] ar)
    {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
       if(Character.isLetter(c))
          System.out.println("entered character is an alphabet");
       else
               System.out.println("entered character is not an alphabet");     
    }
}
