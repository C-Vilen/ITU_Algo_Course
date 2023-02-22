package KattisAssignments.Grades;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Merge;

public class Grades implements Comparable<Grades> {

    String studentName;
    int studentScale;

    Grades(String studentName, String studentGrade) {
        this.studentName = studentName;
        for (int i = 0; i < studentGrade.length(); i++) {
            if (studentGrade.charAt(i) == 'A') { this.studentScale = 350;}
            if (studentGrade.charAt(i) == 'B') { this.studentScale = 300;}
            if (studentGrade.charAt(i) == 'C') { this.studentScale = 250;}
            if (studentGrade.charAt(i) == 'D') { this.studentScale = 200;}
            if (studentGrade.charAt(i) == 'E') { this.studentScale = 150;}
            if (studentGrade.charAt(i) == 'X') { this.studentScale = 100;}
            if (studentGrade.charAt(i) == 'F') { this.studentScale = 50;}
            if (studentGrade.charAt(i) == '+') { this.studentScale++;}
            if (studentGrade.charAt(i) == '-') { this.studentScale--;}
        }
    }

    public int compareTo(Grades studentCompare) {
        if (this.studentScale < studentCompare.studentScale) return +1;
        if (this.studentScale > studentCompare.studentScale) return -1;
        return this.studentName.compareTo(studentCompare.studentName);
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        Grades[] SG = new Grades[N];

        // Collect data into Grades student class
        for (int i = 0; i < N; ++i) {
            String name = StdIn.readString();
            String gradeString = StdIn.readString();
            SG[i] = new Grades(name, gradeString);
        }

        // Sort
        Merge.sort(SG);
	    // Insertion.sort(SG);	
        // Selection.sort(SG);

        // Output name order by grade
        for (int j = 0; j < N; ++j) {
            StdOut.println(SG[j].studentName.toString());
        }
    }
}
