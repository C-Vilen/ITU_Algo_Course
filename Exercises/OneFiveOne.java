package Exercises;

public class OneFiveOne {

    private static void printArray(int[] id){
        System.out.print("Indices:  ");
        for (int i = 0; i < id.length; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nElements: ");
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println("\n");
    }



    public static void main(String[] args) {
        int[] id = {0,1,2,3,4,5,6,7,8,9};
        printArray(id);

        id[9] = id[0];
        printArray(id);

        id[3] = id[4];
        printArray(id);

        id[5] = id[8];
        printArray(id);

        id[7] = id[2];
        printArray(id);

        id[2] = id[1];
        printArray(id);

        id[5] = id[7];
        printArray(id);

        id[0] = id[3];
        printArray(id);
        System.out.println("The above is not correct as it does not check for the parent to change its value too" 
        +"\n" + 
        "This is the correct for the union of the pairs");

        System.out.println(
            "10 ele: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] \n"+
            "9  0:  9[0, 1, 2, 3, 4, 5, 6, 7, 8, 0] -> 10 array lookups + 2 finds + 1 changes \n"+
            "3  4:  8[0, 1, 2, 4, 4, 5, 6, 7, 8, 0] -> 3  array lookups + 2 finds + 1 changes\n"+
            "5  8:  7[0, 1, 2, 4, 4, 8, 6, 7, 8, 0] -> 6  array lookups + 2 finds + 1 changes\n"+
            "7  2:  6[0, 1, 2, 4, 4, 8, 6, 2, 8, 0] -> 8  array lookups + 2 finds + 1 changes\n"+
            "2  1:  5[0, 1, 1, 4, 4, 8, 6, 1, 8, 0] -> 8  array lookups + 2 finds + 2 changes\n"+
            "5  7:  4[0, 1, 1, 4, 4, 1, 6, 1, 1, 0] -> 9  array lookups + 2 finds + 2 changes\n"+
            "0  3:  3[4, 1, 1, 4, 4, 1, 6, 1, 1, 4] -> 10 array lookups + 2 finds + 2 changes\n"+
            "4  2:  2[1, 1, 1, 1, 1, 1, 6, 1, 1, 1] -> 10 array lookups + 2 finds + 4 changes"
        );
    }
}
