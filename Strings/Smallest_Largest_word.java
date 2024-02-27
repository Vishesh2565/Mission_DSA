package Strings;
import java.util.*;
public class Smallest_Largest_word {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        System.out.println("Enter the String");
        s=sc.nextLine();
        String[] a= s.split(" ");
        int min,max;
        min=max=a[0].length();
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i].length())
            max=a[i].length();
            if(min>a[i].length())
            min=a[i].length();
        }
        System.out.println("Maximum length word : ");
        for(int i=0;i<a.length;i++)
        {
            if(max==a[i].length())
            System.out.print(a[i]);
        }
        System.out.println("\nMinimum length word : ");
        for(int i=0;i<a.length;i++)
        {
            if(min==a[i].length())
            System.out.print(a[i]);
        }
    }
}
