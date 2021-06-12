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
/*>>>>>>>>>>>>>>>>>>>>>>>>>OUTPUT<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

Enter the number of employees:
4
eNo            :1114
Employee name  :Abhijith
Employee Salary:15000
eNo            :1113
Employee name  :Amal
Employee Salary:20000
eNo            :1115
Employee name  :Manuraj
Employee Salary:50000
eNo            :1116
Employee name  :Aswin
Employee Salary:45000
Enter eNo to be searched
1115
employee with Employee_number: 1115 found

*/

