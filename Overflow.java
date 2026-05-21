// Problema 3 - Detector de overflow
public class Overflow {
    public static void main(String[] args) {

        int numero = Integer.MAX_VALUE;

        System.out.println("Valor máximo int: " + numero);

        numero = numero + 1;

        System.out.println("Resultado al sumar 1: " + numero);

        // Ahora usando long
        long numeroLong = (long) Integer.MAX_VALUE;

        numeroLong = numeroLong + 1;

        System.out.println("Usando long: " + numeroLong);

        /*
         El primer resultado da un número raro porque ocurre overflow.
         El tipo int tiene un límite máximo y al sobrepasarlo,
         vuelve al valor negativo mínimo.
        */
    }
}
