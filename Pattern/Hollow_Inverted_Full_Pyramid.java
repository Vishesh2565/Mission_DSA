import java.util.*;
public class Hollow_Inverted_Full_Pyramid {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,flag=0,k;
        System.out.println("Enter the no. of lines");
        n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            k=n-i-2;
            for(int j=0;j<n;j++)
            {
                if(i==0)
                {
                    if(j>=i)
                    System.out.print("* ");
                    else
                    System.out.print(" ");
                }
                else
                {
                    if(j==i||j==n)
                    {
                        if(flag>0 && flag<=k){
                            System.out.print("  ");
                            flag++;
                        }
                        else
                        System.out.print("* ");
                    }
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
            flag=0;
        }
    }
}
