public class TravelCalculator {
    public static void main(String[] args) {
        // Segment 1: Chennai to Vellore
        double dist1 = 156.6;
        int hours1 = 4;
        int mins1 = 4;

        // Segment 2: Vellore to Bangalore
        double dist2 = 211.8;
        int hours2 = 4;
        int mins2 = 25;

        // Calculate Total Distance
        double totalDistance = dist1 + dist2;

        // Calculate Total Time
        int totalHours = hours1 + hours2;
        int totalMins = mins1 + mins2;

        // Adjust minutes if they exceed 59
        if (totalMins >= 60) {
            totalHours += totalMins / 60;
            totalMins = totalMins % 60;
        }

        // Output Results
        System.out.println("--- Travel Summary: Chennai to Bangalore ---");
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Time: " + totalHours + " Hours and " + totalMins + " Mins");
    }
}