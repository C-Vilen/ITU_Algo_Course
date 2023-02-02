package Exercises;

public class OneFiveTwo {
    
    // // Give p and q the same root
    // public void union(int p, int q) { 
    // int pRoot = find(p);
    // int qRoot = find(q);
    // if (pRoot == qRoot) return;
    // id[pRoot] = qRoot;
    // count--;
    // }

    public static void main(String[] args) {
        System.out.println(
            " Quick union (looking at the root structure \n"+
            "10 ele: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] \n"+
            "9  0:  9[0, 1, 2, 3, 4, 5, 6, 7, 8, 0] -> 10 array lookups + 2 finds + 1 changes \n"+
            "3  4:  8[0, 1, 2, 4, 4, 5, 6, 7, 8, 0] -> 3  array lookups + 2 finds + 1 changes\n"+
            "5  8:  7[0, 1, 2, 4, 4, 8, 6, 7, 8, 0] -> 6  array lookups + 2 finds + 1 changes\n"+
            "7  2:  6[0, 1, 2, 4, 4, 8, 6, 2, 8, 0] -> 8  array lookups + 2 finds + 1 changes\n"+
            "2  1:  5[0, 1, 1, 4, 4, 8, 6, 2, 8, 0] -> 8  array lookups + 2 finds + 2 changes\n"+
            "5  7:  4[0, 1, 1, 4, 4, 8, 6, 2, 1, 0] -> 9  array lookups + 2 finds + 2 changes\n"+
            "0  3:  3[4, 1, 1, 4, 4, 8, 6, 2, 1, 0] -> 10 array lookups + 2 finds + 2 changes\n"+
            "4  2:  2[4, 1, 1, 4, 1, 8, 6, 2, 1, 0] -> 3  array lookups + 1 finds + 1 changes"
        );
    }
}
