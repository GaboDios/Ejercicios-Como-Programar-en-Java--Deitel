package Capitulo3;

public class Fecha {
    private int mes;
    private int dia;
    private int anio;

    public Fecha(int mes, int dia, int anio){
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    public int getMes(){
        return mes;
    }
    public int getDia(){
        return dia;
    }
    public int getAnio(){
        return anio;
    }


    public String toString(){
     return "0" + mes + "/" + "0" + dia +  "/" + "0" + anio;
    }

    
}
