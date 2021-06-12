/* Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)and static nested class RAM (memory, manufacturer). Create an object of CPU and
print information of Processor and RAM.  */


import java.util.Scanner;
class Cpu
{
   int price;
   
   class Processor
   {
       String no_of_cores, manufacturer;
   }

   static class Ram
   {
      int memory;
      String manufacturer;
   }

}

class Cpuinfo
{
public static void main(String args[])
{
   Cpu.Ram ram=new Cpu.Ram();
  
    Cpu outer = new Cpu();
    Cpu.Processor inner = outer.new Processor() ;
 
   
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Processor Manufacturer:");
   inner.manufacturer=sc.next();
   System.out.println("Enter the No of Cores of Processor:");
   inner.no_of_cores=sc.next();
   System.out.println("Enter the RAM Memory:");
   ram.memory=sc.nextInt();
   System.out.println("Enter the RAM Manufacturer:");
   ram.manufacturer=sc.next();
   System.out.println("Enter the Price:");
   outer.price=sc.nextInt();

   System.out.println("Processor Manufacturer:"+inner.manufacturer);
   System.out.println("No of Cores of Processor:"+inner.no_of_cores);
   System.out.println("RAM Memory:"+ram.memory);
   System.out.println("RAM Manufacturer:"+ram.manufacturer);
   System.out.println("Price:"+outer.price);

}
}

  /* Enter the Processor Manufacturer:
AMD
Enter the No of Cores of Processor:
16
Enter the RAM Memory:
16
Enter the RAM Manufacturer:
HP
Enter the Price:
3400
Processor Manufacturer:AMD
No of Cores of Processor:16
RAM Memory:16
RAM ManufacturerHP
Price:3400
*/






   
 
