import java.util.Scanner;

public class Ejercicio215 {
    public static void main(String[] args) {
        // Crear una instancia del escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números enteros
        System.out.println("Ingrese el primer número entero:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero:");
        int numero2 = scanner.nextInt();

        // Realizar y mostrar la suma
        int resultado = numero1 + numero2;
        System.out.println("Suma: " + resultado);

        // Realizar y mostrar el producto
        resultado = numero1 * numero2;
        System.out.println("Producto: " + resultado);

        // Realizar y mostrar la diferencia
        resultado = numero1 - numero2;
        System.out.println("Diferencia: " + resultado);

        // Realizar y mostrar el cociente
        if (numero2 != 0) {
            resultado = numero1 / numero2;
            System.out.println("Cociente: " + resultado);
        } else {
            System.out.println("Cociente: No se puede dividir entre cero.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}
