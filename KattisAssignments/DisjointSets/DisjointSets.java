package KattisAssignments.DisjointSets;

import edu.princeton.cs.algs4.UF;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class DisjointSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Reads the amount of singletons & following amount of lines & initiates UnionFind class 
            int n = sc.nextInt();
            int m = sc.nextInt();
            UF UnionFind = new UF(n);
            for (int i = 0; i < m; i++) {
                
                // Reads the input operation
                int operation = sc.nextInt();
                // Reads the node of p
                int p = sc.nextInt();
                // Reads the node of q
                int q = sc.nextInt();

                // Executing the query command by checking if p & q is connected
                if (operation == 0) {
                    boolean ConnectedQuery = UnionFind.find(p) == UnionFind.find(q);
                    if (ConnectedQuery) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                } 
                
                // Executing the union command by connecting p & q
                if (operation == 1) {
                    UnionFind.union(p, q);
                }

                // Executing the move command by moving the p into the q set
                if (operation == 2) {
                    boolean ConnectedQuery = UnionFind.find(p) == UnionFind.find(q);
                    if (ConnectedQuery) {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            sc.close();
        }
    }
}
