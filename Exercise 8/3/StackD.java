//Program to remove an object from the Stack when the position is passed as parameter

import java.util.*;
class StackD
{
  public static void main(String args[])
  {
    //create a stack
    Stack<String> stack = new Stack<String>();
    //add elements
    stack.push("Apple");
    stack.push("Orange");
    stack.push("Anar");
    stack.push("Mango");
    stack.push("Grapes");

   System.out.println("Original Stack:");

   Iterator<String> itr=stack.iterator();
   while(itr.hasNext())
   {
       System.out.println(itr.next());
   }
    Scanner sn=new Scanner(System.in);
    System.out.print("Enter index position to be removed:");
    int st=sn.nextInt();

   stack.removeElementAt(st); 
   System.out.println("Final Stack: "+ stack);


  }
}

/*OUTPUT
--------
Original Stack:
Apple
Orange
Anar
Mango
Grapes
Enter index position to be removed:2
Final Stack: [Apple, Orange, Mango, Grapes]
*/