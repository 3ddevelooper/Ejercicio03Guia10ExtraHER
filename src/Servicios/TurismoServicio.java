/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Servicios;

import Comparadores.Comparador;
import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel;
import Entidades.HotelCincoEstrellas;
import Entidades.HotelCuatroEstrellas;
import Entidades.Residencia;
import Enums.Tipos;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class TurismoServicio {

    private List<Hotel> crearHoletes() {
        Tipos tipo;
        String[] nombreRes = {"Los Leños", "Sabores", "Bambu", "El Ultimo Romantico"};
        String[] nombreHotel = {"Avenida", "Alambra", "Buenos Aires", "La Cantoria"};
        int cont = 0, numNomRes = 0, numNomHot=0;
        double precioHabitaciones = 50.0;

        List<Hotel> hoteles = new ArrayList();

        do {
            int num = (int) (Math.random() * 90) + 10;
            int num1 = (int) (Math.random() * 5) + 1;

            int num2 = (int) (Math.random() * 4) + 1;
            int num3 = (int) (Math.random() * 3) + 1;
            int num4 = (int) (Math.random() * 10) + 1;

            int habitaciones = num, numCamas = (num + 4), cantPisos = num1, capRestaurante = (num - 5), salonesConferencia = num2,
                    cantSuites = num3, cantLimosinas = num4;

            if (capRestaurante > 30) {
                precioHabitaciones += 10;
            } else if (capRestaurante <= 30 && capRestaurante >= 50) {
                precioHabitaciones += 30;
            } else if (capRestaurante < 50) {
                precioHabitaciones += 50;
            }
            if (Tipos.randomLetter().equals(Tipos.A)) {
                precioHabitaciones += 50;
                tipo = Tipos.A;
            } else {
                precioHabitaciones += 30;
                tipo = Tipos.B;
            }

            precioHabitaciones += (cantLimosinas * 15);

            if (cont >=0) {
                hoteles.add(new HotelCuatroEstrellas(nombreHotel[numNomHot],habitaciones, numCamas, cantPisos, precioHabitaciones, tipo, nombreRes[numNomRes], capRestaurante));
            } else {
                hoteles.add(new HotelCincoEstrellas(nombreHotel[numNomHot + 1],habitaciones, numCamas, cantPisos, precioHabitaciones, tipo, nombreRes[numNomRes + 1], capRestaurante, salonesConferencia, cantSuites, capRestaurante));
            }

            numNomRes++;
            numNomHot++;
            cont++;

        } while (cont != 4);

        return hoteles;
    }

    private List<Alojamiento> crearAlojamientos() {

        List<Alojamiento> alojamientos = new ArrayList();
        Random random = new Random();
        String[] nombreCamping = {"Ricon de Indio", "Aeroclub", "Los Reyunos", "Las Leñas"};
        String[] nombreResidencia = {"Los Olmos", "Jazmin", "Los Pinos", "El Capricho"};
        int cont = 0, numCam=0;

        do {
         
            String condicion = "", descuento = "", campo = "", restaurant = "";
            if (random.nextBoolean()) {
                condicion = "Privada";
            } else {
                condicion = "Publica";
            }
            if (random.nextBoolean()) {
                descuento = "Si";
            } else {
                descuento = "No";
            }
            if (random.nextBoolean()) {
                campo = "Si";
            } else {
                campo = "No";
            }

            double mt2 = (Math.random() * 200) + 10;
            int capMaxCarpas = (int) (Math.random() * 40) + 1;
            int cantHabitaciones = (int) (Math.random() * 5) + 1;
            int cantBanios = (int) (Math.random() * 7) + 1;
          
            if (random.nextBoolean()) {
                restaurant = "Si";
            } else {
                restaurant = "No";
            }

            alojamientos.add(new Residencia(condicion, mt2,nombreResidencia[numCam], cantHabitaciones, descuento, campo));
            alojamientos.add(new Camping(condicion, mt2,nombreCamping[numCam],capMaxCarpas, cantBanios, restaurant));

            numCam++;
            cont++;

        } while (cont != 2);

        return alojamientos;
    }

    public void menu() {
        Scanner read = new Scanner(System.in);
        List<Hotel> hoteles = crearHoletes();
        List<Alojamiento> alojamientos = crearAlojamientos();
        int opcion;
// • todos los alojamientos.
//• todos los hoteles de más caro a más barato.
//• todos los campings con restaurante
//• todas las residencias que tienen descuento.

        do {
            
            System.out.println("Elija Una Opcion\n" + "1-Mostrar Todos Los Alojamientos\n" + "2-Mostrar Hoteles(+Caro a -Caro)\n" + "3-Mostrar Camping con Restaurante\n"
                    + "4-Mostrar Residencia con Descuento\n" + "5-Salir");
            opcion = Integer.parseInt(read.nextLine());

            switch (opcion) {
                case 1:
                    alojamientos.forEach(System.out::println);
                    break;
                case 2:
                    hoteles.stream().sorted(Comparador.compararDescendente).filter(h -> h.getPrecioHabitaciones() > 0).forEach(System.out::println);
                    break;
                case 3:
                    alojamientos.stream().filter((alo) -> (alo instanceof Camping)).filter((alo) -> (((Camping) alo).getRestaurante().equalsIgnoreCase("si"))).forEachOrdered((alo) -> {
                        System.out.println(alo.toString());
                    });
                    break;
                case 4:
                    alojamientos.stream().filter((res) -> (res instanceof Residencia)).filter((res) -> (((Residencia) res).getDescGremio().equalsIgnoreCase("si"))).forEachOrdered((res) -> {
                        System.out.println(res.toString());
                    });
                    break;
                case 5:
                    break;
                default:
                    System.out.println("no se conoce la opción");
                    break;
            }
        } while (opcion != 5);

    }
}
