/*2. Program to create a class for Employee having attributes eNo, eName eSalary. Read n
employ information and Search for an employee given eNo, using the concept of Array of
Objects.*/

import java.util.Scanner;
class Employee{
	int eNo;
	String eName;
	double eSalary;
	Employee(int eNo,String eName,double eSalary)	//constructor
	{
	  this.eNo=eNo;
	  this.eName=eName;
	  this.eSalary=eSalary;
	}
}
class EmployeDetails
{
 public static void main(String args[])
	{ 
	Scanner in=new Scanner(System.in);
	int i,c=0,n,e_no;
	int e_sal;
	String e_name;
	System.out.println("Enter the number of employees:");
  	n=in.nextInt();
 	Employee[] obj=new Employee[n];		
	for(i=0;i<n;i++)
		{
	 	System.out.print("eNo            :");
	 	e_no=in.nextInt();
	 	System.out.print("Employee name  :");
	 	e_name=in.next();
	 	System.out.print("Employee Salary:");
	 	e_sal=in.nextInt();
 	 	obj[i]=new Employee(e_no,e_name,e_sal);	//giving values
		}
	System.out.println("Enter eNo to be searched ");
	int k=in.nextInt();
	for(i=0;i<n;i++)
	 if(obj[i].eNo==k)			//checking eNo
	 	{
	 	c=1; 				//found value
	   	break;				
	 	}
	if(c==1)
	 System.out.println("employee with Employee_number: "+k+" found");
	else
	 System.out.println("employee with Employee_number: "+k+" not found");
	}
}
/*OUTPUT
--------

Enter the number of employees:
3
eNo            :0001
Employee name  :jilson
Employee Salary:12500
eNo            :0002
Employee name  :manu
Employee Salary:12000
eNo            :0003
Employee name  :jobin
Employee Salary:25000
Enter eNo to be searched
0003
employee with Employee_number: 3 found

--------------------------------------
Enter the number of employees:
3
eNo            :0001
Employee name  :jilson
Employee Salary:12500
eNo            :0002
Employee name  :manu
Employee Salary:12000
eNo            :0003
Employee name  :jobin
Employee Salary:25000

Enter eNo to be searched
0005
employee with Employee_number: 5 not found
*/

