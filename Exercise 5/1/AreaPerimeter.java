/*1.Create an interface having prototypes of functions area() and
perimeter(). Create two classes Circle and Rectangle which implements
the above interface. Create a menu driven program to find area and
perimeter of objects*/

import java.util.Scanner;

interface CR //interface created
{
  void input();
  void area();
  void perimeter();
}

//class circle
class Circle implements CR
{
  int r=0;
  double pi = 3.14 ,area=0,perimeter=0;

  public void input()
  {
    Scanner c = new Scanner(System.in);
    r = c.nextInt();
  }
  
  public void area()
  {
   area=pi * r * r;
   System.out.print("\nAREA OF THE CIRCLE IS : " +area);
  }
  public void perimeter()
  {
   perimeter= 2 * pi * r;
   System.out.print("\nPERIMETER OF THE CIRCLE IS :" +perimeter);
  }
}
//class Rectangle
class Rectangle implements CR
{
  int length=0,breadth=0;
  double area,perimeter;
 
  public void input()
  {
    Scanner r = new Scanner(System.in);
    length = r.nextInt();
    breadth = r.nextInt();
  }
  public void area()
  {
    area = length * breadth;
    System.out.print("\nAREA OF THE RECTANGLE IS :" +area);
  }
  public void perimeter()
  {
    perimeter = 2 * (length+breadth);
    System.out.print("\nPERIMETER OF THE RECTANGLE IS :" +perimeter);
  }
}

//main class
public class AreaPerimeter
{
  public static void main(String args[])
  {
    int ch;
    Circle c = new Circle();
    Rectangle r = new Rectangle();
    Scanner sn = new Scanner(System.in);
  
  System.out.println("***CHOICES***");
  System.out.println("1.AREA OF CIRCLE");
  System.out.println("2.AREA OF RECTANGLE");
  System.out.println("3.PERIMETER OF CIRCLE");
  System.out.println("4.PERIMETER OF RECTANGLE");
  System.out.println("5.EXIT");

  lp : while(true)
  {
  System.out.print("\nSelect your choice: ");
  ch = sn.nextInt();

  switch(ch)
  {
     case 1:
            System.out.print("\nEnter radius of the circle:");
            c.input();
            c.area();
            break;
     case 2:
            System.out.print("\nEnter length and breadth of rectangle:");
            r.input();
            r.area();
            break;
     case 3:
            System.out.print("\nEnter radius of the circle :");
            c.input();
            c.perimeter();
            break;
     case 4:
            System.out.print("\nEnter length and breadth of rectangle:");
            r.input();
            r.perimeter();
            break;
     case 5:
            break lp;
     default:
           System.out.print("INVALID CHOICE!");
   }
  }
}
}

/*OUTPUT
***CHOICES***
1.AREA OF CIRCLE
2.AREA OF RECTANGLE
3.PERIMETER OF CIRCLE
4.PERIMETER OF RECTANGLE
5.EXIT

Select your choice: 1

Enter radius of the circle:2

AREA OF THE CIRCLE IS : 12.56
Select your choice: 2

Enter length and breadth of rectangle:3 5

AREA OF THE RECTANGLE IS :15.0
Select your choice: 3

Enter radius of the circle :2

PERIMETER OF THE CIRCLE IS :12.56
Select your choice: 4

Enter length and breadth of rectangle:6 9

PERIMETER OF THE RECTANGLE IS :30.0
Select your choice: 7
INVALID CHOICE!
Select your choice: 5
*/