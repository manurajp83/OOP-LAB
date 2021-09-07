//Program to demonstrate the creation of Set object using the LinkedHashset class

import java.util.*;
class LinkedHashSetD
{
  public static void main(String args[])
  {
   LinkedHashSet<String> set=new LinkedHashSet<String>();
   set.add("Java");
   set.add("Java");//no duplication
   set.add("Python");
   set.add("Adbms");

  Iterator<String> itr=set.iterator();
  System.out.println("LINKED HASHSET");
  System.out.println("--------------");

  while(itr.hasNext()){
  System.out.println(itr.next());
  }
 }
}

/*OUTPUT
--------
LINKED HASHSET
--------------
Java
Python
Adbms
*/
Verified
