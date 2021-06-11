
import java.util.*;
class SortArray{
 public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	int n,i,ch;
	System.out.println("\nENTER THE SIZE :");
	n=in.nextInt();
	String a[]=new String[n];                              //creating array of size n
	System.out.println("\nENTER THE STRINGS");
	for(i=0;i<n;i++)
	 a[i]=in.next();
	System.out.println("\nELEMENTS ARE");
	for(i=0;i<n;i++)
	 System.out.println(a[i]+"  ");
	do{
	 System.out.println("\n1.BUILTIN METHOD");
	 System.out.println("2.USER DEFINED METHOD");
	 System.out.println("3.EXIT");
	 System.out.println("CHOICE:");
	 ch=in.nextInt();
	 switch(ch)
	 {
		 case 1:
		       	 Arrays.sort(a);			//sorting using buildin array function
			 System.out.println("\nAFTER SORTING");  
			 System.out.println("--------------");
			 for(i=0;i<n;i++)
			  System.out.print(a[i]+" ");
			 break;
		 case 2:
			 for (i=0;i<n;i++){
			  for(int j=i+1;j<n;j++){
			   if(a[j].compareTo(a[i])<0){
			    String t=a[i];
			    a[i]=a[j];
			    a[j]=t;
			   }
			  }
			  System.out.print(a[i]+" ");
			 }
			 break;
		 case 3:
			break;
		 default:
			 System.out.println("CHOOSE VALID OPTION");
	 }
	}while(ch != 3);
}
}

/*----------------------------------------------------OUTPUT

C:\Users\ROG\Desktop\java\Exercise 3>javac SortArray.java

C:\Users\ROG\Desktop\java\Exercise 3>java SortArray

ENTER THE SIZE :
4

ENTER THE STRINGS
CAT
DOG
ELEPHANT
RABBIT

ELEMENTS ARE
CAT
DOG
ELEPHANT
RABBIT

1.BUILTIN METHOD
2.USER DEFINED METHOD
3.EXIT
CHOICE:
1

AFTER SORTING
--------------
CAT DOG ELEPHANT RABBIT
1.BUILTIN METHOD
2.USER DEFINED METHOD
3.EXIT
CHOICE:
2
CAT DOG ELEPHANT RABBIT
1.BUILTIN METHOD
2.USER DEFINED METHOD
3.EXIT
CHOICE:
3

C:\Users\ROG\Desktop\java\Exercise 3>

*/