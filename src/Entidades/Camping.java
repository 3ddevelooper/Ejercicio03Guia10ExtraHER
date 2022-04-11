/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Entidades;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Camping extends Alojamiento{
    private String nombre;
    private Integer capMaxCarpas;
    private Integer cantBaños;
    private String restaurante;

    public Camping(String estado, Double metrosCuadrado,String nombre,Integer capMaxCarpas,Integer cantBaños,String restaurante) {
        super(estado, metrosCuadrado);
        this.nombre = nombre;
        this.capMaxCarpas = capMaxCarpas;
        this.cantBaños = cantBaños;
        this.restaurante = restaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(Integer capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public Integer getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(Integer cantBaños) {
        this.cantBaños = cantBaños;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }
    
    
    @Override
    public String toString() {
        return "Camping "+nombre+ "\nTotal de Carpas: " + capMaxCarpas + "\nTotal de Baños: " + cantBaños + "\nServicio de Restaurante: " + restaurante+"\n";
    }
}
