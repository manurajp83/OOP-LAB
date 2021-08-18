/*Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a given range. Implement using threads. (Runnable Interface)
*/


import java.util.*;
class FThread implements Runnable
	{
	int n;
	Thread t;                                                        //creating thread
	FThread(int n)
		{
		t=new Thread(this);
		this.n=n;
		}
	public void run()
		{
		int a=0,b=1,c=0;
		System.out.println("fibonacci: "+a+"\n fibonacci: "+b);
		try
			{
			for(int i=0;b<=n;i++)
				{
				c=a+b;
				System.out.println("fibonacci: "+c);
				a=b;
				b=c;
				Thread.sleep(400);
				}
			}
		
		catch (InterruptedException e)
			{
			System.out.println("FibThread interrupted.");
			}

		System.out.println("Exiting  FibThread.");
	
		}
	}
class EvenThread implements Runnable
	{
	int n;
	Thread t;
	EvenThread(int n)
		{
		t=new Thread(this);
		this.n=n;
		}
	public void run()
		{
		int a;
		try
			{
			for(int i=0;i<=n;i++)
				{
				if(i%2==0)
					{
					System.out.println("Even Number: "+i);
					Thread.sleep(400);
					}
				}
			}
		catch (InterruptedException e)
			{
			System.out.println("EvenThread interrupted.");
			}

		System.out.println("Exiting  EvenThread.");
	
		}
	}
class FibEven
	{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Fibonacci Limit :");
			int fib=sc.nextInt();
			System.out.println("Check_Even upto :");
			int even=sc.nextInt();
			FThread f=new FThread(fib);
			EvenThread ev=new EvenThread(even);
			f.t.start();
			ev.t.start();
			try 
				{
				Thread.sleep(10000);
	    			}
	    		catch(InterruptedException e)
	    			{
				System.out.println("Main Thread Interrupted");
	    			}
			System.out.println("Main thread exiting");
		}


	}
	


/*OUTPUT
========
C:\Users\HP\Downloads>javac FibEven.java

C:\Users\HP\Downloads>java FibEven
Fibonacci Limit :
10
Check_Even upto :
7
Even Number: 0
fibonacci: 0
 fibonacci: 1
fibonacci: 1
Even Number: 2
fibonacci: 2
fibonacci: 3
Even Number: 4
fibonacci: 5
Even Number: 6
Exiting  EvenThread.
fibonacci: 8
fibonacci: 13
Exiting  FibThread.
Main thread exiting

*/	
	