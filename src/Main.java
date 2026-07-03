import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random generator = new Random();
        int[] dailyReadings = new int[30];
        int monthlyTotal = 0;
        int numberOfWetDays = 0;
        int position = 0;

        System.out.println("TINA VERSION - NARO SENSOR READINGS");
        System.out.println("Rainfall readings for Namulonge farm");
        System.out.println();

        while (position < dailyReadings.length) {
            int reading = generator.nextInt(61);
            dailyReadings[position] = reading;
            monthlyTotal = monthlyTotal + reading;

            if (reading > 30) {
                numberOfWetDays = numberOfWetDays + 1;
            }

            System.out.println("Reading for day " + (position + 1) + " is " + reading + " mm");
            position = position + 1;
        }

        double monthlyAverage = monthlyTotal / 30.0;
        String result;

        if (monthlyTotal <= 300) {
            result = "Dry";
        } else if (monthlyTotal >= 600) {
            result = "Flood-risk";
        } else {
            result = "Normal";
        }

        System.out.println();
        System.out.println("Monthly total = " + monthlyTotal + " mm");
        System.out.println("Monthly average = " + monthlyAverage + " mm");
        System.out.println("Number of wet days = " + numberOfWetDays);
        System.out.println("Rainfall category = " + result);
    }
}
