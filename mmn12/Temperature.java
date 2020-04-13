/* Name: Maya
* 29/07/2019
* this program is designed to convert a given unit temperature type to Celsius, Fahrenheit and Kelvin
*/

import java.util.Scanner; // request access to scan import library

	public class Temperature // name class
{
		public static void main(String [] args) //notify the program of the intention to insert strings and args.
		{
			
		System.out.println("Please enter temperature unit C, F or K followed by the temperature in that unit : ");
		Scanner scan=new Scanner(System.in);
		
		//stating the final numbers that exist in the Temperature conversion formula		
		final double X = (5/9.0);
		final double Y = (1.8);
		final double Z = (32);
		final double Q = (273.15);
		
		String word=scan.next();
		char type=word.charAt(0);
		double scale=scan.nextDouble();
		
		if(type == 'C') { //if the char is C then the program will convert to Fahrenheit and Kelvin
			double celsiusToFahrenheit = ((scale*Y)+Z);//calculate from Celsius to Fahrenheit
			double celsiusToKelvin = (scale+Q);//calculate from Celsius to Kelvin
			
			System.out.println(scale + " C" );
			System.out.println(celsiusToFahrenheit +" F");
			System.out.println(celsiusToKelvin +" K");
			
		}else if(type == 'F') { //if the char is F then the program will convert to Celsius and Kelvin
			double fahrenheitToCelsius = (X*(scale-Z));//calculate from Fahrenheit to Celsius 
			double fahrenheitToKelvin = ((X*(scale-Z))+Q);//calculate from Fahrenheit to Kelvin 
			
			System.out.println(fahrenheitToCelsius + " C");
			System.out.println(scale + " F");
			System.out.println(fahrenheitToKelvin + " K");	
			
		}else if(type == 'K') { //if the char is K then the program will convert to Celsius and Fahrenheit
			double kelvinTOCelsius = (scale - Q);//calculate from Kelvin to Celsius
			double kelvinToFahrenheit = ((Y*(scale-Q))+Z);//calculate from Kelvin to Fahrenheit
			
			System.out.println(kelvinTOCelsius + " C");
			System.out.println(kelvinToFahrenheit + " F");
			System.out.println(scale + " K");
		}	
	
		
		} // end of method main
		
 } // end of class Seconds
