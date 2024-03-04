import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Display ob=new Display();
        System.out.println("Enter four numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        ob.multiply(a,b);
        ob.multiply(c,d);
    }
}