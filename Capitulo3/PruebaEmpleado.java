package Capitulo3;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado miEmpleado = new Empleado("Gabo", "Diaz", 100000.00);
        Empleado otroEmpleado = new Empleado("Alex", "Lora", 10000.00);

        System.out.println("El salario de " + miEmpleado.getNombre() + "es: " + miEmpleado.getSalario() + "$");
        System.out.println("El salario de " + otroEmpleado.getNombre() + "es: " + otroEmpleado.getSalario() + "$");

        miEmpleado.setSalario(miEmpleado.getSalario() * 1.10);
        otroEmpleado.setSalario(otroEmpleado.getSalario() * 1.10);

        System.out.println("El salario de " + miEmpleado.getNombre() + "Con el aumeto del 10% es: " + miEmpleado.getSalario() +"$");
        System.out.println("El salario de " + otroEmpleado.getNombre() + "Con el aumeto del 10% es: " + otroEmpleado.getSalario() +"$");
    }
    
}
