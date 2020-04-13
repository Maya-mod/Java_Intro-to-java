/* Name: Maya
*  20/08/2019
*  This program that receives a list of purchase amounts for a customer until a negative purchase amount is received.
*  must print a message whether or not this customer is a "constant buyer".
*/
import java.util.Scanner;

public class Client
{
	public static void main(String [] args)
	{
		final int NUM_OF_BUY=15; // stating one of three conditions 1 is maximum 15 purchases  
		final int ONE_PAYMENT_C=1500; //stating final which is the second conditions of 1500 one buy
		final int TOTAL_PAYMENT_C=4000; //stating the total final that complete the 3 conditions
		
		Scanner scan=new Scanner(System.in); // notify the program of intention to enter some int's
		
		int count=0;//reset count 
		int totalSum=0;//reset total sum the buy
		
		System.out.println("Please enter how much money did you pay in each buy. ");// request from the client to insert data 
		
		int payment=scan.nextInt(); // notify the program that the next int will be the payment
		
		boolean flagNumOfBuy=false,flagOnePayment=false,flagTotalPay=false; //I put a flag to mark the values I need for the program to trigger the constant buyer message
			if	(payment>0){totalSum=payment;}
				while (payment>=0)
				{
					if (payment>0) {count++;}
							totalSum=totalSum+payment;//if the amount is over 0 i keep adding them
					if (payment>ONE_PAYMENT_C)
							{flagOnePayment=true;}
							payment=scan.nextInt();
				}
					if	(totalSum>TOTAL_PAYMENT_C)   
							{flagTotalPay=true;}
					if	(count>NUM_OF_BUY)
							{flagNumOfBuy=true;}
					if  ((flagNumOfBuy&&flagOnePayment)||(flagNumOfBuy&&flagTotalPay)||(flagOnePayment&&flagTotalPay))
		{
		System.out.println("The constant buyer");// if the flag is true two times, then this massage will be printed
		}
	}	
}
