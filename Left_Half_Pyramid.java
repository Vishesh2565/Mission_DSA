import java.util.*;
public class Left_Half_Pyramid {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of lines");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((n-i)>j)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
