
/* Name: Maya 02/09/2019
*  This program is testing a list of instruction in
*  sepatrated methods and check/print/calculate each method as followed
*/
import java.util.Scanner;
public class IntArrayService
{
		public static void input(int[] arr) {  //stating the size of the array
			Scanner scan=new Scanner(System.in);
			for (int i=0; i<arr.length; i++ ) {
			arr[i]=scan.nextInt();
			}
		}  //end of method input
		
		public static void print(int[] arr) {  //print numbers to fill the array
				
			for(int i = 0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
		    }
	    }  //end of method print
		
		public static void randomFill(int[] arr, int x, int y) {  //filling random numbers between two numbers

            for (int i=0 ; i < arr.length ;i++)
			arr[i]=x+ (int)(Math.random()*(y-x+1));
			}  //end of method random fill

		public static int max(int[] arr) {  //printing the maximum value from the array
			int  maxVal = arr[0];
			for (int i=1 ; i<arr.length ; i++) {
				if (arr[i]>maxVal) {
					maxVal=arr [i];
				}
			}
			return maxVal;
			}  //end of method max
		
		public static int indexOfMax(int[] arr) { // show the location of the max value in the array
			int index = 0;
			for (int i=0 ; i<arr.length ; i++) {
				if(arr[i]==max(arr)) {
					index = i;
				}
			}
			return index;
		}  //end of method index of max
		
		public static int sum(int[] arr) { //calculating the sum of the numbers in the array
			int sum=0;
			for(int i=0; i<arr.length; i++) {
				sum=sum+arr[i];
			}
		return sum;
		}  //end of method sum
		
		public static int evenCount(int[] arr) {  //count how many even numbers there is in the array
			int count=0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%2==0) {
					count++;
				}
			}	
		return count;
		}  //end of method even count
		
		public static boolean exist(int[] arr, int x) { //check if a any number we choose is in the array and return true/false value
				for(int i=0; i<arr.length; i++) {
				if(arr[i]==x) return true;
				
			}
			return false;
		}  //end of method exist
	
		public static boolean isOrdered(int[] arr) {  //check it the array is sorted in any way and return true/false value
			boolean ordered = true;
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {ordered=false;};
			}
			return ordered;
		}  //end of method is ordered
		
		public static int[] clone(int[] arr) {  //clone a array to b
			int[] b = new int[arr.length];
			for (int i=0; i<arr.length; i++ ) {
				b[i]=arr[i];
			}
			return b;
		}  //end of method clone
		
		public static int[] reverse(int[] arr)	{  //reverse the given array
			int[] clonedRev = new int[arr.length];
			for(int i = 0;i<arr.length;i++) {
				clonedRev[i] = arr[arr.length-1-i];
			}
			return clonedRev;
		}  //end of method reverse
		
		public static int[] evenOnly(int[] arr) {  //create new array with even numbers
			int size = evenCount(arr);
			int k = 0;
			int[] evens = new int[size];
			for(int i = 0;i<arr.length;i++) {
				if((arr[i]%2)==0) {
					evens[k] = arr[i];
					k++;
				}
			}
			return evens;
		}  //end of method even only
		
		public static int[] biggerOnly(int[] arr, int x) {  
			int count = 0;
			int k = 0;
			for(int i = 0;i<arr.length;i++) {
				if(arr[i]>x) {
					count++;
				}
			}  
			int[] bigger = new int[count]; //creates an array that is bigger from the insert number
			for(int i = 0;i<arr.length;i++) {
				if(arr[i]>x) {
					bigger[k] = arr[i];
					k++;
				}
			}
			return bigger;
		}  //end of method bigger only
		
		public static void main(String [] args) {  //main method that is printing/checking all other methods
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter a array length ");
			int[] a = new int[scan.nextInt()];
			System.out.println("Enter "+ a.length+" digits ");
			input(a);
			
			print(a);
			System.out.println("\nPlease enter X ");
			int x = scan.nextInt();
			System.out.println("Please enter Y ");
			int y = scan.nextInt(); 
			System.out.println("printing the array with numbers randomized between "+x+" and "+y);
			randomFill(a, x, y);
			System.out.println(" ");
			print(a);
			System.out.println("\nThe Maximum value for the given number's = " + max(a));
			System.out.println("The index for maximum value = " + indexOfMax(a));
			System.out.println("The sum of the number's from the array = " + sum(a));
			System.out.println("The amuont of even numbers in the array are = " + evenCount(a));
			System.out.println("Please enter any number to check if it is exist in the array ");
			int z = scan.nextInt();
			System.out.println(exist(a, z));
			System.out.println("Is the array sorted? " + isOrdered(a));
			System.out.print("cloning the array = ");
			print (clone(a));
			System.out.print("\ncloning the array in reverse = ");
			print (reverse(a));
			System.out.print("\ncreating a new array with only the even numbers = ");
			print(evenOnly(a));
			System.out.print("\nplease enter a number to create a new array bigger than = ");
			int f = scan.nextInt();
			print(biggerOnly(a, f));
			
			} // end of method main		
		
} // end of IntArrayService class


