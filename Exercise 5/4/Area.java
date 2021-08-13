import Graphics.*;
class Area
{
	public static void main(String []args)
	{	System.out.println("---------Area of rectangle having height and width 2 and 4--------");
		Rectangle t=new Rectangle(2,3);
		t.area();
		System.out.println("\n------------Area of circle having radius 3-------------");
		Circle c = new Circle(3);
		c.area();
		System.out.println("\n---------------Area of square having side 4-----------");
		Square s = new Square(4);
		s.area();
	}
}


/*
-------
output
-------

---------Area of rectangle having height and width 2 and 3--------
Area of Rectangle is:6

------------Area of circle having radius 3-------------
Area of Circle:28.259999999999998

---------------Area of square having side 5-----------
Area of Square:25

*/
//Verified
