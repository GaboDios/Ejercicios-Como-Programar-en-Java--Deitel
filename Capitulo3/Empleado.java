package Capitulo3;

public class Empleado {
    //Variables de instancia
    private String nombre;
    private String apellidoPaterno;
    private double salario;

    public Empleado(String nombre, String apellido, double salario){
        this.nombre = nombre;
        apellido = apellidoPaterno;
        if (salario <0)
        this.salario = 0.0;
        else
        this.salario = salario;
    }

    public void setNombre(String nom){
        nombre = nom;
    }

    public void setApellido(String apellido){
        this.apellidoPaterno = apellido;
    }
    
    public void setSalario(double sal){
        if (sal <0)
        this.salario = 0.0;
        else
        this.salario = sal;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellidoPaterno;
    }
    public double getSalario(){
        return salario;
    }

    
}
