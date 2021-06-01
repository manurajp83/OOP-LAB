/*3.Write a Java program to find the number of days in a month for a given year.Check Leap year also.*/




import java.util.Scanner;
class LeapYear{
public static void main(String args[]){                         //importing scanner class
	Scanner in=new Scanner(System.in);			//creating scanner object
	System.out.println("Enter month in lower case:");
	String month=in.nextLine();				//getting input from user
	System.out.println("Enter year:");
	int year=in.nextInt();					//getting input from user
	
	int l=0;
	if(year%4==0)						//checking leap year
	 l=1;
	switch(month)
	{
	 case "january" :
	 case "march"   :
	 case "may"     :
	 case "july"    :
	 case "august"  :
	 case "october" :
	 case "december": if(l==1)
			   System.out.println(year+" is  leap year & "+month+" has 31 days");
			  else
			   System.out.println(year+" is not a leap year & "+month+" has 31 days");
			  break;
	 case "february": if(l==1)
			   System.out.println(year+" is leap year & "+month+" has 29 days");
			  else
			   System.out.println(year+"is  not leap year & "+month+" has 28 days");
			  break;
	 case "april"    :
	 case "june"     :
	 case "september":
	 case "november" :if(l==1)
			   System.out.println(year+"is leap year & "+month+" has 30 days");
			  else
			   System.out.println(year+"is not leap year & "+month+" has 30 days");
			  break;
	default:System.out.println("Invalid");
        }
}}
/*
Output
C:\Users\ROG\Documents\java lab>java LeapYear
Enter month in lower case:
january
Enter year:
2020
2020 is  leap year & january has 31 days

C:\Users\ROG\Documents\java lab>java LeapYear
Enter month in lower case:
february
Enter year:
1999
1999is  not leap year & february has 28 days

C:\Users\ROG\Documents\java lab>java LeapYear
Enter month in lower case:
june
Enter year:
2020
2020is leap year & june has 30 days

C:\Users\ROG\Documents\java lab>
*/