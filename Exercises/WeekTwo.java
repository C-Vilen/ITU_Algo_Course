package Exercises;

public class WeekTwo {

    public static boolean circularCheck(String x, String y) {
        String reversedX = "";
        for (int i = 0; i < x.length(); i++) {
            reversedX = x.charAt(i) + reversedX;
        }
        return reversedX.equals(y);
    }

    public static void main(String[] args) {

        /*
         * 1.2.6
         * A string s is a circular rotation of a string t if it matches when the
         * characters
         * are circularly shifted by any number of positions; e.g., ACTGACG is a
         * circular shift of TGACGAC,
         * and vice versa. Detecting this condition is important in the study of genomic
         * sequences.
         * Desig an algorithm that checks whether two given strings s and t are circular
         * shifts of one another.
         */
        System.out.println("Exercise 1.2.6");
        String str1 = "abc";
        String str2 = "def";
        System.out.println(
                "Are string str1 and str2 equal to eachother: " + circularCheck(str1, str2) + " Expected to be false.");

        String str3 = "abc";
        String str4 = "cba";
        System.out.println(
                "Are string str3 and str4 equal to eachother: " + circularCheck(str3, str4) + " Expected to be true.");

        /*
         * 1.3.7
         * Describe how you could create a method/function peek() to Stack that returns
         * the most recently inserted item on the stack (without popping it).
         * 
         * We could call the array on x.length() and return the respective item at that
         * index. This is without having the method already.
         */

        /*
         * 1.3.19
         * Explain how you would create a method/function removeLast(), that removes
         * the last node in a linked list whose first node is stored in the variable
         * first. Making a drawing of what is going on is encouraged.
         * 
         * In the function removeLast() we should first check if the linkedlist is empty.
         * If this is NOT the case, we should set the first node to null.
         * And we could iterate through the list until we find the last node at set it to null
         */

         /* 
          * 1.3.20
          * Explain and draw how one could design a method/function delete() that
          * takes an int argument k and deletes the k'th element in a linked list, if it exists.
          * 
          * 
          */
    }
}
