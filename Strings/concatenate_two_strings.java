package Strings;

import java.util.Scanner;

public class concatenate_two_strings {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="",s1="";
        System.out.println("Enter two strings");
        s=sc.nextLine();
        s1=sc.nextLine();
        System.out.println(s+s1);
    }
}
