    package Capitulo3;

    public class Factura {
        private String numeroPieza;
        private String descripcionPieza;
        private int cantidadArticulosAComprar;
        private double precioArticulo;
        
        //Constructor que inicializa las cuatro variables de instancia
        public Factura(String numero, String descripcion, int cantidad, double precio){
            numeroPieza = numero;
            descripcionPieza = descripcion;
            cantidadArticulosAComprar = cantidad;
            precioArticulo = precio;
        }

        //Setters

        public void setNumeroPieza(String numero){
            numeroPieza = numero;
        }

        public void setDescripcion(String descripcion){
            descripcionPieza = descripcion;
        }

        public void setCantidad(int cantidad){
            cantidadArticulosAComprar = cantidad;
        }

        public void setPrecioArticulo(double precio){
            precioArticulo = precio;
        }

        //Getters
        public String getNumeroPieza(){
            return numeroPieza;
        }
        
        public String getDescripcion(){
            return descripcionPieza;
        }
        public int getCantidad(){
            return cantidadArticulosAComprar;
        }
        
        public double getPrecio(){
            return precioArticulo;
        }
        
        /**
         * calcule el monto de la factura (es decir, que multiplique la cantidad por el
         * precio por artículo) y después devuelva ese monto como un valor double. 
         * Si la cantidad no es positiva, debe establecerseen 0.
         *  Si el precio por artículo no es positivo, debe establecerse a 0.0
         */

        public double obtenerMontoFactura(){
            
            if (cantidadArticulosAComprar < 0) 
            cantidadArticulosAComprar = 0;
            if (precioArticulo < 0) 
            precioArticulo = 0;
            
            return cantidadArticulosAComprar * precioArticulo;
        }
    }
