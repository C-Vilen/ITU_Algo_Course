package Exercises;

public class OneFiveTwo {
    
    // Give p and q the same root
    public void union(int p, int q) { 
    int pRoot = find(p);
    int qRoot = find(q);
    if (pRoot == qRoot) return;
    id[pRoot] = qRoot;
    count--;
    }




    public static void main(String[] args) {
        
    }
}
