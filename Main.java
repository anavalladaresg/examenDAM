import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce a temperatura en graos centígrados: ");
        double graosCentigrados = scanner.nextDouble();

        double graosFahrenheit = (graosCentigrados * 9/5) + 32;
        double graosKelvin = graosCentigrados + 273.15;

        System.out.println("Temperatura en graos Fahrenheit: " + graosFahrenheit
                + " °F \nTemperatura en graos Kelvin: " + graosKelvin + " K");
    }
}