import java.util.*;
public class Inverted_Full_Pyramid {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of lines");
        n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j>=i)
                System.out.print("* ");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
