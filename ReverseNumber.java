package JavaProgramming;
import java.io.*;
public class ReverseNumber {
	
	 
	class Reverseno {
	      
	    // stores reversed number
	    static int rev = 0;
	   
	    // Function to reverse the number
	    static void reverse(int n){
	       
	      if(n<=0)
	        return ;
	       
	      int rem = n%10;  // remainder
	       
	      rev = (rev*10) + rem;
	       
	      reverse(n/10);
	    }
	     
	   // Driver Function
	    public static void main (String[] args) {
	       
	        int n = 3152;
	      
	        reverse(n);
	       
	        System.out.print("Reversed Number is "+ rev);
	    }
	}
}
