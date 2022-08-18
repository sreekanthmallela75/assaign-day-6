package javaprogram;
import java.io.*;
public class Nibble {
	
	class Solution{
	    static int swapNibbles(int N) {
	      // Step 1
	        int right = (N & 0b00001111);
	      // Step 3
	        right= (right<<4);
	      // Step 2
	        int left = (N & 0b11110000);
	      // Step 4
	        left = (left>>4);
	      // Step 5
	        return (right | left);
	    }
	}
	class Nibb {
	    public static void main (String[] args) {
	      Solution s = new Solution();
	      int n = 100;
	        System.out.println("Original: "+ n + " Swapped: " + s.swapNibbles(n));
	    }
}
