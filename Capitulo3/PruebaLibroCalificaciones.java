package Capitulo3;

public class PruebaLibroCalificaciones{
	public static void main(String[] args) {
	// crea un objeto LibroCalificaciones
		LibroCalificaciones miLibro = new LibroCalificaciones("CS101 Introducción a la programación con Java", "Salvador");
		LibroCalificaciones miLibro2 = new LibroCalificaciones("CS103 Estructuras de Datos con Java", "Vero");
        miLibro.mostrarMensaje();
        miLibro2.mostrarMensaje();
	}
}