import java.util.*;
 class FrequentNumber
 {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int count=0;
        System.out.println("Enter the Array size :");
      int n=sc.nextInt();   
        int ar[]=new int[n];
     
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Frequency of a number :");
        for(int i=0;i<n;i++)
        {
          if(ar[i]==n)
          {
             count= count++;
          }
        }
         if(count==0)
         {
             System.out.println(count+" found ");
         }
         else
         {
             System.out.println(count+"not found");
         }
    }
}
