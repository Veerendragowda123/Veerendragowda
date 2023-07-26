import java.util.Scanner;

public class WeatherAPIProgram {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        WeatherAPI weatherAPI = new WeatherAPI();

        while (true) {
            System.out.println("\n1. Get weather\n2. Get Wind Speed\n3. Get Pressure\n0. Exit");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter the date (YYYY-MM-DD): ");
                    String date1 = scanner.nextLine();
                    double temperature = weatherAPI.getWeather(date1);
                    System.out.println("The temperature on " + date1 + " was " + temperature + " °C");
                    break;

                case 2:
                    System.out.print("Enter the date (YYYY-MM-DD): ");
                    String date2 = scanner.nextLine();
                    double windSpeed = weatherAPI.getWindSpeed(date2);
                    System.out.println("The wind speed on " + date2 + " was " + windSpeed + " km/h");
                    break;

                case 3:
                    System.out.print("Enter the date (YYYY-MM-DD): ");
                    String date3 = scanner.nextLine();
                    double pressure = weatherAPI.getPressure(date3);
                    System.out.println("The pressure on " + date3 + " was " + pressure + " mb");
                    break;

                case 0:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }
    }
}

class WeatherAPI {
    public double getWeather(String date) {
        // Use the weather API to get temperature based on the input date
        return 0.0; // Replace with actual implementation
    }

    public double getWindSpeed(String date) {
        // Use the weather API to get wind speed based on the input date
        return 0.0; // Replace with actual implementation
    }

    public double getPressure(String date) {
        // Use the weather API to get pressure based on the input date
        return 0.0; // Replace with actual implementation
    }
}