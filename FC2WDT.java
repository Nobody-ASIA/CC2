public class FC2WDT {
    public static void main(String[] args) {
        String[] cities = {"Manila", "Baguio", "Quezon"};
        int days = 7;
        double[][] temperatures = {
            {32.5, 33.0, 34.1, 32.2, 31.8, 33.5, 34.0}, // Manila temperatures
            {20.1, 19.8, 21.0, 22.5, 20.2, 19.5, 21.2}, // Baguio temperatures
            {30.2, 31.5, 29.8, 30.1, 32.0, 31.7, 30.9}  // Quezon temperatures
        };

        // Arrays to store results
        double[] averageTemperatures = new double[cities.length];
        double[] highestTemperatures = new double[cities.length];

        // Process each city's temperature data
        for (int i = 0; i < cities.length; i++) {
            double total = 0;
            double highest = temperatures[i][0];

            // Loop through each day's temperature for the current city
            for (int j = 0; j < days; j++) {
                total += temperatures[i][j];
                if (temperatures[i][j] > highest) {
                    highest = temperatures[i][j];
                }
            }

            // Calculate average temperature and record the highest temperature
            averageTemperatures[i] = total / days;
            highestTemperatures[i] = highest;
        }

        // Display results
        System.out.println("Temperature Data Analysis:");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("City: %s%n", cities[i]);
            System.out.printf("  Average Temperature: %.2f°C%n", averageTemperatures[i]);
            System.out.printf("  Highest Temperature: %.2f°C%n", highestTemperatures[i]);
        }
    }
}