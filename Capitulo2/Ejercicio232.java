import java.util.Scanner;

public class Ejercicio232 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para contar positivos, negativos y ceros
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("Ingresa cinco números enteros:");

        // Leer y clasificar el primer número
        System.out.print("Número 1: ");
        int numero1 = scanner.nextInt();
        if (numero1 > 0) positivos++;
        else if (numero1 < 0) negativos++;
        else ceros++;

        // Leer y clasificar el segundo número
        System.out.print("Número 2: ");
        int numero2 = scanner.nextInt();
        if (numero2 > 0) positivos++;
        else if (numero2 < 0) negativos++;
        else ceros++;

        // Leer y clasificar el tercer número
        System.out.print("Número 3: ");
        int numero3 = scanner.nextInt();
        if (numero3 > 0) positivos++;
        else if (numero3 < 0) negativos++;
        else ceros++;

        // Leer y clasificar el cuarto número
        System.out.print("Número 4: ");
        int numero4 = scanner.nextInt();
        if (numero4 > 0) positivos++;
        else if (numero4 < 0) negativos++;
        else ceros++;

        // Leer y clasificar el quinto número
        System.out.print("Número 5: ");
        int numero5 = scanner.nextInt();
        if (numero5 > 0) positivos++;
        else if (numero5 < 0) negativos++;
        else ceros++;

        // Imprimir los resultados
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);

        scanner.close();
    }    
}
