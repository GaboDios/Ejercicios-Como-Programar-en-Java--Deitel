import java.util.Scanner;
public class Ejercicio224 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        System.out.println("Programa que recibe cinco enteros y determina los enteros mayor y menor en el grupo");
        
        System.out.println("Inserte el primer entero");
        num1 = entrada.nextInt();

        System.out.println("Inserte el segundo entero");
        num2 = entrada.nextInt();

        System.out.println("Inserte el tercer entero");
        num3 = entrada.nextInt();

        System.out.println("Inserte el cuarto entero");
        num4 = entrada.nextInt();

        System.out.println("Inserte el quinto entero");
        num5 = entrada.nextInt();

        int mayor = num1;
        if (num2 > mayor) mayor = num2;
        if (num3 > mayor) mayor = num3;
        if (num4 > mayor) mayor = num4;
        if (num5 > mayor) mayor = num5;

        System.out.println("El número mayor es " + mayor);

        int menor = num1;
        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;
        if (num4 < menor) menor = num4;
        if (num5 < menor) menor = num5;

        System.out.println("El número menor es " + menor);

        entrada.close();
    }
    
}
