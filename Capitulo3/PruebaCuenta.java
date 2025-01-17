package Capitulo3;

import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(200.00);
        Cuenta cuenta2 = new Cuenta(10000.00);

        System.out.printf("Saldo Cuenta 1: $%.2f\n\n", cuenta1.getSaldo());
        System.out.printf("Saldo Cuenta2 $%.2f\n\n", cuenta2.getSaldo());

        Scanner entrada = new Scanner(System.in);
        double montoDeposito;

        System.out.print("Escriba el monto a depositar a la cuenta1:");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\n sumando %.2f al saldo de cuenta\n\n", montoDeposito);
        cuenta1.abonar(montoDeposito);

        System.out.printf("Saldo de cuenta1\n\n", cuenta1.getSaldo());
        System.out.printf("Saldo de cuenta2\n\n", cuenta2.getSaldo());

        System.out.print("Escriba el monto a depositar a la cuenta2:");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\n sumando %.2f al saldo de cuenta\n\n", montoDeposito);
        cuenta2.abonar(montoDeposito);

        System.out.printf("Saldo de cuenta1\n\n", cuenta1.getSaldo());
        System.out.printf("Saldo de cuenta2\n\n", cuenta2.getSaldo());

        //Prueba método cargar

        double montoCargar;

        System.out.print("Escriba el monto a retirar a la cuenta 1: ");
        montoCargar = entrada.nextDouble();
        System.out.printf("\n retirando %.2f al saldo de cuenta\n\n", montoCargar);
        cuenta1.cargar(montoCargar);
        System.out.printf("Saldo de cuenta1\n\n", cuenta1.getSaldo());
        System.out.printf("Saldo de cuenta2\n\n", cuenta2.getSaldo());

        //Prueba método cargar

        double montoRetiro;

        System.out.print("Escriba el monto a retirar a la cuenta2: ");
        montoRetiro = entrada.nextDouble();
        System.out.printf("\n retirando %.2f al saldo de cuenta\n\n", montoRetiro);
        cuenta2.cargar(montoRetiro);
        System.out.printf("Saldo de cuenta1\n\n", cuenta1.getSaldo());
        System.out.printf("Saldo de cuenta2\n\n", cuenta2.getSaldo());

        entrada.close();





    }
    
}
