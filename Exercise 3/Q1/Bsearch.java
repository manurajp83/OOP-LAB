// Binary search


import java.util.*;
class Bsearch
	{
	public static void main(String args[])
	{
	int i,n,s,first,last,mid;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	n=in.nextInt();
	int a[]=new int[n];                                               //array creation
	System.out.println("Enter the elements:");
	for(i=0;i<n;i++)
	a[i]=in.nextInt();                                                //store elements
	Arrays.sort(a);                                                   //sort array using sort()
	System.out.println("\n ARRAY AFTER SORTING");
	for(i=0;i<n;i++)
	System.out.println(a[i]+" ");
	System.out.println("Enter the element to be searched:");
	s=in.nextInt();                                                   //getting value to be searched
	first=0;
	mid=0;
	last=n-1;
	while(first<=last)
		{
		mid=(first+last)/2;
		if(a[mid]==s)                                               //check middle
			{
			System.out.println("FOUND AT " +mid+ " POSITION");
			break;
			}
			else if(a[mid]>s)                                   //checks if greater than middle
			{
			last=mid-1;
			}
			else
			{
			first=mid+1;
			}
		}	
	if(first>last)
	System.out.println("NOT FOUND");
	}
}

/* OUTPUT
Enter the number of elements
4
Enter the elements:
1
3
2
4

 ARRAY AFTER SORTING
1
2
3
4
Enter the element to be searched:
4
FOUND AT 3 POSITION


Enter the number of elements
3
Enter the elements:
4
3
6

 ARRAY AFTER SORTING
3
4
6
Enter the element to be searched:
7
NOT FOUND
 
*/