package Capitulo3;

public class PruebaFecha {
    public static void main(String[] args) {
        // Crear instancias de Fecha
        Fecha fecha1 = new Fecha(1, 2, 2023); // Enero 2, 2023
        Fecha fecha2 = new Fecha(12, 31, 2022); // Diciembre 31, 2022

        // Mostrar las fechas iniciales
        System.out.println("Fecha 1 inicial: " + fecha1);
        System.out.println("Fecha 2 inicial: " + fecha2);

        // Modificar las fechas
        fecha1.setMes(3); // Cambiar a marzo
        fecha1.setDia(15); // Cambiar al día 15
        fecha1.setAnio(2024); // Cambiar al año 2024

        fecha2.setMes(6); // Cambiar a junio
        fecha2.setDia(10); // Cambiar al día 10
        fecha2.setAnio(2023); // Cambiar al año 2023

        // Mostrar las fechas después de los cambios
        System.out.println("Fecha 1 después de modificaciones: " + fecha1);
        System.out.println("Fecha 2 después de modificaciones: " + fecha2);
    }
}
