import java.util.Scanner;

public class emi {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,r;
        int n;
        System.out.println("Enter the Principal, Rate, and Tenure");
        p=sc.nextDouble();
        r=sc.nextDouble();
        double s=(r/12)/100;
        n=sc.nextInt()*12;
        double emi=0.0;
        emi=(p*s*Math.pow((1+s),n))/(Math.pow((1+s),n)-1);
        System.out.println("EMI: "+emi);
    }
}
