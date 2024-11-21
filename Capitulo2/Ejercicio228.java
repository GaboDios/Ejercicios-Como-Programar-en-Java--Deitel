import java.util.Scanner;
public class Ejercicio228 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int r;
        System.out.println("Programa que recibe el radio de un circulo como entero e imprime el diámetro, circunferencia y área del círculo mediante el uso del valor de punto flotante");
        System.out.println("Introduzca el valor del radio r");
        r = entrada.nextInt();
        System.out.println("Diámetro = " + 2 * r);
        System.out.println("Circunferencia = " + 2 * Math.PI * r );
        System.out.println("Área = " + Math.PI * r * r);
        entrada.close();
    }    
}
