/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Entidades;

/**
 *Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
si posee o no campo deportivo. Realizar un programa en el que se representen
todas las relaciones descriptas.
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Residencia extends Alojamiento{
    private String nombre;
    private Integer cantHabitaciones;
    private String descGremio;
    private String campDeportivo;

    public Residencia(String estado, Double metrosCuadrado,String nombre,Integer cantHabitaciones,String descGremio,String campDeportivo) {
        super(estado, metrosCuadrado);
        this.nombre = nombre;
        this.cantHabitaciones = cantHabitaciones;
        this.descGremio = descGremio;
        this.campDeportivo = campDeportivo;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public String getDescGremio() {
        return descGremio;
    }

    public void setDescGremio(String descGremio) {
        this.descGremio = descGremio;
    }

    public String getCampDeportivo() {
        return campDeportivo;
    }

    public void setCampDeportivo(String campDeportivo) {
        this.campDeportivo = campDeportivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Residencia " + super.getEstado()+" "+nombre+ "\nMt2: " +super.getMetrosCuadrado()+"\nCantidad de Habitaciones: "+cantHabitaciones
                +"\nDescuento Gremios: "+descGremio+"\nCampo Deportivo: "+campDeportivo+"\n";
    }
    
}
