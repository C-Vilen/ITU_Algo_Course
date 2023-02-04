package KattisAssignments.DisjointSets;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class DisjointSets {
    private int[] parent;  // parent[i] = parent of i
    private byte[] rank;   // rank[i] = rank of subtree rooted at i (never more than 31)
    private int count;     // number of components

    public DisjointSets(int n) {
        if (n < 0) throw new IllegalArgumentException();
        count = n;
        parent = new int[n];
        rank = new byte[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int count() {
        return count;
    }

    public int find(int p) {
        validate(p);
        while (p != parent[p]) {
            parent[p] = parent[parent[p]];    // path compression by halving
            p = parent[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;

        // make root of smaller rank point to root of larger rank
        if      (rank[rootP] < rank[rootQ]) parent[rootP] = rootQ;
        else if (rank[rootP] > rank[rootQ]) parent[rootQ] = rootP;
        else {
            parent[rootQ] = rootP;
            rank[rootP]++;
        }
        count--;
    }

    // validate that p is a valid index
    private void validate(int p) {
        int n = parent.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }

    public void move(int p, int q) {
        // Variables for root of p & q
        int rootP = find(p);
        int rootQ = find(q);
        
        // Check for p & q not being the same set
        if (rootP == rootQ) { 
            return;
        } else {
            // Moving p into Q and removing it afterwards P  
            parent[rootP] = rootQ;
            rank[rootQ] += rank[rootP];
            parent[p] = p;
            rank[p] = 0;
        }
    }
    

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            // Reads the amount of components & following amount of lines & initiates UnionFind class 
            int n = StdIn.readInt();
            int m = StdIn.readInt();
            DisjointSets UnionFind = new DisjointSets(n);

            for (int i = 0; i < m; i++) {
                
                // Reads the input operation
                int operation = StdIn.readInt();
                // Reads the node of p
                int p = StdIn.readInt();
                // Reads the node of q
                int q = StdIn.readInt(); 

                // Executing the query command by checking if p & q is connected
                if (operation == 0) {
                    if (UnionFind.connected(p, q)) {
                        StdOut.println(1);
                    } else {
                        StdOut.println(0);
                    }
                } 
                
                // Executing the union command by connecting p & q
                if (operation == 1) UnionFind.union(p, q);

                // Executing the move command by moving the p into the q set
                if (operation == 2) {
                    UnionFind.move(p, q);
                }
            }
        }
    }
}
