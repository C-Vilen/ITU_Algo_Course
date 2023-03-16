package Exercises;

public class WeekSeven {
    public static void main(String[] args) {
        // 4.1.1
        // What is the maximum number of edges in an undirected graph with V vertices and no parallel edges? 
        // What is the minimum number of edges in an undirected graph with V vertices, none of which are isolated?

        // The maximum number of edges in a graph with V vertices and no parallel edges is V * (V - 1) / 2.
        // Since we do not have self-loops or parallel edges, each vertex can connect to V - 1 other vertices. 
        // In an undirected graph vertex v connected to vertex w is the same as vertex w connected to vertex v, so we divide the result by 2.
        // Example:
        // o - o
        // | X |
        // o — o
        // The minimum number of edges in a graph with V vertices, none of which are isolated (have degree 0) is V - 1.
        // Example: o — o — o


        // 4.2.1
        // What is the maximum number of edges in a digraph with V vertices and no parallel edges? 
        // What is the minimum number of edges in a digraph with V vertices, none of which are isolated?

        // The maximum number of edges in a digraph with V vertices and no parallel edges is V * (V - 1). 
        // Since we do not have self-loops or parallel edges, each vertex can connect to V - 1 other vertices.
        // Example:
        // o <-> o
        // ^     ^
        // |  X  |
        // v     v
        // o <—> o
        // The minimum number of edges in a digraph with V vertices, none of which are isolated (have degree 0) is V - 1.
        // Example: o -> o -> o


        // 4.1.28
        // Two graphs are isomorphic if there is a way to rename the vertices of one to make it identical to the other. 
        // Draw all the nonisomorphic graphs with two, three and four vertices.
        
        // Two vertices with 2 combinations:
        // o  o
        // o--o

        // Tree vertices with 4 combinations:
        // o  o  o
        // o  o--o
        // o--o--o

        //    o
        //  /   \
        // o - - o

        // Four vertices with 11 combinations:
        // o o o o
        // o-o o o
        // o-o-o o
        // o-o o-o
        // o-o-o-o

        //   o
        //   |
        //   o
        //  / \
        // o   o

        //   o
        //  / \
        // o---o o

        // o-o
        // | |
        // o-o

        //   o
        //   | 
        //   o
        //  / \
        // o---o

        //   o
        //  / \
        // o---o
        //  \ /
        //   o

        //    o
        //   /|\
        //  / o \
        // / / \ \
        // o------o


        // 4.2.8
        // Draw all the nonisomorphic DAGs with two, three and four vertices.

        // Directed acyclic graph on two vertices with 2 combinations:
        // o  o 
        // o->o

        // Directed acyclic graph on three vertices with 6 combinations:
        // o  o  o
        // o->o  o
        // o->o->o
        
        //    o
        //   / \
        //  v   v
        // o     o

        //    o
        //   ^ ^ 
        //  /   \
        // o     o

        //     o
        //    ^ \
        //   /   \
        //  /     v
        // o <- - o

        //     o
        //    ^ ^
        //   /   \
        //  /     \
        // o <- -  o

        // Directed acyclic graph on four vertices with 31 combinations:
        // o  o  o  o
        // o->o  o  o
        // o->o->o  o
        // o->o->o->o
        // etc...


        // 4.1.12
        // What does the BFS tree tell us about the distance from v to w in an undirected graph when neither is at the root?

        // If neither v or w is at the root, Breadth-first search tells us that if they are in the same branch and how long the path between the v and w is.
        // Hence, if they are not in the same branch it will identify how long the path is from the vertice v to vertice w going to the top of the tree.


        // 4.1.14
        // Suppose you use a stack instead of a queue when running breadth-first search. Does it still compute shortest paths?

        // In a tree, the shortest path between two nodes is unique, and it is the path that follows the tree edges from one node to the lowest common ancestor of the two nodes, 
        // and then follows the tree edges from the lowest common ancestor to the other node. Therefore, if we use a stack instead of a queue in BFS, 
        // the algorithm may explore nodes in a different order than the order that guarantees the shortest path.


        // 4.1.16
        // Describe how to find:
        // a) The eccentricity of a vertex (the length of the shortest path from that vertex to the furthest vertex from it)
        
        // Breadth-first search
        
        // b) The diameter of a graph (the maximum eccentricity of any vertex in the graph)
        
        // 
        
        // c) The radius of a graph (the smallest eccentricity of any vertex in the graph)
        
        //
        
        // d) A center of a graph (a vertex whose eccentricity is the radius of the graph)

        //




        // 4.1.21
        // Show a trace of the Bipartite traversal (p. 547) of the graph described by tinyGex2.txt (p. 558). 
        // (If you insist, you can do it as detailed as in the figures in the book, but that takes a lot of time.)
        // Then, describe an alternative implementation that uses BFS instead of DFS. Show a trace of that traversal as well. 
        // Are the resulting colourings the same? Are the running times the same? Are there other differences?

        // 


        // 4.1.32
        // Describe a linear-time algorithm to count the parallel edges in a graph.

        // For each vertex in our graph, check the edge pointer exists in our hashmap count +1, else add it to our hashmap.
        // Then divide the count by 2 as each vertex will have the same points to ints neighbors.


        // 4.1.36
        // A bridge in a graph is an edge that, if removed, would separate a connected graph into two disjoint subgraphs. 
        // A graph that has no bridges is said to be edge connected.
        // Design and describe two algorithms for determining whether a given graph is edge connected, 
        // one using a DFS-based data type and one using a BFS-based data type. Both should run in O(E ·(V +E)).

        // 
    }
}