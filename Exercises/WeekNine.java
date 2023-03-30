package Exercises;

public class WeekNine {
    public static void main(String[] args) {

        // Thore's notes
        // a) Bob is a runner. He has been running 4 km every day of the week, except in the week-ends.
        // What is the worst case number of kilometers he runs per day? He started this new workout
        // schedule on a Saturday. What is the amortised number of kilometers he runs per day?



        // b) Ran is also a runner. He rolls a die every morning and runs as many kilometers. (i) What
        // is the expected number of kilometers Ran runs per day, assuming he has a perfect die? (Or
        // what about enchanted dice that always come up 1? Or cursed dice that always come up 6?)
        // (ii) What is the worst-case number of kilometers Ran runs per day? (iii) For any sequence
        // of days starting on a Saturday, what is the worst-case amortised number of kilometers Ran
        // runs per day? (Note that this answer must hold even if his dice are cursed.)


        
        // c) My phone company charges 10 DKK for 1 minute of voice call. This is exorbitant, but I
        // never use my phone for making a phone call anyway. According to the contract, I have to
        // pay at least 100 DKK per month for voice calls whether I use them or not, but the contract
        // automatically ‘rolls over’ the unused minutes to the next month. I have to call my mum
        // for Christmas for a 2-hour call. Describe the expense in terms of ‘money I spend on voice
        // calls each month’ in the worst case and in the amortised sense.




        // d) A multiride ticket in the Danish amusement park Tivoli costs 200 DKK and is valid for 10
        // rides. What is the worst case cost for a single ride? What is the amortised cost for a ride? (Careful!)





        // 1.4.29a 
        // This was a red exercise in week 3. The focus this week is on the argument for the amortized number of stack operations.
        // Steque with two stacks. Design a steque (a stack-ended queue or steque is a data type that supports push, pop, and enqueue) 
        // with two stacks so that each steque operation takes a constant amortized number of stack operations.

        // Since we can divide each of the operation to the empty stacks, we can argue that the 1+1+1+1+1+1+ ... O(n) operations can be divided with itself.
        // Hence, that O(n)/O(n) giving us O(1) amortized constant time.



        // See question 2 in the exam set bads-120531.pdf on learnit. Note: g) and h) are also covered in the quiz.
        // 2. Class Y. The next few questions all concern the class defined in fig. 1
        // a) Class Y behaves like which well-known data structure?
        // OPTION: (B) The data structure is a queue as the inserting adds on the end of the array and the remove is from the start.
        


        // b) Write the body of a method int size() that returns the number of elements in the data structure.
        // OPTION: (A) Return N as it maps the actual size of the array.



        // c) Which invariant does the data structure maintain after every public operation?
        // OPTION: (A) N < A.length



        // d) Draw the data structure (including the contents of A and the values hi, lo, and N) after the following operations:
        // DRAWING:
        // lo = 0  ;   hi = 1  ;  n = 1          
        // Queue = [3, null]



        // e) How many array accesses does a single call to Y.remove take in the worst case? (To make this
        // well-defined we assume that the compiler performs no clever optimisations. That is, every array
        // access we’ve written in the code will actually be performed.)
        // OPTION: (B) 2 because there is only two array accesses in the method 



        // f) How many array accesses does a single call to the most expensive public method of Y take in the worst case?
        // OPTION: (A) approximately 4N because of the rebuild method.



        // g) What is the amortized number of array accesses per operation in a sequence of k Y.insert operations beginning in an empty data structure?
        // OPTION: (B) constant as the amount of constant operations scale with N elements



        // h) What is the number of array accesses per operation in the following sequence of 2k operations,
        // starting from an empty data structure: y.insert(1); y.remove(); y.insert(2); y.remove();
        // y.insert(3); y.remove(); ···y.insert(k); y.remove();
        // OPTION: (B) constant in the worst case.



        // i) True of false: The data structure Y uses space linear in N. Explain your answer on a separate
        // piece of paper. (Be as formal and short as you can, but not shorter. If you use more than half a page
        // of text you’re on the wrong level of abstraction.)
        // ANSWER: FALSE
        // We could insert N elements and remove them again. Hence, Y would be very large but N would be 0.


        // Set Union
        // In the Set Union problem we have n elements, that each are initially in n singleton sets, and we want to support the following operations:
        //  * Union(A,B): Merge the two sets A and B into one new set C = A∪B, destroying the old sets.
        //  * SameSet(x, y): Return true, if x and y are in the same set, and false otherwise.
        // We can implement it the following way. Initially, give each set a color. When merging two sets, 
        // recolor the smallest one with the color of the larger one (break ties arbitrarily). 
        // To answer SameSet queries, check if the two elements have the same color.

        // a) Analyze the worst case cost of the two operations.
        // ANSWER: 

        // b) Show that the amortized cost is O(log n) for Union and O(1) for SameSet. That is, show
        // that any sequence of m unions and s SameSet operations takes time O(m log n + s). 
        // Hint: Give a bound on the number of times an element can be recolored.
        // ANSWER: 


        // 1.4.31a
        // This was a red exercise in week 3. The focus this week is on the argument for the amortized number of stack operations. 
        // Deque with three stacks. Design a deque (a double-ended queue that supports pushLeft, pushRight, popLeft and popRight) 
        // with three stacks so that each deque operation takes a constant amortized number of stack operations.
        // ANSWER: It will be constant amortized number of stack operations in the end with the solution to the problem.
        // As the number of elements, divided by the "the worst case scenario of moving the moving half of elements of to the left stack".

    }
}