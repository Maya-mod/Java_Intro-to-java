/* Name: Maya
* 18/07/2019
*  This program calculate the radius, areas and the perimeters of the incircle and the excircle of a given recangle  
*/

import java.util.Scanner; // request access to scan import library

	public class Circle 
{
		public static void main(String [] args)
		{
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" This program calculates the radius, areas and the perimeters of the incircle and the excircle of a given recangle ");
		System.out.println(" please enter the two coordinates of the " + "left-uper point of the recangle");
		
		double LeftUpX=scan.nextDouble(); // enter x,y of the left point		
		double LeftUpY=scan.nextDouble();
		
		System.out.println(" please enter the two coordinates of the " + "right-down point of the recangle");

		double RightDownX=scan.nextDouble(); // enter x,y of the right point		
		double RightDownY=scan.nextDouble();
		
		double InDiameter=Math.abs(LeftUpY)-Math.abs(RightDownY); // calculate the incircle diameter
		double InRadius=InDiameter*0.5; //calculate the incircle radius
		double InArea=Math.PI*(InRadius*InRadius); // calculate the area of the incircle
		double InPerimeter=Math.PI*2*InRadius; // calculate the perimeter of the incircle
		System.out.println(" Incircle: radius = " +InRadius +", area = " +InArea +", perimeter = " +InPerimeter ); // presenting the calculates of the radius, area and perimeter

		double ExDiameter=Math.sqrt(Math.pow(LeftUpX-RightDownX, 2)+Math.pow(LeftUpY-RightDownY, 2)); // calculate the excircle diameter
		double ExRadius=ExDiameter*0.5; //calculate the excircle radius
		double ExArea=Math.PI*(ExRadius*ExRadius); // calculate the area of the excircle
		double ExPerimeter=Math.PI*2*ExRadius; // calculate the perimeter of the excircle
		System.out.println(" Excircle: radius = "+ ExRadius +", area = " +ExArea + ", perimeter = " + ExPerimeter); // presenting the calculates of the radius, area and perimeter


		} // end of method main
		
} // end of class Circle
