import java.util.*;
public class Rhombus_Pattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of lines");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n+i;j++)
            {
                if(j>=i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
