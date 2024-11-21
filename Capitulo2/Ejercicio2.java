import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {
        //a) Declarar variables c, estaEsUnaVariable, q76954 y numero como tipo int
        int c, estaEsUnaVariable, q76354, numero, valor;

        //b)Pedir al usuario que introduzca un entero.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número entero");

        /*
         * Recibir un entero como entrada y asignar el resultado a la variable int valor.
         * Suponga que se puede utilizar la variable entrada tipo Scanner para recibir un valor del teclado.
         */

        valor = entrada.nextInt();

        //d)Si la variable no es igual a 7 mostrar "La variable no es igual a 7."

        if (valor != 7 )
        System.out.println("La variable valor no es igual a 7.");

        //e)Imprimir "Este es un programa en Java" en una línea de la ventana de comandos
        
        System.out.println("Este es un programa en Java");
        /*
         * f)Imprimir "Este es un programa en Java" en dos líneas de la ventana de comandos.
         * La primera línea debe terminar con es un. Use el método System.out.println.
         */

        System.out.println("Este es un \n programa en Java");
        
        /*
         *f)Imprimir "Este es un programa en Java" en dos líneas de la ventana de comandos.
         * La primera línea debe terminar con es un. Use el método System.out.printf y dos 
         * especificadores de formato %s.
         */
        
         System.out.printf("%s%n%s%n", "Este es un", "programa en Java");
        entrada.close();
    }
}