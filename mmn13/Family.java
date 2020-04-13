/* Name: Maya 
*  20/08/2019
*  This program calculates how much compensation comes under certain conditions 
*  for families whom stayed out of the state for specific reason. 
*/
import java.util.Scanner;

public class Family
{
	public static void main(String[] args)
	{
		System.out.println ( "please enter ID number, how many family members and how many days you had to stay abroad? " );
		Scanner scan=new Scanner(System.in); //notify the program that an input is about to come
		
		final int PAY_PER_DAY = 120; // stating the amount that need to be payed to every individual 
		final int EXTRA_PAY_PER_DAY = 450; // stating the extra pay for day if its over 3 days
		final int THREE_DAY = 3; // indicates day no#	
		
		int totalSum = 0 ,id , familyMem ,daysOver; // reset the total sum + stating other int's for future calculation
		int refundThreeDays = 0, refundAfter = 0; // reset count for refund		
		
			for ( int i=0; i<30; i++ ) //starting a loop that will continue 30 times to receive input and check each time the condition
			{
				refundAfter = 0;
				id = scan.nextInt();//the first input id
				familyMem = scan.nextInt();//the second input family member
				daysOver = scan.nextInt();//the third input days over
			
			if (daysOver<3) //making a condition for for the the option of staying under 3 days
			{
				refundThreeDays = PAY_PER_DAY*familyMem*daysOver; //calculate how much money the company need to refund here
			}
			
			else //if the family stayed over three days then the program will continue to here (else)
			{
				refundThreeDays = PAY_PER_DAY*familyMem*THREE_DAY; //calculate compensation for three days
				refundAfter=EXTRA_PAY_PER_DAY*(daysOver-THREE_DAY);// calculate compensation for extra days minus three days
			}
			
			totalSum = totalSum+refundThreeDays+refundAfter;// collecting compensation from each family 
			System.out.println(id+ " ," + (refundThreeDays+refundAfter));//every input is printed separately with the compensation
		}
		
		System.out.print ( "for 30 familys the company will have to pay " + totalSum );
	
	} // end of method main
} // end of class Family 
