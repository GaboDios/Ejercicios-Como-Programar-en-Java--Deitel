package Capitulo3;

public class PruebaFactura {
    public static void main(String[] args) {
        System.out.println("Clase que demuestra la capacidad de la clase Factura");

        Factura miFactura = new Factura("001", "Cigarrillos", 50, 50.00);

        System.out.println("El precio del articulo es: " + miFactura.obtenerMontoFactura());



    }
    
}
