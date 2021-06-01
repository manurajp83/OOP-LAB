/*2. Write a program in Java to display the cube of the number upto given an
integer*/

// importing scanner class
import java.util.Scanner;

class CubeNumber{

	public static void main(String[] args) {
		
	
  	 //creating scanner object
     Scanner in = new Scanner (System.in);

     int i,number;
     
     System.out.print("ENTER LIMIT : ");
     number=in.nextInt();
     
     for(i=1;i<=number;i++)
     {
     	System.out.println(i*i*i);
     }
     
}
}



/*
OUTPUT
------
C:\Users\ROG\Documents\java lab>javac CubeNumber.java

C:\Users\ROG\Documents\java lab>java CubeNumber
ENTER LIMIT : 3
1
8
27

*/
