import java.util.*;
public class Full_Pyramid {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k=0;
        System.out.println("Enter the no. of lines");
        n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n+i;j++)
            {
                if((j>=n-i)&&(j<=n+i)&&k==0)
                {
                System.out.print("*");
                k=1;
                }
                else{
                System.out.print(" ");
                k=0;
                }
            }
            System.out.println();
        }

    }
}
