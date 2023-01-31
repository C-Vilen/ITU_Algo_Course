package Exercises;

import edu.princeton.cs.algs4.StdOut;

public class OneOneFourteen {
    private static int lg(int n) {
	
        // Initialize a variable to keep track of the current power of 2
        int logInt = 0;
        
        // Repeat the loop until the current power of 2 is greater than n
        while (n > 1) {
            // Increment the current power of 2
            logInt++;
            
            // Divide n by 2 to find the next power of 2
            n /= 2;
        }

        // Returns the current power of 2
        return logInt;

    }    

    public static void main(String[] args) {
        StdOut.println(lg(15));
        StdOut.println("Expecting: 3");
    }
}

