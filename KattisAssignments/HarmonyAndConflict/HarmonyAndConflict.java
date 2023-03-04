package KattisAssignments.HarmonyAndConflict;

import edu.princeton.cs.algs4.BipartiteX;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class HarmonyAndConflict {
    public static void main(String[] args) {
        int NVertices = StdIn.readInt();
        int MEdges = StdIn.readInt();
        Graph algsGraph = new Graph(NVertices+MEdges);

        // Drawing the graph with undirected edge v-w to this graph.      
        for (int i = 0; i < MEdges; i++) {
            int endpointsU = StdIn.readInt();
            int endpointsV = StdIn.readInt();
            int conflictEdge = StdIn.readInt();

            // Combine endpoint U and V if they are conflicting otherwise between a bridging edpoint
            if (conflictEdge == 1) {
                algsGraph.addEdge(endpointsU, endpointsV);
            } 
            else {
                algsGraph.addEdge(endpointsV, NVertices);
                algsGraph.addEdge(endpointsU, NVertices);
                NVertices += 1;
            }
        }

        // Check if the graph is bipartite and can be harmoniously 2-coloured.
        BipartiteX algsBipartiteX = new BipartiteX(algsGraph);
        if (algsBipartiteX.isBipartite()) {
            StdOut.print(1);
        } else {
            StdOut.print(0);
        }
    }
}