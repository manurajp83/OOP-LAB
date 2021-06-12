class StringMan
{
	public static void main(String [] args)
	{
                System.out.println("............................................................................................");

		char arr[]={'R','A','D','I','O'};
		String str= new String(arr);
		System.out.println("\n1.New string(Char):  "+str);
		byte ascii[]={81,82,83,84,85,86,87,65,88,89,90};
		String str2=new String(ascii);
		System.out.println("\nNew String(byte):  "+str2);

                System.out.println("............................................................................................");

		System.out.println("\n2.String length is "+str.length());

                System.out.println("............................................................................................");
		System.out.println("\n3.Concatenation Methods");
		
		System.out.println("\n.String Concatenation Method 1");
		String str3=str.concat(str2);
		System.out.println("\nAfter Concatenation "+str3);
                 System.out.println("\nString Concatenation Method 2");
		String str4=str+str2;
		System.out.println("\nafter Concatenation "+str4);

                System.out.println("............................................................................................");

		System.out.println("\n4.Character Extraction");
                System.out.println("\nusing charAt():");
		System.out.println("\nCharacter at 4th position "+str4+" is "+str4.charAt(3));
		System.out.println("\nUsing getChars()");
		char getch[]=new char[5];
		str4.getChars(5,10,getch,0);
		System.out.println("\n Charactar between 6rd and 11th position in "+str4+" are: "+new String(getch));

		System.out.println("............................................................................................");

		System.out.println("\n5.String Comparison");
		System.out.println("\nusing equals():");
		System.out.println(str+" equals "+str2+" -> "+str.equals(str2));
		System.out.println(str3+" equals "+str4+" -> "+str.equals(str4));
		System.out.println("\n\nusing equalsIgnoreCase():");
		String str5="mango";
		String str6="man";
		System.out.println(str+" equalsIgnoreCase "+str5+" -> "+str.equalsIgnoreCase(str5));
		System.out.println("\nnusing startsWith()&endsWith():");
		System.out.println(str5+" startswith "+str6+" -> "+str5.startsWith(str6));
		System.out.println(str5+" endswith "+str6+" -> "+str5.endsWith("str6"));
		System.out.println("\nusing == :");
		System.out.println(str3+" == "+str4+" -> "+(str==str4));
		System.out.println("\n using compareTo():");
		System.out.println(str +" compare to "+str2+" -> "+str.compareTo(str2));
                System.out.println("............................................................................................");				
		System.out.println("\n\n6.Searching Substring");		
		System.out.println("\n using indexOf():");
		System.out.println("\n indexof first occurrence of -A- in "+str3+" is: "+str3.indexOf('A'));
		System.out.println("\n using lastIndexOf():");
		System.out.println("\n indexof first occurrence of -A- in "+str3+" is: "+str3.lastIndexOf('A'));
		System.out.println("............................................................................................");
		System.out.println("\n\n7.Modifying String");
		System.out.println("\n using toLowerCase():");
		System.out.println(str+" after converting to lowercase-> "+str.toLowerCase());
		System.out.println("\n using toUpperCase():");
		System.out.println(str5+" after converting to lowercase-> "+str5.toUpperCase());
		System.out.println("\n using subString():");
		System.out.println("after creating new substring from 4th index to 9 in"+str3+" is: "+str3.substring(4,10));
		System.out.println("\n using replace():");
		System.out.println(str6+" after replacing \"m\" into \"f\" :"+str6.replace('m','f') );		
		System.out.println("............................................................................................");
		System.out.println("\n8.Data Conversion using valueOf()");
		int val=150;
		String str7=String.valueOf(val);
		System.out.println("after converstion -> "+(str7+20));
		System.out.println("............................................................................................");
		
		}
}
		
/*OUTPUT

C:\Users\ROG\Desktop\java\Exercise 3>javac StringMan.java

C:\Users\ROG\Desktop\java\Exercise 3>java StringMan
............................................................................................

1.New string(Char):  RADIO

New String(byte):  QRSTUVWAXYZ
............................................................................................

2.String length is 5
............................................................................................

3.Concatenation Methods

.String Concatenation Method 1

After Concatenation RADIOQRSTUVWAXYZ

String Concatenation Method 2

after Concatenation RADIOQRSTUVWAXYZ
............................................................................................

4.Character Extraction

using charAt():

Character at 4th position RADIOQRSTUVWAXYZ is I

Using getChars()

 Charactar between 6rd and 11th position in RADIOQRSTUVWAXYZ are: QRSTU
............................................................................................

5.String Comparison

using equals():
RADIO equals QRSTUVWAXYZ -> false
RADIOQRSTUVWAXYZ equals RADIOQRSTUVWAXYZ -> false


using equalsIgnoreCase():
RADIO equalsIgnoreCase mango -> false

nusing startsWith()&endsWith():
mango startswith man -> true
mango endswith man -> false

using == :
RADIOQRSTUVWAXYZ == RADIOQRSTUVWAXYZ -> false

 using compareTo():
RADIO compare to QRSTUVWAXYZ -> 1
............................................................................................


6.Searching Substring

 using indexOf():

 indexof first occurrence of -A- in RADIOQRSTUVWAXYZ is: 1

 using lastIndexOf():

 indexof first occurrence of -A- in RADIOQRSTUVWAXYZ is: 12
............................................................................................


7.Modifying String

 using toLowerCase():
RADIO after converting to lowercase-> radio

 using toUpperCase():
mango after converting to lowercase-> MANGO

 using subString():
after creating new substring from 4th index to 9 inRADIOQRSTUVWAXYZ is: OQRSTU

 using replace():
man after replacing "m" into "f" :fan
............................................................................................

8.Data Conversion using valueOf()
after converstion -> 15020
............................................................................................

C:\Users\ROG\Desktop\java\Exercise 3>

*/

		
		