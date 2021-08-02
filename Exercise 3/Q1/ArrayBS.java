/* Binary Search using Arrays.binarySearch() */


import java.util.*;
class ArrayBS
	{
 		public static void main(String args[])
		{
		int i,n,se;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		n=in.nextInt();
		int a[]=new int[n];				//creating array
		System.out.println("Enter the Elements:");
		for(i=0;i<n;i++)
	 	a[i]=in.nextInt();
		Arrays.sort(a);                                //sort array
		System.out.println("\nAFTER SORTING");
		for(i=0;i<n;i++)
		System.out.println(a[i]);
		System.out.println("Enter value to be searched:");
		se=in.nextInt();
		int pos=Arrays.binarySearch(a,se);		//binarySearch() 
		if(pos>=0)				
	 	System.out.println(" found at index "+(pos));
		else
	 	System.out.println(" not found");
	}
}

/*ouput
-------------------------
Enter the number of elements
4
Enter the elements:
3
4
2
5

 ARRAY AFTER SORTING
2
3
4
5
Enter the element to be searched:
4
FOUND AT 2 POSITION


Enter the number of elements
3
Enter the elements:
2
3
1

 ARRAY AFTER SORTING
1
2
3
Enter the element to be searched:
8
NOT FOUND

*/
