// Problema 2 - Conversor de temperatura
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Ingrese temperatura en Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

        // Si usamos 9/5 sin decimales,
        // Java hace división entera y el resultado es 1.
        // Por eso se usa 9.0/5.0

        sc.close();
    }
}