package Exercises;

public class WeekFour {
    public static void main(String[] args) {

        /*
         * 2.1.1
         * Show in the style of the example trace with Algorithm 2.1 from the book [SW 2.1],
         * how selection sort sorts the array E A S Y Q U E S T I O N.
         * 
         *                      a[]
         * i  min     0 1 2 3 4 5 6 7 8 9  10    11
         *            E A S Y Q U E S T I   O     N
         * 0   1      E A S Y Q U E S T I   O     N
         * 1   1      A E S Y Q U E S T I   O     N
         * 2   6      A E S Y Q U E S T I   O     N
         * 3   9      A E E Y Q U S S T I   O     N
         * 4  11      A E E I Q U S S T Y   O     N
         * 5  10      A E E I N U S S T Y   O     Q
         * 6  11      A E E I N O S S T Y   U     Q
         * 7   7      A E E I N O Q S T Y   U     S
         * 8  11      A E E I N O Q S T Y   U     S
         * 9  11      A E E I N O Q S S Y   U     T
         * 10 10      A E E I N O Q S S T   U     Y
         * 11 11      A E E I N O Q S S T   U     Y
         *            A E E I N O Q S S T   U     Y
         */


        /*
         * 2.1.4
         * Show in the style of the example trace with Algorithm 2.2 from the book [SW 2.1],
         * how insertion sort sorts the array E A S Y Q U E S T I O N.
         * 
         *                  a[]
         * i  j  0 1 2 3 4 5 6 7 8 9 10 11
         *       E A S Y Q U E S T I  O  N
         * 0  0  E A S Y Q U E S T I  O  N
         * 1  0  A E S Y Q U E S T I  O  N
         * 2  2  A E S Y Q U E S T I  O  N
         * 3  3  A E S Y Q U E S T I  O  N
         * 4  2  A E Q S Y U E S T I  O  N
         * 5  4  A E Q S U Y E S T I  O  N
         * 6  2  A E E Q S U Y S T I  O  N
         * 7  5  A E E Q S S U Y T I  O  N
         * 8  6  A E E Q S S T U Y I  O  N
         * 9  3  A E E I Q S S T U Y  O  N
         * 10 4  A E E I O Q S S T U  Y  N
         * 11 4  A E E I N O Q S S T  U  Y
         *       A E E I N O Q S S T  U  Y
         */


        /*
         * 2.2.2
         * Show in the style of the example trace with Algorithm 2.4 from the book [SW
         * 2.2],
         * how top-down mergesort sorts the keys E A S Y Q U E S T I O N.
         * 
         *                                  a[]
         *                      0 1 2 3 4 5 6 7 8 9 10 11
         *                      E A S Y Q U E S T I  O  N
         * merge(a, 0, 0, 1)    A E S Y Q U E S T I  O  N
         * merge(a, 0, 1, 2)    A E S Y Q U E S T I  O  N
         * merge(a, 3, 3, 4)    A E S Q Y U E S T I  O  N
         * merge(a, 3, 4, 5)    A E S Q U Y E S T I  O  N
         * merge(a, 0, 2, 5)    A E Q S U Y E S T I  O  N
         * merge(a, 6, 6, 7)    A E Q S U Y E S T I  O  N
         * merge(a, 6, 7, 8)    A E Q S U Y E S T I  O  N
         * merge(a, 9, 9, 10)   A E Q S U Y E S T I  O  N
         * merge(a, 9, 10, 11)  A E Q S U Y E S T I  N  O
         * merge(a, 6, 8, 11)   A E Q S U Y E I N O  S  T
         * merge(a, 0, 5, 11)   A E E I N O Q S S T  U  Y
         *                      A E E I N O Q S S T  U  Y
         */


        /*
         * 2.1.6
         * Which method runs faster for an array with all keys identical, selection sort or insertion sort?
         * 
         * 
         * Insertion sort because it will only make one comparison with the previous element (per element) and won't exchange any elements, 
         * running in linear time. Selection sort will exchange each element with itself and will run in quadratic time.
         */


        /*
         * 2.1.7
         * Which method runs faster for an array in reverse order, selection sort or insertion sort?
         * 
         * 
         * Selection sort because even though both selection sort and insertion sort will run in quadratic time, 
         * selection sort will only make N exchanges, while insertion sort will make N * N / 2 exchanges.
         */


        /*
         * 2.1.8
         * Suppose we use insertion sort on a randomly ordered array where items have only one of three values. 
         * Is the running time linear, quadratic or something in between?
         * 
         * 
         * Quadratic. Insertion sort's running time is linear when the array is already sorted or all elements are equal.
         * With three possible values the running time quadratic.
         */


        /*
         * 2.2.15
         * Explain how to take two queues of sorted items and merge them into a single queue which is in sorted order.
         * 
         * 
         * 1. Initialize an empty queue to hold the merged result.
         * 2. Dequeue the first item from each input queue.
         * 3. Compare the dequeued items.
         * 4. Enqueue the smaller item into the result queue and enqueue the larger item back into its original queue.
         * 5. Repeat steps 2-4 until one of the input queues is empty.
         * 6. Enqueue the remaining items in the non-empty input queue into the result queue.
         * 7. The result queue is now the merged and sorted queue.
         */


        /*
         * 2.2.13
         * Explain how you would put a deck of cards in order by suit (in the order spades, hearts, clubs, diamonds) 
         * and by rank within each suit, with the restriction that cards must be laid out face down in a row, 
         * and the only allowed operations are to check the values of two cards and to exchange two cards (keeping them face down).
         * 
         * 
         * I would use selection sort, comparing the cards first by suit, and if they have the same suit, by rank.
         * As we are dealing with physical objects it makes sense to minimize the number of swaps.
         * With selection sort it may be needed to look at more cards than insertion sort (twice as many in the average case)
         */


        /*
         * 2.2.17
         * Implement a natural mergesort for linked lists. Use only
         * constant amount of extra space and linearithmic time.
         */


        /*
         * 2.1.14
         * Explain how you would sort a deck of cards, with the restriction
         * that the only allowed operations are to look at the values of the top two
         * cards, to exchange the
         * top two cards, and to move the top card to the bottom of the deck.
         */


        /*
         * 2.2.16
         * Write a version of bottom-up mergesort that takes ad-
         * vantage of order in the input array by using the following idea: Use one
         * additional array of the
         * same length as the input. Work in rounds, in each round repeatedly identify
         * two sorted subarrays
         * in one array by scanning (incrementing a pointer as long as the pointed at
         * cell and its neighbor
         * are sorted), then merge these into the other array. Analyze the running time
         * in terms of the
         * array length and the number of maximal increasing sequences in the array.
         */


        /*
         * 2.2.21
         * Given three lexicographically sorted lists of nstrings
         * with a total of mcharacters. Devise an algorithm that finds the
         * lexicographically smallest string
         * that is contained in all lists. How many string comparisons does your
         * algorithm perform? How
         * many character comparisons does your algorithm perform?
         */


    }
}
