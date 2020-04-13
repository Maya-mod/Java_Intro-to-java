/* Name: Maya
 * 29/07/2019
* this program calculates the solutions of a system of two linear equations in two vanishes
*/
import java.util.Scanner; // request access to scan import library


	public class Equations // name class
{
		
		public static void main(String [] args) //notify the program of the intention to insert strings and arguments
		{
			System.out.println("This program solves a system of 2 linear equations"); 
			System.out.println("Enter the coefficients a11 a12 a21 a22 b1 b2");
			
			Scanner scan=new Scanner(System.in);
			
			int a11=scan.nextInt(), a12=scan.nextInt(), a21=scan.nextInt(), a22=scan.nextInt(), b1=scan.nextInt(), b2=scan.nextInt();

			double x1 = ( (double) (b1*a22-b2*a12) / (a11*a22-a12*a21) ); //calculate the answer of Equation 1
			double x2 = ( (double) (b2*a11-b1*a21) / (a11*a22-a12*a21) ); //calculate the answer of Equation 2
			
				System.out.println("Eq1: " + a11 + "*x1+" + a12 + "*x2=" + b1); // print equation 1 + answer
				System.out.println("Eq2: " + a21 + "*x1+" + a22 + "*x2=" + b2); // print equation 2 + answer
				
			if  (a11*a22-a12*a21 != 0) { //checking the conditions for single solution
				System.out.println("Single solution: (" +x1+ ", " +x2+ ")");
			}
		    
			else if ((b2*a11-b1*a21)==0 && ((b1*a22-b2*a12)==0) && ((a11!=0 || a12!=0 || b1==0) && (a22!= 0 || a21!=0 || b2==0))) { //checking the conditions for many solutions
				System.out.println("Many solutions");
			}
			
			else {
				System.out.println("No solution"); //if all the above didn't come through then the answer would be no solution
			}
	
		}  // end of method main

} // end of class Equations

