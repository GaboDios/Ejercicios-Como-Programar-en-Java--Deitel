/**
 * Programa que imprime los números del 1 al 4 en la misma línea,
 * separado por un espacio.
 * @author GaboDios
 * @version 1.0
 */

public class Ejercicio214{
    public static void main(String[] args) {
        //a) Utilizando una instrucción System.out.println.
        System.out.println("1, 2, 3, 4");

        //b) Utilizando cuatro instrucciones System.out.print.
        System.out.print("1");
        System.out.print("2");
        System.out.print("3");
        System.out.print("4" + "\n");

        //a) Utilizando una instrucción System.out.printf.
        System.out.printf("%d, %d, %d, %d", 1, 2, 3, 4);
    }
}