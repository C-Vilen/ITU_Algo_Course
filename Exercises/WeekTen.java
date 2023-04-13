package Exercises;

public class WeekTen {
    public static void main(String[] args) {
        

    // 2.3.3 - Yellow What is the maximum number of times during the execution of Quick.sort()
    // that the largest item can be exchanged, for an array of length N?

    // This will be N/2.



    // 2.3.4 - Yellow Suppose that the initial random shuffle is omitted. Give six differently ordered
    // arrays of ten elements for which Quick.sort() uses the worst-case number of compares.

    // Quick.sort has the worst case of O(n^2). 
    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    // [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
    // [3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
    // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    // [11, 10, 9, 8, 7, 6, 5, 4, 3, 2]
    // [12, 11, 10, 9, 8, 7, 6, 5, 4, 3]



    // 2.3.13 - Yellow What is the recursive depth of quicksort, in the best, worst, and average
    // cases?

    // The best case is log(N) depth
    // The average case is C * log(N) depth
    // The worst case is N depth



    // 5.1.17 - Yellow Develop a version of key-indexed counting that uses only a constant amount
    // of extra space. Prove (or argue) that your version is stable or provide a counterexample.
    
    // 


    
    // Old exam set 120531: 3(d-j)  - Yellow See question 3 (subsections d through j) in the exam set bads-120531.pdf on learnit.
    // In the following 7 questions, consider the sequence of integers, 6425 5467 4857 5479 4794 2386 5678 9974
    // as input to a sorting algorithm. Each question describes an intermediate stage of one and only one
    // sorting algorithm: quicksort, (top-down) merge sort, insertion sort, selection sort, LSD string sort,
    // MSD string sort, and heap sort. (Every algorithm corresponds to exactly one sequence.) Which is which?
    // ORIGINAL: 
    // 6425 5467 4857 5479 4794 2386 5678 9974
    
    
    // 5678 5467 4857 5479 4794 2386 6425 9974
    // D: Quick sort

    // 9974 6425 5678 5479 4794 2386 4857 5467
    // E: Heap sort

    // 4857 5467 5479 6425 2386 4794 5678 9974
    // F: Merge sort

    // 2386 4794 4857 5479 5467 6425 5678 9974
    // G: Selection sort

    // 4794 9974 6425 2386 5467 4857 5678 5479
    // H: LSD sort

    // 4857 5467 6425 5479 4794 2386 5678 9974
    // I: Insertion sort

    // 2386 4857 4794 5467 5479 5678 6425 9974
    // J: MSD sort



    }
}