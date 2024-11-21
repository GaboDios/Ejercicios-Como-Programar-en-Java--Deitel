import java.util.Scanner;

public class Ejercicio26{
    public static void main(String[] args) {
        System.out.println("Programa que calcula el producto de tres enteros");
        Scanner entrada = new Scanner(System.in);
        int x, y, z, resultado;

        System.out.println("Escribe el primer entero");
        x = entrada.nextInt();
        System.out.println("Escribe el segundo entero");
        y = entrada.nextInt();
        System.out.println("Escribe el tercer entero");
        z = entrada.nextInt();

        resultado = x * y *z;

        System.out.println("El producto es " + resultado);
        entrada.close();
    }
}