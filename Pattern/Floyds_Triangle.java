import java.util.*;
public class Floyds_Triangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=1,n;
        System.out.println("Enter the no. of lines");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(k+ " ");
                k++;
            }
            System.out.println();
        }
    }
}
