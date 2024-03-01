import java.util.Scanner;

public class add {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        double sum=0.0;
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println(sum);
    }
}
