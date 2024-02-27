import java.util.*;
public class Inverted_Right_Half_Pyramid
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the no. of lines: ");
        int n=sc.nextInt();
        for( i=0;i<n;i++)
        {
            for(j=5;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();  
        }
    }
}