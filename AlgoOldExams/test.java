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

    public static void main(String[] args) {
        test t = new test();
        t.insert(6);
        t.insert(-2);
        t.insert(4);
        t.insert(-3);
        System.out.print(t.getNextPositive());
        System.out.print(", ");
        System.out.print(t.getNextPositive());
    }
}

