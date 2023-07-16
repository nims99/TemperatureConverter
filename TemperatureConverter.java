import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;

        System.out.print("Enter the temperature in Celsius: ");
        temperature = scanner.nextDouble();

        double convertedToFahrenheit = celsiusToFahrenheit(temperature);
        System.out.println("Temperature in Fahrenheit: " + convertedToFahrenheit);

        System.out.print("Enter the temperature in Fahrenheit: ");
        temperature = scanner.nextDouble();

        double convertedToCelsius = fahrenheitToCelsius(temperature);
        System.out.println("Temperature in Celsius: " + convertedToCelsius);

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
