/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Entidades;

import Enums.Tipos;

/**
 *Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de las
Habitaciones.
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class HotelCuatroEstrellas extends Hotel{
    Tipos tipoGimnasio;
    String nombreRestaurante;
    Integer capRestaurante;

    public HotelCuatroEstrellas(String nombre,Integer habitaciones, Integer numCamas, Integer cantPisos, Double precioHabitaciones,
            Tipos tipoGimnasio,String nombreRestaurante,Integer capRestaurante) {
        super(nombre,habitaciones, numCamas, cantPisos, precioHabitaciones);
        this.tipoGimnasio = tipoGimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capRestaurante = capRestaurante;
    }

    public Tipos getTipoGimnasio() {
        return tipoGimnasio;
    }

    public void setTipoGimnasio(Tipos tipoGimnasio) {
        this.tipoGimnasio = tipoGimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapRestaurante() {
        return capRestaurante;
    }

    public void setCapRestaurante(Integer capRestaurante) {
        this.capRestaurante = capRestaurante;
    }

    @Override
    public String toString() {
        return "Hotel "+nombre+" ✶✶✶✶ "+ "\nHabitaciones: " + habitaciones + "\nCamas: " + numCamas + "\nPisos: " + cantPisos + "\nPrecio: " + precioHabitaciones 
                +"\nTipo Gimanasio: "+tipoGimnasio+"\nRestaurante: "+nombreRestaurante+"\nCapacidad del Restaurante: "+capRestaurante+"\n" ;
    }
    
}
