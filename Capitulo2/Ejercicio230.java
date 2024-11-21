import java.util.Scanner;

public class Ejercicio230 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número de cinco dígitos: ");
        int numero = scanner.nextInt();

        if (numero >= 10000 && numero <= 99999) {
            int digito1 = numero / 10000;             
            int digito2 = (numero % 10000) / 1000;    
            int digito3 = (numero % 1000) / 100;      
            int digito4 = (numero % 100) / 10;        
            int digito5 = numero % 10;               

            System.out.printf("%d   %d   %d   %d   %d%n", digito1, digito2, digito3, digito4, digito5);
        } else {
            System.out.println("El número ingresado no tiene exactamente cinco dígitos.");
        }

        scanner.close();
    }
    
}
