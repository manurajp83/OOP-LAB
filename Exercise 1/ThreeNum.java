/*Write a program that accepts three numbers from the user and prints
"increasing" if the numbers are in increasing order, "decreasing" if the
numbers are in decreasing order, and "Neither increasing or decreasing order"
otherwise.*/


import java.util.Scanner;            //importing scanner class
class ThreeNum{
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter first number:");
	int a=in.nextInt();
	System.out.println("Enter Second number:");
	int b=in.nextInt();
	System.out.println("Enter Third number:");
	int c=in.nextInt();
	if(a>b&b>c)
	 System.out.println("Decreasing ");
	else if(a<b&b<c)
	 System.out.println("Increasing");
	else
	 System.out.println("Neither Increasing or Decreasing order");
}
}
/*
Output
-------
C:\Users\ROG\Documents\java lab>java ThreeNum
Enter first number:
1
Enter Second number:
2
Enter Third number:
3
Increasing

C:\Users\ROG\Documents\java lab>java ThreeNum
Enter first number:
3
Enter Second number:
2
Enter Third number:
1
Decreasing

C:\Users\ROG\Documents\java lab>


C:\Users\ROG\Documents\java lab>java ThreeNum
Enter first number:
6
Enter Second number:
7
Enter Third number:
4
Neither Increasing or Decreasing 
*/