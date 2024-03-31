import java.util.*;
public class Extractandsortnumbers {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        //System.out.println(s);
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch;
            ch=s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                c++;
            }
        }
        //System.out.println(c);
        int[] arr=new int[c];
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            char ch;
            ch=s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                arr[k]=ch;
                k++;
            }
        }
        for(int i=0;i<c;i++)
        {
            for(int j=i+1;j<c;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<c;i++)
        {
            System.out.print((char)arr[i]+" ");
        }
    }

}
    