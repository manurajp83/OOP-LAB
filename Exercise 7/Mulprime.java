/*Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers. Implement using threads. (Thread class)
*/



import java.util.*;
class multiplication extends Thread
	{
	int n;
	multiplication(int n)
		{
		this.n=n;
		}
	public void run()
		{
		for(int i=1; i<=n;i++)
			{
			System.out.println(i+" x "+5+ " = "+(i*5));
			try	
				{
				Thread.sleep(400);
				}
			catch(Exception e)
				{
				}
			}
		}
	}


class prime extends Thread
	{
	int n,c;
	prime(int n)
		{
		this.n=n;
		}
	public void run()
		{
		try
			{
			int num=0;
			for(int i=2;num<n;i++)
				{
				c=1;
				for (int j=2;j<=i/2;j++)
					{		
					if(i%j==0)
						{
						c=0;
			
						}
					}
					if(c==1)
					{
					System.out.println("Prime Number : "+i);
					num++;
					Thread.sleep(400);
					
					}
				}
			}
		catch(InterruptedException e)
			{
			System.out.println("interrupted");
			}
		System.out.println("Exiting Thread");
		}
	}
		
	
public class Mulprime
	{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Multiplication limit:");
			int num=sc.nextInt();
			System.out.println("Number First N prime number:");
			int j=sc.nextInt();
			multiplication m=new multiplication(num);
			prime p=new prime(j);
			m.start();
			p.start();
			
			}
	}
	

/*OUTPUT
========
C:\Users\HP\Downloads>javac Mulprime.java

C:\Users\HP\Downloads>java Mulprime
Multiplication limit:
6
Number First N prime number:
7
Prime Number : 2
1 x 5 = 5
2 x 5 = 10
Prime Number : 3
3 x 5 = 15
Prime Number : 5
Prime Number : 7
4 x 5 = 20
Prime Number : 11
5 x 5 = 25
Prime Number : 13
6 x 5 = 30
Prime Number : 17
Exiting Thread

*/
