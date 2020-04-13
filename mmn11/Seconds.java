/* Name: Maya
 * 18/07/2019
*  This program calculate the amount of the seconds from the integers inserted
*
*/
import java.util.Scanner; // request access to scan import library 

	public class Seconds // name class
{
		public static void main(String [] args) //notify the program of the intention to insert strings and args.
		{
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Please enter 3 integers "); // request to enter 3 integers
		
		int x1=scan.nextInt();
		int x2=scan.nextInt();
		int x3=scan.nextInt();
		/// connecting between the integers and the final
		final int DAY=x1*60*60*24;
		final int HOUR=x2*60*60;	
		final int MINUTES=x3*60;
		
		System.out.println(x1 + " days, " + x2 + " hours and " + x3 + " minutes equal to " + (DAY+HOUR+MINUTES) + " seconds " );
	
		} // end of method main
} // end of class Seconds
