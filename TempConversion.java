package javaprogram;
import java.util.Scanner;
public class TempConversion {
	
	class FahrenheittoCelsius
	{
		public static void main(String arg[])	
		{
		    double a,c;
	             	    Scanner sc=new Scanner(System.in);	   	 
		    System.out.println("Enter  Fahrenheit temperature");
	                   a=sc.nextDouble(); 
		    System.out.println("Celsius temperature is = "+celsius(a));		  	  	     
		} 
		static double celsius(double f)
		{	
		return  (f-32)*5/9;
		}
	}
}
