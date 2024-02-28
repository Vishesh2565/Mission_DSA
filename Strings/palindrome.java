package Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="",rev=""; 
        System.out.println("Enter the string");
        s=sc.nextLine();
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        if(s.equals(rev))
        System.out.println(s+" :palindrome");
        else
        System.out.println(s+" :not a palindrome");
    }
}
