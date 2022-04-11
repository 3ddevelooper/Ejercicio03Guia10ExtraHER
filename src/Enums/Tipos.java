/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Enums;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;



/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public enum Tipos {
    A, B;

    private static final List<Tipos> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Tipos randomLetter() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

}
