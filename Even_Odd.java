import java.util.Scanner;

public class Even_Odd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,ne=0,no=0;
        System.out.println("Enter the number of items");
        n=sc.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            ne++;
            else
            no++;
        }
        System.out.println("Number of even numbers : "+ne);
        System.out.println("Number of odd numbers : "+no);
    }
}
