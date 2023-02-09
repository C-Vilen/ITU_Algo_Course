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
        System.out.println((str1.length() == str2.length() && (str2+str2).contains(str1)));

        String str3 = "abc";
        String str4 = "cba";
        System.out.println(
                "Are string str3 and str4 equal to eachother: " + circularCheck(str3, str4) + " Expected to be true.");
        System.out.println((str3.length() == str4.length() && (str4+str4).contains(str3)));

        /*
         * 1.3.7
         * Describe how you could create a method/function peek() to Stack that returns
         * the most recently inserted item on the stack (without popping it).
         * 
         * We could call the array on N-1 and return the respective item at that
         * index.
         */

        /*
         * 1.3.19
         * Explain how you would create a method/function removeLast(), that removes
         * the last node in a linked list whose first node is stored in the variable
         * first. Making a drawing of what is going on is encouraged.
         * 
         * In the function removeLast() we should first check if the linkedlist is
         * empty.
         * If this is NOT the case, we should set the first node to null.
         * And we could iterate through the list until we find the last node by b.next.next == null 
         * until it is true and set n.next = null.
         */

        /*
         * 1.3.20
         * Explain and draw how one could design a method/function delete() that
         * takes an int argument k and deletes the k'th element in a linked list, if it
         * exists.
         * 
         * remove(int k) {
         *  int i = 0;
         *  node n = first;
         *      while(i < k-1) {
         *          i++
         *          n=n.next
         *  } 
         *  n.next = n.next.next;
         * }
         */

        /*
         * 1.3.21
         * Explain how one could desing a method find() that takes a linked list and a
         * string key as arguments and returns true if some node in the list has key as
         * its item field, false otherwise.
         * 
         * find(LinkedList<String> linkedList, String key) {
         *      for (String item : linkedList) {
         *          if (item.equals(key)) {
         *              return true;
         *          }
         *      }
         *      return false;
         * }
         */

        /*
         * 1.3.22
         * Suppose that x is a linked list Node. What does the following code fragment
         * do? (This question is also in the quiz, but necessary for the question
         * below).
         * t.next = x.next; x.next = t;
         * 
         * Inserts t after x if t was not a part of the linked list. 
         */

        /*
         * 1.3.23
         * Why does the following code fragment not do the same thing as in
         * the previous question?
         * x.next = t; t.next = x.next;
         * 
         * This will remove the elements after t as it would come in after x and point to t itself after.
         */

        /*
         * 1.3.27
         * Suppose that you get a reference for the first node in a linked list.
         * Describe
         * how you can find and output the maximum key in the list. Assume that all keys
         * are positive
         * integers, and return 0 if the list is empty.
         * 
         * int max = 0;
         * node n = l.first;
         * while (l.next != null) {
         *  if(n.item > t) t = n.item
         * 
         *  n = n.next;
         * }
         * return max;
         */

        /*
         * 1.3.24
         * Explain how you would design a method/function removeAfter() that takes
         * a linked-list Node as argument and removes the node following the given one
         * (and does nothing if the argument or the next field in the argument node is null).
         * 
         * if (n!= null && n.next != null){
         *   n.next = n.next.next
         * }
         */
        
        

        /*
         * 1.3.25
         * Explain how you would design a method/function insertAfter() that takes
         * two linked-list nodes (n1 and n2) as arguments. Assume that n1 is in a list,
         * and insert n2 immediately after n1. Do nothing if either argument is null.
         * insertAfter(n1, n2) {
         *      n2.next = n1.next
         *      n1.next = n2
         * }
         */

        /*
         * 1.3.28
         * Develop a recursive solution to the previous question (1.3.27).
         * 
         * max(n)
         * if (n = null) return 0;
         * if (n.item > max(n.next)) return.item
         * else return max(n.next)
         */

        /*
         * 1.3.31
         * A doubly-linked list is a linked list, where each node contains a reference
         * to the
         * previous node in the list in addition to the reference to the next node. We
         * define the nodes of
         * this list to be of the class DoubleNode. Explain how the class DoubleNode
         * differs from a regular
         * Node class in a linked list, and make a drawing of a doubly-linked list data
         * structure.
         * Next, describe how the following methods/functions work in a doubly-linked
         * list: Insert at
         * the beginning, insert at the end, remove from the beginning, remove from the
         * end, insert before
         * a given node, insert after a given node, and remove a given node.
         * 
         * InsertAtBeginning (node n) {
         *  first.previous = n;
         *  n.next = first;
         *  first = n;
         * }
         * 
         * InsertAtEnd(node n) {
         *  last.next = n;
         *  n.previous = last;
         *  last = n;
         * }
         * 
         * RemoveFromBeginning() {
         *  first = first.next;
         *  first.previous = null;
         * }
         * 
         * RemoveFromEnd() {
         *  last = last.previous;
         *  last.next = null;
         * }
         * 
         * InsertBeforeNode(node n1, node n2){
         *  n2.next = n1;
         *  n2.previous = n1.previous;
         *  n1.previous = n2;
         *  n2.previous.next = n2;
         * }
         * 
         * InsertAfterNode(node n1, node n2){
         *  n2.previous = n1;
         *  n2.next = n1.next;
         *  n2.next.previous = n2;
         *  n1.next = n2;
         * }
         * 
         * RemoveNode(node n) {
         *  n.next.previous = n.previous;
         *  n.previous.next ) n.next;
         * }
         */

        /*
         * 1.3.48
         * A double-ended queue or deque (pronounced “deck”) is like a stack or a queue
         * but supports adding and removing items at both ends, so where a regular stack has a push()
         * function, a deque has both pushLeft() and pushRight() functions and similarly a deque has
         * popLeft() and popRight() functions instead of just a pop() function.
         * How can two stacks be implemented using a single deque so that each operation
         * takes a constant number of deque operations?
         * 
         * We could utilise a variable integer for each of the sides in which will be incremented when an item has been added to the respective side of the deque.
         * Accordingly, the pop operation for each side should not be able to be executed if the variable is 0. 
         */
    }
}
