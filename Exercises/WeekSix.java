package Exercises;

public class WeekSix {
    public static void main(String[] args) {
        


    // 3.1.10 Give a trace of the process of inserting the keys E A S Y Q U E S T I O N
    // into an initially empty table using SequentialSearchST. How many compares are involved?

    // key  value  first
    //  E     0      E0                                         0 compares
    //  A     1      A1  E0                                     1 compare
    //  S     2      S2  A1  E0                                 2 compares
    //  Y     3      Y3  S2  A1  E0                             3 compares
    //  Q     4      Q4  Y3  S2  A1  E0                         4 compares
    //  U     5      U5  Q4  Y3  S2  A1  E0                     5 compares
    //  E     6      U5  Q4  Y3  S2  A1  E6                     6 compares
    //  S     7      U5  Q4  Y3  S7  A1  E6                     4 compares
    //  T     8      T8  U5  Q4  Y3  S7  A1  E6                 6 compares
    //  I     9      I9  T8  U5  Q4  Y3  S7  A1  E6             7 compares
    //  O    10      O10  I9  T8  U5  Q4  Y3  S7  A1  E6        8 compares
    //  N    11      N11  O10  I9  T8  U5  Q4  Y3  S7  A1  E6   9 compares
    // Total: 55 compares
    

    // 3.1.11 - Green Give a trace of the process of inserting the keys E A S Y Q U E S T I O N
    // into an initially empty table using BinarySearchST. How many compares are involved?

    //                            keys[]				            vals[]
    // key  value    0  1  2  3  4  5  6  7  8  9    N   0  1  2  3  4  5  6  7  8  9
    //  E     0      E                               1   0                               0 compares
    //  A     1      A  E                            2   1  0                            2 compares
    //  S     2      A  E  S                         3   1  0  2                         2 compares
    //  Y     3      A  E  S  Y                      4   1  0  2  3                      2 compares
    //  Q     4      A  E  Q  S  Y                   5   1  0  4  2  3                   3 compares
    //  U     5      A  E  Q  S  U  Y                6   1  0  4  2  5  3                4 compares
    //  E     6      A  E  Q  S  U  Y                6   1  6  4  2  5  3                4 compares
    //  S     7      A  E  Q  S  U  Y                6   1  6  4  7  5  3                4 compares
    //  T     8      A  E  Q  S  T  U  Y             6   1  6  4  7  8  5  3             4 compares
    //  I     9      A  E  I  Q  S  T  U  Y          6   1  6  9  4  7  8  5  3          4 compares
    //  O    10      A  E  I  O  Q  S  T  U  Y       6   1  6  9  10 4  7  8  5  3       4 compares
    //  N    11      A  E  I  N  O  Q  S  T  U  Y    6   1  6  9  11 10 4  7  8  5  3    5 compares
    //               A  E  I  N  O  Q  S  T  U  Y        1  6  9  11 10 4  7  8  5  3
    // Total: 38 compares




    // 3.4.1 Insert the keys E A S Y Q U T I O N in that order into an initially empty
    // table of M = 5 lists, using separate chaining. Use the hash function 11k % M to transform the
    // kth letter of the alphabet into a table index




    // 3.4.10 Insert the keys E A S Y Q U T I O N in that order into an initially empty
    // table of size M = 16 using linear probing. Use the hash function 11k % M to transform the kth
    // letter of the alphabet into a table index. Then redo this exercise for M = 10




    // 3.1.13 Would you use a sequential search ST or a binary search ST for an application
    // that does 10^3put() operations and 10^6get() operations, randomly intermixed? Justify your answer.
    
    // For an application that does 10^3 put() operations and 10^6 get() operations I would use a binary search symbol table implementation.
    // The application does a lot more get() than put() operations and a binary search symbol table implementation has a O(log(n)) runtime complexity for the get() operation, 
    // which is better than the O(n) runtime complexity of the sequential search symbol table implementation.




    // 3.1.14 Would you use a sequential search ST or a binary search ST for an application
    // that does 10^6put() operations and 10^3get() operations, randomly intermixed? Justify your answer.




    // 3.4.4 Design an algorithm to find values of a and M , with M as small as possible,
    // such that the hash function (a * k) % M for transforming the kth letter of the alphabet into
    // a table index produces distinct values (no collisions) for the keys S E A R C H X M P L. The
    // result is known as a perfect hash function.

    // m can the set to the minimum value of 10 (hence the length of the keys is 10).
    // a can be in the range from 1..m
    // k is an arbiterially value for the char




    // 3.4.5 Is the following implementation of getting the hash code of an object legal?
    // If so, describe the effect of using it. If not, explain why.
    // public int hashCode (){ 
    //     return 17; 
    // }
    
    // Yes, the hash code is legal as the hash value of the object will be the same for the first hashed value.
    // The next hashed object will be set to 18 due to linear probing.



    // 3.4.13 Which of the following scenarios leads to expected linear running time for a random search hit in a linear-probing hash table?
    // a) All keys hash to the same index.
    // b) All keys hash to different indices.
    // c) All keys hash to an even-numbered index.
    // d) All keys hash to different even-numbered indices.

    // A is true for linear running time
    // C is also true for lienar running time
    // B will give a constant running time
    // D will also give a constant running time



    // 3.4.15 How many compares could it take, in the worst case, to insert N keys into
    // an initially empty table of size N, using linear probing with array resizing?
    
    // Worst case will be O(n^2) or (n*(n+1)/2) compares, if the N keys will be inserted into the same spot in the array for each N.
    // Therefore, the 4th element will have to be compared to the 1st, 2nd and 3rd elements before it can be put in the 4th place in the array.



    // 3.4.26 Lazy delete for linear probing. Add to LinearProbingHashST a delete()
    // method that deletes a key-value pair by setting the value to null (but not removing the key) and
    // later removing the pair from the table in resize() . Your primary challenge is to decide when
    // to call resize() . Note : You should overwrite the null value if a subsequent put() operation
    // associates a new value with the key. Make sure that your program takes into account the number
    // of such tombstone items, as well as the number of empty positions, in making the decision
    // whether to expand or contract the table.

    // 
    


    // 3.4.6 Suppose that keys are binary integers. For a modular hash function with prime
    // m > 2, prove that any two binary integers that differ in exactly one bit have different hash values.

    // A and B has to differ by a binary integer for m > 2, like A = 101100 and B = 101101.
    // With B being bigger than A by some 2^n difference, then we can modulo by m (some prime being bigger than 2).
    // Hence, we can say that A given by a constant integer x % m should be different than (x + 2^n) % m




    // 3.4.32 Hash attack. Find 2Nstrings, each of length 2N, that have the same hashCode()
    // value, supposing that the hashCode() implementation for String is the following:
    // public int hashCode ()
    // {
    // int hash = 0;
    // for (int i = 0; i < length (); i++)
    // hash = (hash * 37) + charAt(i);
    // return hash;
    // } 
    // Strong hint: ef and fA have the same value.

    // We can simply make a permutation of 2 over 2^n where we can replace "fA" or "ef" for each possible solution.
    // "fA....", "ef....", "fAfA.....", "efef...."



    // 3.4.33 Bad hash function. Consider the following hashCode() implementation for String, which was used in early versions of Java:
    // public int hashCode ()
    // {
    // int hash = 0;
    // int skip = Math.max(1, length ()/8);
    // for (int i=0; i < length (); i+=skip)
    // hash = (hash * 31) + charAt(i);
    // return hash;
    // }
    // Explain why you think the designers chose this implementation and then why you think it
    // was abandoned in favor of the one in the previous exercise.

    // The chosen implementation splits the input string into a size of 8 and skips them when creating the hash value for the string.
    // Therefore, the hashCode function will be rather fast yet can ultimately give the same HashCode for different length strings, if the chars are the same at the looked up place.

    }
}
