import java.util.Scanner;

public class CelsiusToFahr {
    public static void main(String[] args) {
        double celsius, fahrenheit;

        Scanner in = new Scanner(System.in);

        // Prompt the user for a temp in Celsius
        System.out.println("Please enter in a temperature in Celsius: ");

        // Read input from the keyboard
        celsius = in.nextDouble();

        // Calculate the result
        fahrenheit =  celsius * (9.0 / 5.0) + 32.0;

        // Format the output to one decimal place to make it look neat
        System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);
    }   
}