import java.util.*;
public class HourGlass_Pattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=0;
        for(int i=0;i<5;i++)
        {
            System.out.print(" ");
            for(int j=0;j<5;j++)
            {
                if(j>=i)
                System.out.print("* ");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<5;i++)
        {
            for(int j=0;j<=5+i;j++)

            {
                if((j>=5-i)&&(j<=5+i)&&k==0)
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
