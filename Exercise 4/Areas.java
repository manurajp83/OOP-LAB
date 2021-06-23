//2.Areas of different shapes using overloading
import java.util.Scanner ;

class Square{                                                                  
	int l;
	Squre(int l){
 		this.l=l;
	} 
double area()              // area()
	{
		return l*l;
        }
}
class Rect extends Square{         // class rect
	int l,b;
	Rect (int l,int b){
                super(l);
 		this.l=l;
 		this.b=b;
	}
double area()                     // area() method
	{
		return b*l;
        }
}

class Tri extends Rect{             // class Tri 
	int b,h;
        double cons;
	Tri(int b,int h,double c){
                super(b,h);
 		this.b=b;
		this.h=h;
		this.cons=c;
	}
double area()                    // area() method
	{
		return cons*b*h;
        }
}


class Areas{
	public static void main(String[] args)
	{
	Scanner in = new Scanner (System.in ) ;
        int ch=0,l,b,h,r,i=1;
        double area; 
        String book,lit,publi,fict;
        Squre Tr[]=new Squre[4];                                            
  
       Tr[1] = new Squre(5);                                             
       area = Tr[1].area();                                                  
       System.out.println("\n Square\n----------\nside   : 9");
       System.out.println("\n Area    : "+area+" \n-----------------------------------\n");
 
       Tr[2] = new Rect(5,7);
       area = Tr[2].area();                                                  
       System.out.println("\n Rectangle \n----------\nheight : 7\nwidth  : 7");
       System.out.println("\n Area    : "+area+" \n----------------------------------- \n");
  
       Tr[3] = new Tri(6,4,0.5);
       area = Tr[3].area();                                                 
       System.out.println("\n Triangle \n----------\n>>height : 6\n>>width  : 4");
       System.out.println("\n Area    : "+area+" \n----------------------------------- \n");
  

}
}




/*---------------------------- OUTPUT :---------------------------

 Square
----------
side   : 9
Area    : 81.0
-----------------------------------


 Rectangle
----------
height : 7
width  : 7
Area    : 49.0
-----------------------------------


 Triangle
----------
height : 6
width  : 4
Area    : 12.0
-----------------------------------

*/