import java.util.Scanner;
public class Ejercicio225 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Programa que determina si un número es par o impar");
        System.out.println("Introduzca el número");
        num = entrada.nextInt();
        if(num % 2 == 0) System.out.println("El número es par");
        if(num % 2 != 0) System.out.println("El número es impar");
        entrada.close();
    }
    
}
