/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Entidades;

import Enums.Tipos;

/**
 *Cantidad

 * @author Damian Dries - "www.damiandries.com.ar"
 */
public final class HotelCincoEstrellas extends HotelCuatroEstrellas {
    private Integer salonesConferencia;
    private Integer cantSuites;
    private Integer cantLimosinas;

    public HotelCincoEstrellas(String nombre, Integer habitaciones, Integer numCamas, Integer cantPisos, 
            Double precioHabitaciones, Tipos tipoGimnasio, String nombreRestaurante, 
            Integer capRestaurante,Integer salonesConferencia, Integer cantSuites,Integer cantLimosinas) {
        
        super(nombre,habitaciones, numCamas, cantPisos, precioHabitaciones, tipoGimnasio, nombreRestaurante, capRestaurante);
        this.salonesConferencia = salonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getSalonesConferencia() {
        return salonesConferencia;
    }

    public void setSalonesConferencia(Integer salonesConferencia) {
        this.salonesConferencia = salonesConferencia;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel "+nombre+" ✶✶✶✶✶ "+ "\nHabitaciones: " + habitaciones + "\nCamas: " + numCamas + "\nPisos: " + cantPisos + "\nPrecio: " + precioHabitaciones 
                +"\nTipo Gimanasio: "+tipoGimnasio+"\nRestaurante: "+nombreRestaurante+"\nCapacidad del Restaurante: "+capRestaurante+"\nSalones de Conferencia: "+salonesConferencia
                +"\nCantidad de Suites: "+cantSuites+"\nCantidad de Limosinas: "+cantLimosinas+"\n";
    }
    
}
