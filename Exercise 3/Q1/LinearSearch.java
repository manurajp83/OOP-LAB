/*LINEAR SEARCH USING ARRAY*/

import java.util.Scanner;
class LinearSearch                                                   //class 
     {
      public static void main(String args[])
            {
              int n,i,e;
              Scanner s=new Scanner(System.in);
              
              System.out.println("Enter number of elements:");
              n=s.nextInt();
              int a[]=new int[n];                                   //array declaration
              System.out.println("Enter "+n+" number of elements:");
              for(i=0;i<n;i++)
               {
                a[i]=s.nextInt();
               }
              System.out.println("Enter element to be searched:");
              e=s.nextInt();
              for(i=0;i<n;i++)
              {
               if(a[i]==e)                                          //linear search
                  {
                   System.out.println("Element found at "+i+" position"); 
                   break;
                  }
              
              }
               if (i==n)
                  {System.out.println("Element not found ");}
            }
     }
/*
-----output------

Enter number of elements:
1
Enter 1 number of elements:
4
Enter element to be searched:
3
Element not found


Enter number of elements:
4
Enter 4 number of elements:
3
2
4
1
Enter element to be searched:
3
Element found at 0 position

*/