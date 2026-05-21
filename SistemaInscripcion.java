import java.util.HashSet;
import java.util.Set;

public class SistemaInscripcion {

    // Record Estudiante
    record Estudiante(String nombre, String cedula, double promedio) {}

    public static void main(String[] args) {

        // Arreglo con 4 estudiantes
        Estudiante[] estudiantes = {
            new Estudiante("Jose", "8-123-456", 4.5),
            new Estudiante("Maria", "8-987-654", 4.8),
            new Estudiante("Carlos", "8-555-111", 3.9),
            new Estudiante("Ana", "8-222-333", 4.2)
        };

        // Recorrer el arreglo e imprimir nombre + promedio
        System.out.println("Lista de estudiantes:");
        double suma = 0;

        for (Estudiante e : estudiantes) {
            System.out.println("Nombre: " + e.nombre()
                    + " | Promedio: " + e.promedio());

            suma += e.promedio();
        }

        // Crear Set de cédulas
        Set<String> cedulas = new HashSet<>();

        for (Estudiante e : estudiantes) {
            cedulas.add(e.cedula());
        }

        // Intentar agregar una cédula repetida
        cedulas.add("8-123-456");

        System.out.println("\nCédulas registradas:");
        for (String c : cedulas) {
            System.out.println(c);
        }

        // Promedio general
        double promedioGeneral = suma / estudiantes.length;

        System.out.println("\nPromedio general del grupo: " + promedioGeneral);
    }
}