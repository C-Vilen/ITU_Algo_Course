package Exercises;

public class OneFiveNine {
    public static void main(String[] args) {
        System.out.println(
            "It cannot be a weighted quick-union since the branch of 5-9-8 as the 5 should have gone under the node of 9"+
            "This is due to the weighted logic says the smaller amount "+
            "It will also always have the maximum deept of log2(n) for all subtrees"+
            "Considering the subtree 1-6-5-9-4-8 has a steps of 4 and log2(6) gives less than 4"
        );
    }
}
