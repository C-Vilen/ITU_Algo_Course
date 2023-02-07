package Exercises;

import edu.princeton.cs.algs4.StdOut;

public class WeekOne {

    // Method for 1.1.14
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

        /* 1.1.14
         * Design an algorithm that takes an integer value N as argument and 
         * returns the largest integer not larger than the base-2 logarithm of N. Do not use a math library.
         */
        StdOut.println(lg(15));
        StdOut.println("Expecting: 3");
        

        /* 1.5.1
        * Show the contents of the id[] array and the number of times the array is accessed for each input pair 
        * when you use quick-find for the sequence 9-0 3-4 5-8 7-2 2-1 5-7 0-3 4-2.
        */
        System.out.println(
            "10 ele: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] \n"+
            "9  0:  9[0, 1, 2, 3, 4, 5, 6, 7, 8, 0] -> 10 array lookups + 2 finds + 1 changes \n"+
            "3  4:  8[0, 1, 2, 4, 4, 5, 6, 7, 8, 0] -> 3  array lookups + 2 finds + 1 changes\n"+
            "5  8:  7[0, 1, 2, 4, 4, 8, 6, 7, 8, 0] -> 6  array lookups + 2 finds + 1 changes\n"+
            "7  2:  6[0, 1, 2, 4, 4, 8, 6, 2, 8, 0] -> 8  array lookups + 2 finds + 1 changes\n"+
            "2  1:  5[0, 1, 1, 4, 4, 8, 6, 1, 8, 0] -> 8  array lookups + 2 finds + 2 changes\n"+
            "5  7:  4[0, 1, 1, 4, 4, 1, 6, 1, 1, 0] -> 9  array lookups + 2 finds + 2 changes\n"+
            "0  3:  3[4, 1, 1, 4, 4, 1, 6, 1, 1, 4] -> 10 array lookups + 2 finds + 2 changes\n"+
            "4  2:  2[1, 1, 1, 1, 1, 1, 6, 1, 1, 1] -> 10 array lookups + 2 finds + 4 changes"
        );

        /* 1.5.2
         * Do Exercise 1.5.1, but use quick-union (page 224). In addition, draw the forest
         * of trees represented by the id[] array after each input pair is processed.
         */
        System.out.println(
            " Quick union (looking at the root structure \n"+
            "10 ele: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] \n"+
            "9  0:  9[0, 1, 2, 3, 4, 5, 6, 7, 8, 0] -> 10 array lookups + 2 finds + 1 changes \n"+
            "3  4:  8[0, 1, 2, 4, 4, 5, 6, 7, 8, 0] -> 3  array lookups + 2 finds + 1 changes\n"+
            "5  8:  7[0, 1, 2, 4, 4, 8, 6, 7, 8, 0] -> 6  array lookups + 2 finds + 1 changes\n"+
            "7  2:  6[0, 1, 2, 4, 4, 8, 6, 2, 8, 0] -> 8  array lookups + 2 finds + 1 changes\n"+
            "2  1:  5[0, 1, 1, 4, 4, 8, 6, 2, 8, 0] -> 8  array lookups + 2 finds + 2 changes\n"+
            "5  7:  4[0, 1, 1, 4, 4, 8, 6, 2, 1, 0] -> 9  array lookups + 2 finds + 2 changes\n"+
            "0  3:  3[4, 1, 1, 4, 4, 8, 6, 2, 1, 0] -> 10 array lookups + 2 finds + 2 changes\n"+
            "4  2:  2[4, 1, 1, 4, 1, 8, 6, 2, 1, 0] -> 3  array lookups + 1 finds + 1 changes"
        );

        /* 1.5.3
         * Do Exercise 1.5.1, but use weighted quick-union (page 228).
         */




         /* 1.5.8
          * Give a counterexample that shows why this intuitive implementation 
          * of union() for quick-find is not correct:
          * 
          * public void union (int p, int q) {
          *     if ( connected (p, q)) return ;
          *     // Rename p’s component to q’s name .
          *     for (int i = 0; i < id. length ; i ++)
          *         if (id[i] == id[p]) id[i] = id[q];
          *     count - -;
          * }
          *
          * No it is not a weighted quick-union,
          * since the variables of p's & q's indicies is not save once it moves each step
          */

        /* 1.5.9
         * Draw the tree corresponding to the id[] array depicted below. Can this be the
         * result of running weighted quick-union? Explain why this is impossible or give a sequence of
         * operations that results in this array.
         *    i  0 1 2 3 4 5 6 7 8 9
         * id[i] 1 1 3 1 5 6 1 3 4 5
         * 
         * It cannot be a weighted quick-union since the branch of 5-9-8 as the 5 should have gone under the node of 9
         * This is due to the weighted logic says the smaller amount 
         * It will also always have the maximum deept of log2(n) for all subtrees
         * considering the subtree 1-6-5-9-4-8 has a steps of 4 and log2(6) gives less than 4
         */
    }
}
