import edu.princeton.cs.algs4.Merge;

public class test {
    int  n; 
    int  m; 
    Edge[] edges; 

    class  Edge implements  Comparable<Edge> { 
        int  start; 
        int  end; 
        
        public  Edge(int  start,  int  end) { 
            this.start=  start; 
            this.end= end; 
        } 
 
        public  int  compareTo(Edge that)  { 
            return  this.start  - that.start; 
        } 
    } 

    test(int  num_nodes) { 
        this.n  =  num_nodes; 
        this.edges=  new Edge[0]; 
        this.m  =  0; 
    } 
 
 
    boolean  has_edge(int  start,  int  end) { 
        for  (Edge e: this.edges) 
            if  (e.start  == start  && e.end  == end) return  true; 
    return false; 
    } 

 
    void  add_edge(int  start,  int  end) { 
        Edge[] new_edges =  new Edge[this.m  +  1]; 
        for  (int i= 0; i <  this.m;  ++i) 
            new_edges[i] =  edges[i]; 
        new_edges[m] =  new Edge(start,  end); 
        Merge.sort(new_edges); 
        this.edges=  new_edges; 
        this.m  += 1; 
    }

    void pprint_test(){
        System.out.println("n: " + this.n);
        System.out.println("m: " + this.m);
        for (int i = 0; i < edges.length; i++) {
            System.out.println("["+i+"] position ->start: " + edges[i].start + " end: " + edges[i].end);
        }
        System.out.println("--------------------");
    }

    int outdegree(int vertex){
        int count = 0;
        for (int i = 0; i < edges.length; i++) {
            if(edges[i].start == vertex){
                count++;
            }
        }
        return count;
    
    }

    public static void main(String[] args) {
        test t = new test(10);
        t.add_edge(0, 1);
        t.add_edge(1, 4);
        t.add_edge(4, 0);
        t.add_edge(1, 2);
        t.pprint_test();
        System.out.println(t.has_edge(1, 4));
        System.out.println(t.has_edge(0, 4));
        System.out.println(t.has_edge(4,1));
    }
}