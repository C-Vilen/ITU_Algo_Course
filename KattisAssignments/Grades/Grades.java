package KattisAssignments.Grades;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.HashMap;
import edu.princeton.cs.algs4.Insertion;


public class Grades {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        HashMap<String, String> hMap = new HashMap<String, String>();
        // Collect data into hMap
        for (int i = 0; i < N; i++) {
            String name = StdIn.readString();
            String gradeString = StdIn.readString();
            hMap.put(name, gradeString);
        }

        // Sort
        Insertion.sort(args, null);

        // Output name order by grade
        for (String KeyName : hMap.keySet()) {
            StdOut.println(KeyName);
        }
    }
}
