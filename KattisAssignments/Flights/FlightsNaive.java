package KattisAssignments.Flights;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FlightsNaive {
    static Map<Integer, String> flightPlan = new TreeMap<>();

    public static void main(String[] args) {
        int NFlights = StdIn.readInt();
        int MOperations = StdIn.readInt();
        
        // Creates the flightPlan
        for (int i = 0; i < NFlights; i++) {
            String strTime = StdIn.readString();
            int time = Integer.parseInt(strTime.replace(":", ""));
            String destination = StdIn.readString();
            flightPlan.put(time, destination);
        }
    
        // Responding with output data based on operations
        for (int i = 0; i < MOperations; i++) {
            String operation = StdIn.readString();
            switch (operation) {
                case "cancel":
                    String cancel = StdIn.readString();
                    Cancellation(cancel);
                    break;
                case "delay":
                    String delay = StdIn.readString();
                    String delay2 = StdIn.readString();
                    Delay(delay, delay2);
                    break;
                case "reroute":
                    String reroute = StdIn.readString();
                    String reroute2 = StdIn.readString();
                    Rerouting(reroute, reroute2);   
                    break;
                case "destination":
                    String atDest = StdIn.readString();
                    AtDestination(atDest);
                    break;
                case "next":
                    String Next = StdIn.readString();
                    nextDeparture(Next);
                    break;
                case "count":
                    String countFli = StdIn.readString();
                    String countFli2 = StdIn.readString();
                    CountFlights(countFli, countFli2);
                    break;
                default:
                    break;
            }
        }
    }

    // Cancels the flight scheduled at the time S
    public static void Cancellation(String strTime) {
        int time = Integer.parseInt(strTime.replace(":", ""));
        if (flightPlan.containsKey(time)) {
            flightPlan.remove(time);
        }
    }

    // Delays the flight scheduled for time strTime by D seconds
    public static void Delay(String strTime, String D) {
        int delaySeconds = Integer.parseInt(D);
        int hours = Integer.parseInt(strTime.substring(0, 2));
        int minutes = Integer.parseInt(strTime.substring(3, 5));
        int seconds = Integer.parseInt(strTime.substring(6, 8));
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        int newTotalSeconds = totalSeconds + delaySeconds;
        int newHours = newTotalSeconds / 3600;
        int newMinutes = (newTotalSeconds % 3600) / 60;
        int newSeconds = newTotalSeconds % 60;
        String newStrTime = String.format("%02d:%02d:%02d", newHours, newMinutes, newSeconds);
        int time = Integer.parseInt(strTime.replace(":", ""));
        if (flightPlan.containsKey(time)) {
            String destination = flightPlan.get(time);
            flightPlan.remove(time);
            flightPlan.put(Integer.parseInt(newStrTime.replace(":", "")), destination);
        }
    }
    

    // Reroutes the flight scheduled for time S to the destination newDestination
    public static void Rerouting(String strTime, String newDestination) {
        int time = Integer.parseInt(strTime.replace(":", ""));
        if (flightPlan.containsKey(time)) {
            String currentDestination = flightPlan.get(time);
            flightPlan.replace(time, currentDestination, newDestination);
        }
    }

    // Checks if a flight is planned for a time T and returns the destination at time T
    public static void AtDestination(String strTime) {
        int time = Integer.parseInt(strTime.replace(":", ""));
        if (flightPlan.containsKey(time)) {
            StdOut.println(flightPlan.get(time));
        } else {
            StdOut.println("-");
        }
    }

    // Returns the next departure S with the destination that is bigger or equal to currentTime.
    public static void nextDeparture(String strTime) {
        int time = Integer.parseInt(strTime.replace(":", ""));
        for (Entry<Integer, String> flight : flightPlan.entrySet()) {
            if(time <= flight.getKey()) {
                String outputTime = flight.getKey().toString();
                if (outputTime.length() == 5) outputTime = "0" + outputTime;
                String formattedOutputTime = outputTime.substring(0,2) + ":" + outputTime.substring(2,4) + ":" + outputTime.substring(4,6);
                StdOut.println(formattedOutputTime + " " + flight.getValue());
                break;
            }
        }    
    }

    // returns the number of flights scheduled between two timeslot.
    public static void CountFlights(String strTime1, String strTime2) {
        int time1 = Integer.parseInt(strTime1.replace(":", ""));
        int time2 = Integer.parseInt(strTime2.replace(":", ""));
        int counter = 0;
        for (Entry<Integer, String> flight : flightPlan.entrySet()) {
            if(time1 <= flight.getKey() && flight.getKey() <= time2) {
                counter += 1;
            }
        }
        StdOut.println(counter);
    }
}