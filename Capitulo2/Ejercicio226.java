import java.util.Scanner;
public class Ejercicio226 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        System.out.println("Programa que lee dos enteros y determina si el primero es un múltiplo del segundo");
        System.out.println("Introduzca el primer entero");
        num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo entero");
        num2 = entrada.nextInt();
        if(num2 % num1 == 0) System.out.println(num1 + " es multiplo de " + num2);
        if(num2 % num1 != 0) System.out.println(num1 + " no es multiplo de " + num2);
        entrada.close();
    }
    
}
