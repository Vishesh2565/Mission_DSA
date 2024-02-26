package Strings;
import java.util.*;

public class Remove_Occurence {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        char ch;
        int flag=0;
        System.out.println("Enter the string");
        s=sc.nextLine();
        System.out.println("Enter the character");
        ch=sc.next().charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(ch== s.charAt(i))
            {
                if(flag>0)
                System.out.print("");
                else
                {
                    System.out.print(ch);
                    flag++;
                }
            }
            else
            System.out.printVi(s.charAt(i));
        }
    }
}
