package Strings;
import java.util.*;
public class Remove_All_Spaces {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        System.out.println("Enter the String ");
        s=sc.nextLine();
        String[] a=s.split(" ");
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]);
    }
}