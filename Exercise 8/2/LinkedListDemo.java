//Program to remove all the elements from a linked list

import java.util.*;
class LinkedListDemo
{
  public static void main(String[] args) 
  {
    //create a linked list
     LinkedList<String> list = new LinkedList<String>();

     //add elements in the linked list
          list.add("L");
          list.add("A");
          list.add("S");
           list.addLast("S");
          list.addFirst("C");
      
   System.out.println("Original contents in linked list: " +list);

  //remove all elements from the linked list using clear()

     list.clear();
 
    System.out.println("Final contents in linked list: " +list);
  }
}

/*OUTPUT
---------
Original contents in linked list: [C, L, A, S, S]
Final contents in linked list: []

*/
Verified
