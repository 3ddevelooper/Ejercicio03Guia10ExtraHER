/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Comparadores;



import Entidades.Hotel;
import java.util.Comparator;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Comparador {

    public static Comparator<Hotel> compararDescendente = (Hotel h1, Hotel h2) -> h2.getPrecioHabitaciones().compareTo(h1.getPrecioHabitaciones());

    
//
//    public static Comparator<Curso> compararTituloAscendente = (Pelicula e1, Pelicula e2) -> e1.getTitulo().compareTo(e2.getTitulo());

//    public static Comparator<Curso> compararAutorAscendente = new Comparator<Pelicula>() {
//        @Override
//        public int compare(Curso e1, Curso e2) {
//            return e1.getAutor().compareTo(e2.getAutor());
//
//        }
//    };

}
