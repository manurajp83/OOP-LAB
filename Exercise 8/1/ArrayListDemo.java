//Maintain a list of Strings using ArrayList from collection framework, perform built-in operations.

import java.util.*;
class ArrayListDemo
{
 public static void main(String args[])
 {
  //create an array list

   ArrayList<String> al=new ArrayList<String>();  
   System.out.println("Initial size of array list: " + al.size()); 

  // Add elements to the array list. 
  al.add("Red"); 
  al.add("Orange"); 
  al.add("Green"); 
  al.add("Pink"); 
  al.add(1, "White"); 
  System.out.println("Size of array list after additions: " + al.size());  
  System.out.println("Contents of array list after additions: " + al); 

   //accessing element using get()
 
   System.out.println("Returning element:" +al.get(2));

   //changing the element using set()
    System.out.println("Array list after adding Black:"); 
   al.set(2,"Black");

  for(String colors:al)  
  System.out.println(colors);

  //ensure that list can hold up to 100 elements using ensureCapacity()

    al.ensureCapacity(100);
    System.out.println("ArrayList can store upto 100 elements!!");

  // Remove elements from the array list. 
   al.remove(3); 
   System.out.println("Size of array list after deletions: " + al.size()); 
   System.out.println("Contents of array list after deletions: " + al); 
 } 
}

/*OUTPUT
---------
Initial size of array list: 0
Size of array list after additions: 5
Contents of array list after additions: [Red, White, Orange, Green, Pink]
Returning element:Orange
Array list after adding Black:
Red
White
Black
Green
Pink
ArrayList can store upto 100 elements!!
Size of array list after deletions: 4
Contents of array list after deletions: [Red, White, Black, Pink]
*/
Verified
