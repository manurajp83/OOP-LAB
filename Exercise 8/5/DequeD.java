//Program to demonstrate the addition and deletion of elements in deque

import java.util.*;
class DequeD
{
 public static void main(String[] args) {

//Creating Deque and adding elements
 Deque<String> deque = new ArrayDeque<String>();
 deque.add("Gautam");
 deque.addFirst("Karan");
 deque.addLast("Ajay");

 Iterator<String> itr=deque.iterator();
 System.out.println("DEQUE ADDITION" );
 System.out.println("**************");
    while(itr.hasNext())
    {
      System.out.println(itr.next());
     }

  System.out.println("\nDEQUE DELETION");
  System.out.println("**************");
  System.out.println("Elements in deque:" +deque);
  System.out.print("Removing element at head:");
  deque.remove();
  System.out.println(deque); 
  System.out.print("Removing next element at head :");
  System.out.println(deque.poll());
  System.out.print("Removing last element :");
  System.out.println(deque.pollLast()); 
  System.out.println("Final deque:" +deque);
}
}

/*OUTPUT
--------
DEQUE ADDITION
**************
Karan
Gautam
Ajay

DEQUE DELETION
**************
Elements in deque:[Karan, Gautam, Ajay]
Removing element at head:[Gautam, Ajay]
Removing next element at head :Gautam
Removing last element :Ajay
Final deque:[]
*/
Verified
