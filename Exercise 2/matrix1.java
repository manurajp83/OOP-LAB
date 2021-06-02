/*Read 2 matrices from the console and perform matrix addition.*/

import java.util.Scanner;
class Matrix{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr1[][]=new int[10][10];
		int arr2[][]=new int[10][10];
		int arr3[][]=new int[10][10];
		int i,j;
		System.out.println("Enter the no. of rows and columns of matrix : ");
		int r=sc.nextInt();
		int c=sc.nextInt();
     		System.out.println("Enter values for first matrix :");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				arr1[i][j]=sc.nextInt();
     		System.out.println("Enter values for second matrix :");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				arr2[i][j]=sc.nextInt();
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				arr3[i][j]=arr1[i][j]+arr2[i][j];
		System.out.println("Matrix 1 : ");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++)
				System.out.print(arr1[i][j]+" ");						
			System.out.println();
		}
		System.out.println("Matrix 2 : ");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++)
				System.out.print(arr2[i][j]+" ");						
			System.out.println();
		}
		System.out.println("Sum of two  matrix is : ");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++)
				System.out.print(arr3[i][j]+" ");						
			System.out.println();
		}
	}
}


/*
Output:
Enter the no. of rows and columns of matrix :
3 2
Enter values for first matrix :
4 2
3 3
1 2
Enter values for second matrix :
1 2
2 1
1 1
Matrix 1 :
4 2
3 3
1 2
Matrix 2 :
1 2
2 1
1 1
Sum of two  matrix is :
5 4
5 4
2 3
*/