/**
 * Clase que modifica la clase LibroCalificaciones incluyendo una segunda variable de instancia String
 * que represente el nombre del instructor del curso.
 * Proporcione un método establecer para modificar el nombre del instructor, y un método obtener para 
 * obtener el nombre.
 * Modifique el constructor para especificar dos parámetros: uno para el nombre del curso y otro para el 
 * nombre del instructor.
 * Modifique el método mostrarMensaje, de tal forma que primero imprima el mensaje de bienvenida y el
 * nombre del curso, y que después imprima "Este curso es presentado por: ", seguido del nombre del instructor.
 * 
 * @author GaboDios
 * @version 1.0
 */

 package Capitulo3;

 public class LibroCalificaciones {
 
     // Variables de instancia para almacenar el nombre del curso y del instructor
     private String nombreDelCurso;
     private String nombreInstructor;
 
     // Método para establecer el nombre del instructor
     public void setNombreInstructor(String nombre) {
         nombreInstructor = nombre;
     }
 
     // Método para obtener el nombre del instructor
     public String getNombreInstructor() {
         return nombreInstructor;
     }
 
     // Constructor para inicializar nombreDelCurso y nombreInstructor
     public LibroCalificaciones(String nombre, String nombreInstructor) {
         nombreDelCurso = nombre;
         this.nombreInstructor = nombreInstructor;
     }
 
     // Método para establecer el nombre del curso
     public void setNombreDelCurso(String nombreDelCurso) {
         this.nombreDelCurso = nombreDelCurso; // Uso de "this" para evitar ambigüedad
     }
 
     // Método para obtener el nombre del curso
     public String getNombreDelCurso() {
         return nombreDelCurso;
     }
 
     // Método para mostrar un mensaje de bienvenida
     public void mostrarMensaje() {
         System.out.printf("Bienvenido al libro de calificaciones para \n%s!\nEste curso es presentado por: \n%s\n", 
             getNombreDelCurso(), getNombreInstructor());
     }
 }
 