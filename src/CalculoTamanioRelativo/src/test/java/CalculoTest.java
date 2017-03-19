/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Conceptos Avanzados de Ingeniería de Software
 *
 * Proyecto Calcular Tamaño Relativo
 * Tarea 4
 * Autor: Johann De Jesus Olaya Herrera
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de pruebas unitarias correspondiente a la clase Calculo
 */
public class CalculoTest {


    /**
     * Prueba del método getCalculo, de la clase Calculo.
     */
    @Test
    public void testGetCalculo1() {
        System.out.println("getCalculo1");
        Calculo prueba = new Calculo(6.0);
        double expResult = 1.7918;
        double result = prueba.getCalculo1();
        assertTrue((expResult - 0.1 < result)&&(result < expResult + 0.1));
    }
    
}
