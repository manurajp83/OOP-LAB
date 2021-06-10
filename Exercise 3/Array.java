
import java.util.*;
class Array{
	
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter number of elements: ");

int n = sc.nextInt();

int numbers[] = new int[n];

System.out.println("Enter the elements: ");
		
for(int i=0; i<n; i++){

numbers[i] = sc.nextInt();
		
}
		
Array a = new Array();
		
System.out.print("Enter the element to search: ");
int s = sc.nextInt();
		
System.out.println("Choose search option: ");
System.out.println("1. Linear Search\n2. Simple Binary Search\n3. Recursive Binary Search");
System.out.print("option: ");
int opt = sc.nextInt();
		
int op = -1;
switch(opt){
		
	case 1:	op = a.linearSearch(s,numbers);
		break;
				
	case 2:	Arrays.sort(numbers);
	        op= a.simpleBinarySearch(s,numbers);
	        break;
			
	case 3:	Arrays.sort(numbers);
		op = a.recursiveBinarySearch(numbers,0,n-1,s);
		break;
			
	default: System.out.println("Invalid Option!");
}
		
		
if(op > -1){
System.out.println(s + " found :");
} else {
		
System.out.println(s + " not found :");
		}
	}
	
		
	// Linear Search Function
int linearSearch(int n,int[] numbers){
		
for(int i=0; i<numbers.length; i++){
if( numbers[i] == n){
return i;
	}
	}
return -1;
	}
	
	//Simple Binary Search Function
int simpleBinarySearch(int n, int[] numbers){
		
int first = 0;
int last = numbers.length - 1;
int mid = (first + last) / 2;
		
while(first <= last){
if(numbers[mid] < n){
first = mid + 1;
} else if(numbers[mid] > n){
last = mid - 1;
} else {
return mid;
			
}
			
mid = (first + last) / 2;
		}
return -1;
		
}
	
	
//Recursive Binary Search Function
int recursiveBinarySearch(int[] numbers, int first, int last, int x){
		
if(first <= last && first < numbers.length-1){
		
int mid = first + (last-first)/2;
			
if(numbers[mid] < x){
return recursiveBinarySearch(numbers, mid+1, last,x);
			
}
			
if(numbers[mid] > x){
return recursiveBinarySearch(numbers, first, mid-1,x);
			
}
			
return mid;
}
		
return -1;
}
}


/*

-----------------------------------------OUTPUT-----------------------------------



Enter number of elements:
4
Enter the elements:
4
3
2
1
Enter the element to search: 2
Choose search option:
1. Linear Search
2. Simple Binary Search
3. Recursive Binary Search
option: 2
2 found :

Enter number of elements:
5
Enter the elements:
5
4
1
2
6
Enter the element to search: 4
Choose search option:
1. Linear Search
2. Simple Binary Search
3. Recursive Binary Search
option: 1
4 found :


Enter number of elements:
3
Enter the elements:
2
1
3
Enter the element to search: 3
Choose search option:
1. Linear Search
2. Simple Binary Search
3. Recursive Binary Search
option: 3
3 not found :




*/

