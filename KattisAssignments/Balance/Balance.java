package KattisAssignments.Balance;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Balance {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        int outputInt = 1;
        String inputStr = StdIn.readString();
        // Adds the item to this stack with the opening tags
        for (int i = 0; i < inputStr.length(); i++) {
            Character inputChar = inputStr.charAt(i);
            if (inputChar == '(' | inputChar ==  '[' | inputChar ==  '{' ) {
                stack.push(inputChar);
            } 

            // Removes and returns the item most recently added if it matches the counterpart
            if (inputChar == ')' | inputChar ==  ']' | inputChar ==  '}') {
                if(stack.isEmpty()) {
                    outputInt = 0;
                    break;
                } else if (stack.peek() == '(' && inputChar == ')') {
                    stack.pop();
                } else if (stack.peek() == '[' && inputChar == ']'){
                    stack.pop();
                } else if(stack.peek() == '{' && inputChar == '}'){
                    stack.pop();
                }
            }
        }

        // Determines if the stack is balanced or not
        if (!stack.isEmpty()) outputInt = 0;
        StdOut.print(outputInt);
    }
}
