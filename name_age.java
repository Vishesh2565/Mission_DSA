import java.util.Scanner;

public class name_age {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        int age;
        System.out.println("Enter the name and age");
        s=sc.nextLine();
        age=sc.nextInt();
        System.out.println(s+" age is "+age);
    }
}
