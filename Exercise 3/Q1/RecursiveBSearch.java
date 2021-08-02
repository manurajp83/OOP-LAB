/*Recursive binary Search*/


import java.util.*;
class Rebsearch
	{
	int rsearch(int a[],int first,int last,int c)        //method
		{
		if (first<=last)
			{
			int mid=(first+last)/2;
			if(a[mid]==c)
			return mid;
			else if(a[mid]>c)
			return rsearch(a,first,mid-1,c);   //recursion
			else
			return rsearch(a,mid+1,last,c);
			}
		return -1;
		}	
	}
class RecursiveBSearch
{
	public static void main(String [] args)
	{
	int i,n,s,a,b;
	Rebsearch obj=new Rebsearch();                //object creation
	Scanner in=new Scanner(System.in);
	System.out.println("\nEnter the size: ");
	n=in.nextInt();
	int arr[]=new int[n];                        //create array
	System.out.println("Enter the elements:");
	for(i=0;i<n;i++)
	arr[i]=in.nextInt();
	Arrays.sort(arr);                            //sort array
	System.out.println("\nAFTER SORTING");
	for(i=0;i<n;i++)
	System.out.print(arr[i]+" ");
	System.out.println("\nEnter the value to be searched: ");
	s=in.nextInt();
	a=0;
	b=n-1;
	int pos=obj.rsearch(arr,a,b,s);
	if(pos==-1)
	System.out.println("not found");
	else
	System.out.println("\nfound at "+pos+" position");
 	}
}
	
/*
OUTPUT
-------
Enter the size:
6
Enter the elements:
4
8
6
10
5
1

AFTER SORTING
1 4 5 6 8 10
Enter the value to be searched:
8

found at 4 position


Enter the value to be searched:
7
not found

*/	