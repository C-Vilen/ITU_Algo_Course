package Exercises;

public class WeekThree {
    public static void main(String[] args) {
        
        // 1.4.5
        //Give tilde approximations for the following quantities:
        // a. N + 1
        // The function will grow at a N tilde approximation

        // b. 1 + 1/N
        // The function will grow at a 1 tilde approximation

        // c. (1 + 1/N)(1 + 2/N)
        // The function will grow at a 1 tilde approximation

        // d. 2N^3 − 15N^2 + N
        // The function will grow at a 2N^3 tilde approximation


        // 1.4.6
        // Give the order of growth (as a function of N) of the running times of each of the following code fragments:
        int N = 1000000;
        // a.
        int sum = 0;
        for ( int n = N; n > 0; n /= 2)
            for (int i = 0; i < n; i++)
                sum ++;
        // O(N)

        // b:
        for ( int i = 1; i < N; i *= 2)
            for ( int j = 0; j < i; j++)
                sum ++;
        // O(N)
        

        // c:
        for ( int i = 1; i < N; i *= 2)
            for ( int j = 0; j < N; j++)
                sum ++;
        // O(N log(N))


        // 1.4.10
        // Modify binary search so that it always returns the element with the smallest index that matches the search element (and still guarantees logarithmic running time).

        // Initialize low to 0 and high to N-1, where N is the number of elements in the array.
        // While low <= high, do the following:
        // a. Compute mid as the average of low and high, rounding down to an integer.
        // b. If the search element is less than the middle element, set high to mid-1.
        // c. If the search element is greater than the middle element, set low to mid+1.
        // d. If the search element is equal to the middle element, set high to mid-1.
        // If the search element was found, its smallest index is now stored in high. 
        // If the search element was not found, high is the index of the largest element that is less than the search element.
        // By changing the line in step 2d to set high to mid-1 instead of returning mid, we ensure that the search continues in the left half of the array if there are multiple occurrences of the search element. 
        // Once the search has ended in step 2, the variable high contains the smallest index of the search element, if it was found. 
        // If the search element was not found, high contains the index of the largest element that is less than the search element.

        // 1.4.12
        // Design a program that, given two sorted arrays of N int values, prints all elements that appear in both arrays, in sorted order. 
        // The running time of your program should be proportional to N in the worst case.
        int[] arr1 = {1,2,2,5,6};
        int[] arr2 = {2,3,3,7,8};
        int index1 = 0;
        int index2 = 0;
        while ((index1 < arr1.length && index2 < arr2.length)) {
            if (arr1[index1] < arr2[index2]) {
                index1++;
            } else if (arr1[index1] > arr2[index2]){
                index2++;
            } else {
                System.out.println(arr1[index1]);
                index1++;
                index2++;
            }
        }

        // 1.4.5
        // Give tilde approximations for the following quantities:
        // e. lg(2N)/ lg N
        // The function will grow at a 1 tilde approximation

        // f. lg(N^2 + 1)/ lg N
        // The function will grow at a  lg(N^2 + 1)/ lg N   ~=   lg(N^2)/ lg N     =    2 lg N / lg N     =     ~2 tilde approximation


        // 1.4.1
        // Show that the number of different triples that can be chosen from N items is precisely N(N − 1)(N − 2)/6. Hint: Use mathematical induction.
        // (N/3)  -> (N!)/(3!*(N-3)!). 

        // This can also done by looking at the length of some K (1,2,3,4) and adding some +1 element to the length, hence, p(k+1).
        // This means that P(k+1) = P(k) + (k / 2) as the added element gives an double for part of the list the new element.
        // -> 


        // 1.4.24
        // Suppose that you have an N-story building and plenty of eggs. Suppose also that an egg is broken if it is thrown off floor F or higher, and unhurt otherwise. 
        // First, devise a strategy to determine the value of F such that the number of broken eggs is ∼lg N when using lg N throws, then find a way to reduce the cost to ∼2 lg F.
        
        // The number of broken eggs is ∼lg N can be done by binary search of dropping an egg in the middle and move up or down accordingly until we find the floor below F.
        // We can reduce the cost to ∼2 lg N by starting at the buttom and going up the floors of 1*2 hence, going to floor 1, 2, 4, 8 and then use binary search to find floor F when the egg breaks.


        // 1.4.25
        // Consider question 1.4.24, but now suppose you only have two eggs, and your cost model is the number of throws. 
        // Devise a strategy to determine F such that the number of throws is at most 2√N , then find a way to reduce the cost to ∼c√F . 
        // This is analogous to a situation where search hits (egg intact) are much cheaper than misses (egg broken).

        // The 2√N strategy can be done by starting at the buttom of the building and moving up by √N until the first egg breaks.
        // Hereafter, we can go back to the previous floor where it did not break and move lineally up until the second egg breaks which will be floor egg and has been done by the logarithm of 2√N.

        // The ∼c√F strategy can be done by moving i -> i+1 up the floors until the first egg breaks which will be 1, 3, 6 and 10.
        // Then move the 

        // 1.4.18 
        // Design a program that, given an array a[] of N distinct integers, finds a local minimum: an index i such that a[i-1] > a[i] < a[i+1]. 
        // Note that for the edge case i = 0 it is only necessary that a[0] be smaller than a[1], and for a[n-1] it only needs to be smaller than a[n-2].
        // Your program should use ∼2lg(N) compares in the worst case.

        // This can be done by checking the the middle of the array of a[N] and its left neighbore. If the left is lower, we go left else we check the right and vice versa.
        // Hence, the whole array can be fought of a series of up and down going points on a graph.

        // 1.4.29
        // Steque with two stacks. Design a steque (a stack-ended queue or steque is a data type that supports push, pop, and enqueue) with two stacks 
        // so that each steque operation takes a constant amortized number of stack operations.

        // 

        // 1.4.30 
        // Deque with a stack and a steque. Design a deque (a double-ended queue that supports pushLeft, pushRight, popLeft and popRight) with a stack 
        // and a steque so that each deque operation takes a constant amortized number of stack and steque operations.

        // 
        
        // 1.4.31
        // Deque with three stacks. Design a deque (a double-ended queue that supports pushLeft, pushRight, popLeft and popRight) with three stacks 
        // so that each deque operation takes a constant amortized number of stack operations.

    }
}