package Strings;
import java.util.*;
public class Sort_String {
    static void sortString(String str) { 
        char []arr = str.toCharArray(); 
        Arrays.sort(arr); 
        System.out.print(String.valueOf(arr)); 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s="";
        System.out.println("Enter the string");
        s=sc.nextLine();
        sortString(s);

    }
}
