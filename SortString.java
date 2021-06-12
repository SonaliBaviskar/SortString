import java.util.*;
class SortString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int X = sc.nextInt();
        sc.nextLine();
        String a[]= new String[X];
        String temp;
        System.out.println(" ");
        System.out.println("Enter the element: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextLine();
        }
        for(int i=0;i<a.length;i++)
        {
          for(int j=i+1;j<a.length;j++)
          {
              if(a[i].compareTo(a[j])>0)
              {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
                  
              }
          }
        }
        System.out.println(" ");
        System.out.println("order is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+ " ");
        }
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i].compareTo(a[j])<0)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(" ");
        System.out.println("descending order:");
         for(int i=0;i<a.length;i++)
         {
             System.out.println(a[i]+ " ");
         }
    }
}