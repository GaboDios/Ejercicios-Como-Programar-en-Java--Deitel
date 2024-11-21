import java.util.Scanner;
public class Ejercicio217 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, resultado;
        
        System.out.println("Programa que recibe tres enteros y muestra la suma, " +
        "promedio, producto, menor y mayor de esos números. \n" + "Introduzca el primer entero");
        num1 = entrada.nextInt();
        
        System.out.println("Introduzca el segundo entero");
        num2 = entrada.nextInt();

        System.out.println("Introduzca el tercer entero");
        num3 = entrada.nextInt();

        resultado = num1 + num2 + num3;
        System.out.println("La suma de los tres números es " + resultado);
        
        resultado = (num1 + num2 + num3)/3;
        System.out.println("El promedio de los tres números es " + resultado);

        resultado = num1 * num2 * num3;
        System.out.println("El producto de los tres números es " + resultado);

        if(num1 > num2 && num1 > num2)
        System.out.println(num1 + " Es el mayor de los números");

        if(num2 > num1 && num2 > num3)
        System.out.println(num2 + " Es el mayor de los números");

        if(num3 > num1 && num3 > num2)
        System.out.println(num3 + " Es el mayor de los números");

        if(num1 < num2 && num1 < num2)
        System.out.println(num1 + " Es el menor de los números");

        if(num2 < num3 && num2 < num1)
        System.out.println(num2 + " Es el menor de los números");

        if(num3 < num1 && num3 < num2)
        System.out.println(num3 + " Es el menor de los números");
        entrada.close();
    }
    
}
