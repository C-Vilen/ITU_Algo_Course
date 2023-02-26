package KattisAssignments.SeatAllocations;

import edu.princeton.cs.algs4.MaxPQ;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class SeatAllocation implements Comparable<SeatAllocation> {
    int partyVotes;
    int partySeats;
    double partyQuotient;

    SeatAllocation(int partyVotes) {
        this.partyVotes = partyVotes;
        this.partySeats = 0;
        this.partyQuotient = partyVotes;
    }

    // Compares the quotient to other instances
    public int compareTo(SeatAllocation otherAllocation) {
        return Double.valueOf(this.partyQuotient).compareTo(Double.valueOf(otherAllocation.partyQuotient));
    }

    // Retrives the seats for the respective party
    public int viewPartySeat(){
        return partySeats;
    }

    // Setting the seats to the respective party and recalculate the quotient formula
    public void setPartySeat(int amountOfSeats){
        this.partySeats += amountOfSeats;
        this.partyQuotient = partyVotes / (partySeats + 1.0);
    }

    public static void main(String[] args) {
        int NParties = StdIn.readInt();
        int MSeats = StdIn.readInt();

        // Creating an instance for each party
        SeatAllocation[] NumOfPartyMembers = new SeatAllocation[NParties];
        for (int i = 0; i < NParties; i++) {
            NumOfPartyMembers[i] = new SeatAllocation(StdIn.readInt());
        }
        MaxPQ<Object> MPG = new MaxPQ<>(NumOfPartyMembers);

        // Allocating the seats to each party
        while (MSeats > 0) {
            SeatAllocation instance = (SeatAllocation) MPG.delMax();
            instance.setPartySeat(1);
            MPG.insert(instance);
            MSeats--;
        }

        // Printing the allocated seats of each party
        for (int i = 0; i < NumOfPartyMembers.length; i++) {
            StdOut.println(NumOfPartyMembers[i].viewPartySeat());
        }
    }
}