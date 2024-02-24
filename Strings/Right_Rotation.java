package Strings;
import java.util.*;
public class Right_Rotation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        System.out.println("Enter the String");
        s=sc.nextLine();
        System.out.println("Enter the number to rotate");
        int d=sc.nextInt();
        System.out.println(s.substring(s.length()-d,s.length())+s.substring(0,s.length()-3));
    }
}
