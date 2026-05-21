// Problema 1 - Calculadora de IMC
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Ingrese su peso en kg: ");
        peso = sc.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Su IMC es: " + imc);

        // Bonus
        final double BAJO = 18.5;
        final double NORMAL = 24.9;

        if (imc < BAJO) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc <= NORMAL) {
            System.out.println("Clasificación: Normal");
        } else {
            System.out.println("Clasificación: Sobrepeso");
        }

        sc.close();
    }
}