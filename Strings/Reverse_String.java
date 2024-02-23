package Strings;
import java.util.*;
public class Reverse_String {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s="";
        System.out.println("Enter the Sentence ");
        s=sc.nextLine();
        for(int i=s.length()-1;i>=0;i--)
        System.out.print(s.charAt(i));
    }
}
