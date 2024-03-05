import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        A ob=new A();
        B ob1=new B();
        System.out.println("Enter the subject marks");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        double f=sc.nextDouble();
        double g=sc.nextDouble();
        ob.getPercentage(a,b,c);
        ob1.getPercentage(d,e,f,g);
    }
}