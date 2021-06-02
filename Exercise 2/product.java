/*Define a class ‘product’ with data members pcode, pname and price. Create 3
objects of the class and find the product having the lowest price.*/


import java.util.Scanner;
class Product{
	int pcode;
	String pname;
	float price;
	Product(int p1,String p2,float p3){
		pcode=p1;
		pname=p2;
		price=p3;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int p1=1001;
		String p2="Pen";
		float p3=3;
		Product pd1=new Product(p1,p2,p3);
		System.out.println("Enter the product code:");
		p1=sc.nextInt();
		sc.nextLine();
                System.out.println("Enter the product name:");	
		p2=sc.nextLine();
		System.out.println("Enter the product price:");	
		p3=sc.nextFloat();
		Product pd2=new Product(p1,p2,p3);
		Product pd3=new Product(1003,"soap",30);
		System.out.println("First product : ");
		System.out.println("Code : "+pd1.pcode);
		System.out.println("Name : "+pd1.pname);
		System.out.println("Price: "+pd1.price);
		System.out.println("Second product : ");
		System.out.println("Code : "+pd2.pcode);
		System.out.println("Name : "+pd2.pname);
		System.out.println("Price: "+pd2.price);
		System.out.println("Third product : ");
		System.out.println("Code : "+pd3.pcode);
		System.out.println("Name : "+pd3.pname);
		System.out.println("Price: "+pd3.price); 
		float l=0;
		if(pd1.price<=pd2.price && pd1.price<=pd3.price)
			l=pd1.price;
		else if(pd2.price<=pd1.price && pd2.price<=pd3.price)
			l=pd2.price;
		else	l=pd3.price;
		System.out.print("Lowest price : ");
		if(l == pd1.price)
		   System.out.print( pd1.pname+" ");
		if(l == pd2.price)
		   System.out.print( pd2.pname+" ");
		if(l == pd3.price)
		   System.out.println( pd3.pname);
	
		        		
	}	
}
	
/*
Output 1:
Enter the product code:
1002
Enter the product name:
A4
Enter the product price:
1
First product :
Code : 1001
Name : Pen
Price: 3.0
Second product :
Code : 1002
Name : A4
Price: 1.0
Third product :
Code : 1003
Name : soap
Price: 30.0
Lowest price : A4

Output 2:

Enter the product code:
1004
Enter the product name:
book
Enter the product price:
40
First product :
Code : 1001
Name : Pen
Price: 3.0
Second product :
Code : 1004
Name : book
Price: 40.0
Third product :
Code : 1003
Name : soap
Price: 30.0
Lowest price : Pen
*/		