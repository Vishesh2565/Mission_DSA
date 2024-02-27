package Strings;
import java.util.*;
public class Equal_pair {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        int a=0;
        s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                a++;
            }
        }
        System.out.println(a);
    }
}
