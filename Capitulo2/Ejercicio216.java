import java.util.Scanner;
public class Ejercicio216 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, resultado;
        System.out.println("Programa que calcula el número entero más grande");
        System.out.println("Escriba el primer entero");
        num1 = entrada.nextInt();
        System.out.println("Escriba el segundo entero");
        num2 = entrada.nextInt();
        if (num2 < num1)
            System.out.println (num1 + " Es más grande que " + num2);
        if (num1 < num2)
            System.out.println (num2 + " Es más grande que " + num1);
        if (num1 == num2)
        System.out.println (num1 + " Es igual a " + num2); 
        entrada.close();
    }
    
}
