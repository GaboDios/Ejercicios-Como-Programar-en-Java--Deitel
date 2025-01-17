/**
 * Clase que modifica la clase Cuenta proporcionando un método cargar,
 * que retire dinero de un objeto Cuenta, asegurando que el monto a cargar
 * no exceda el saldo de Cuenta. Si lo hace, el saldo debe permanecer sin
 * cambio y el método debe imprimir un mensaje que indique "El monto a 
 * cargar excede el saldo de la cuenta."
 */

package Capitulo3;

public class Cuenta {
    private double saldo;

    //Constructor
    public Cuenta (double saldoInicial){
        if (saldoInicial >0.0)
        saldo = saldoInicial;
    }

    public void abonar(double monto)
    {
        saldo = saldo + monto;
    }

    public double getSaldo(){
        return saldo;
    }

    /*Método que retire dinero de un objeto Cuenta, asegurando que el monto a cargar
 * no exceda el saldo de Cuenta. Si lo hace, el saldo debe permanecer sin
 * cambio y el método debe imprimir un mensaje que indique "El monto a 
 * cargar excede el saldo de la cuenta." */

    public void cargar(double monto){
        if (monto <= saldo)
        this.saldo -= monto;
        else
        System.out.println("El monto a cargar excede el saldo de la cuenta.");
    }
    
}
