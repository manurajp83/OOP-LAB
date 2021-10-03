/*2.Write a program to write to a file ,then read from the file and display its contents*/
import java.io.*;
import java.util.*;
class FileReadWrite{
 public static void main (String args[]) throws IOException
 {
  Scanner sc=new Scanner(System.in);
  String source="";
  String t="";
  System.out.println("Enter File Name:");
  String fname=sc.nextLine();
  System.out.println("Enter the contents of file press / to stop"); 
  while(sc.hasNextLine())
  {
   t=sc.nextLine();
   if(t.equals("/"))
   break;
   source+=t+"\n";
  }
  byte buf[]=source.getBytes();
  try(FileOutputStream f1=new FileOutputStream(fname);)
  {
   f1.write(buf);
   System.out.println("Writed Successfully");
  }
  catch(IOException e)
  {
   System.out.println("An I/O error Occured");
  } 
  System.out.println("Reading from "+fname+"\n--------------------------");
  int i;
  try(FileInputStream f2=new FileInputStream(fname);)
  {
   do
   {
    i=f2.read();
    if(i!=-1)
     System.out.print((char)i);
   }while(i!=-1); 
  }
  catch(FileNotFoundException e)
  {
   System.out.println("File not found");
   return;
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
   System.out.println("Usage sample");
   return;
  }
 }
}

/*output
D:\2ndSem\Java\Exercise11>java FileReadWrite
Enter File Name:
welcome.txt
Enter the contents of file press / to stop
Hi
Hello
Welcome
/
Writed Successfully
Reading from welcome.txt
--------------------------
Hi
Hello
Welcome
*/  