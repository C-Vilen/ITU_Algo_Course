package AlgoOldExams;

public class test {

    class Node {
        int val;
        Node next;
    }
    
    Node first;
    Node cur;


    public void insert(int val){
        Node n = new Node();
        n.val = val;
        n.next = first;
        first = n;
        cur = n;
        advance();
    }

    private void advance(){
        while (cur != null && cur.val <= 0) cur = cur.next;
    }

    public int getNextPositive(){
        if (cur == null) throw new RuntimeException("No positive numbers");

        int val = cur.val;
        cur = cur.next;
        advance();
        return val;
    }

    public void pprint(){
        Node n = first;
        while (n != null){
            System.out.print(n.val + " ");
            System.out.println("cur: " + cur.val);
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(5/2);
    }
}

