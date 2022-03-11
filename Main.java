import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        int a[]=new int[100];
        Scanner sc=new Scanner (System.in);
        //read the element from user to arrya
        System.out.println("Enter the Array Element");
        for(int i=0;i<5;i++)//i<5
        {
            a[i]=sc.nextInt();
        }
        //print arrya element
        
        System.out.println("Array Element are");
        for(int i=0;i<5;i++)//i=5
        {
            System.out.println(a[i]);
        }
    }
}
