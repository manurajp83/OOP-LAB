/*1. Write a Java program to read a floating-point number and if the number is zero
it prints "zero", otherwise, print "positive" or "negative". Add "small" if the
absolute value of the number is less than 1, or "large" if it exceeds 1,00,000*/



     
import java .util.Scanner ;              // importing scanner class

class FloatNumber{

  public static void main(String[] args) {
  	 
  	 
     Scanner in = new Scanner(System.in); //creating scanner object
     
     Float number;                        //varible declared

     System.out.println("ENTER A NUMBER : ");
     number=in.nextFloat();

     if(number==0){
     	System.out.println("ZERO\n");
     }
     else if (number>0) {
     	if (number<1){
     		System.out.print("SMALL ");
     	}
     	else if(number>100000){
     		System.out.print("LARGE ");
     	}
    
     	System.out.println("POSITIVE\n");
     	
     }
     else if(number<0){
     	System.out.println("NEGATIVE\n");
     }
     	}


  }


/*
OUTPUT
------

C:\Users\ROG\Documents\java lab>javac FloatNumber.java

C:\Users\ROG\Documents\java lab>java FloatNumber
ENTER A NUMBER :
0.5
SMALL POSITIVE


C:\Users\ROG\Documents\java lab>java FloatNumber
ENTER A NUMBER :
5
POSITIVE


C:\Users\ROG\Documents\java lab>java FloatNumber
ENTER A NUMBER :
200000
LARGE POSITIVE



*/