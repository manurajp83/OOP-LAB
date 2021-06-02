/*Read 2 matrices from the console and perform matrix addition.*/

import java.util.Scanner;
class Matrix{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr1[][]=new int[10][10];
		int arr2[][]=new int[10][10];
		int i,j,f=0;
		System.out.println("Enter the no. of rows and columns for the square matrix : ");
		int r=sc.nextInt();
     		System.out.println("Enter values for first matrix :");
		for(i=0;i<r;i++)
			for(j=0;j<r;j++)
				arr1[i][j]=sc.nextInt();
		for(i=0;i<r;i++)
			for(j=0;j<r;j++)
				arr2[i][j]=arr1[j][i];
		System.out.println("Matrix : ");
		for(i=0;i<r;i++){
			for(j=0;j<r;j++)
				System.out.print(arr1[i][j]+" ");						
			System.out.println();
		}
		System.out.println("Transpose of the matrix : ");
		for(i=0;i<r;i++){
			for(j=0;j<r;j++)
				System.out.print(arr2[i][j]+" ");						
			System.out.println();
		}
		for(i=0;i<r;i++)
			for(j=0;j<r;j++)
				if(arr1[i][j]!=arr2[i][j])
					f=1;
		if(f==0) System.out.println("The given matrix is symmetric");
		else System.out.println("The given matrix is not symmetric"); 
	}
}


/*
Output 1:
Enter the no. of rows and columns for the square matrix :
3
Enter values for first matrix :
1 2 3
4 5 6
7 8 9
Matrix :
1 2 3
4 5 6
7 8 9
Transpose of the matrix :
1 4 7
2 5 8
3 6 9
The given matrix is not symmetric

Output 2:

Enter the no. of rows and columns for the square matrix :
3
Enter values for first matrix :
2 5 4
5 3 2
4 2 1
Matrix :
2 5 4
5 3 2
4 2 1
Transpose of the matrix :
2 5 4
5 3 2
4 2 1
The given matrix is symmetric
*/