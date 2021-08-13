/*Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic operations. Test the package by implementing all operations on two given numbers*/


import Operations.*;               //import package
import java.util.*;
class Amain       
{
  public static void main(String [] args)
  {
    int ch;
    Scanner sn=new Scanner(System.in);

    Addition a=new Addition();
    Subtraction s=new Subtraction();
    Multiplication m=new Multiplication();
    Division d=new Division();
    
    System.out.println("------CHOICES------");      
    System.out.println("1.ADDITION");
    System.out.println("2.SUBTRACTION");
    System.out.println("3.MULTIPLICATION");
    System.out.println("4.DIVISION");
    System.out.println("5.EXIT");
   
    lp:while(true)                                          
         {
           System.out.print("\nEnter your choice : ");
           ch=sn.nextInt();
           switch(ch)
           {

	      case 1:
		     System.out.print("Enter numbers for addition :");
		     a.input();
		     a.addition();						
		     break;
	     case 2:
		    System.out.print("Enter numbers for subtraction:");
		    s.input();
		    s.diff();						
		    break;
	     case 3:
		    System.out.print("Enter numbers for multiplication :");
		    m.input();
		    m.multiplication();						
		    break;
	     case 4:
		    System.out.print("Enter numbers for division :");
		    d.input();
		    d.div();						
		    break;
	     case 5:
		    break lp;                                             
	     default:
		     System.out.print("INVALID CHOICE!!");
           }
         }
  }
}

/*OUTPUT
---------
------CHOICES------
1.ADDITION
2.SUBTRACTION
3.MULTIPLICATION
4.DIVISION
5.EXIT

Enter your choice : 1
Enter numbers for addition :2
3
Addition:5

Enter your choice : 2
Enter numbers for subtraction:2
3
Subtraction:-1

Enter your choice : 3
Enter numbers to multiplication :2
3
Multilpication:6

Enter your choice : 4
Enter numbers to division :2
3
Division:0

Enter your choice : 5
*/
//Verified
