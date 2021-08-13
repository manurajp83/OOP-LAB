// 2.Area of different shapes using overloaded functions


import java.lang.Math;
import java.util.Scanner;

class Areas{
 
    static double area(double side)                           //square area
     { 
       return side*side;
     }
     
    static double area(double length , double width)          //rectangle area
     {
       return length*width;
     }
       
    static double area(double half , double base , double height)         //triangle area
    { 
       return (half*base*height);
    }


    public static void main(String args[])
    {
       Scanner sn = new Scanner(System.in);
    
     System.out.print("Enter the side of Square  : ");
     double side = sn.nextDouble ();
     System.out.println("Area of Square      : "+area(side));
     
     System.out.print("Enter the length of Rectangle : ");
     double length = sn.nextDouble();
     System.out.print("Enter width of Rectangle  : ");
     double width = sn.nextDouble();
     System.out.println("Area of Rectangle       : "+area(length,width));

     System.out.print("Enter Base of Triangle    : ");
     double base = sn.nextDouble();
     System.out.print("Enter Height of Triangle  : ");
     double height = sn.nextDouble();
     System.out.println("Area of Triangle        : "+area(0.5,base,height));

    }
}


/*
----------output--------------

Enter the side of Square  : 6
Area of Square      : 36.0
Enter the length of Rectangle : 6
Enter width of Rectangle  : 7
Area of Rectangle       : 42.0
Enter Base of Triangle    : 4
Enter Height of Triangle  : 5
Area of Triangle        : 10.0

*/

//Verified
