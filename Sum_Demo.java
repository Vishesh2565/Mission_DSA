import java.util.Scanner;

public class Sum_Demo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
