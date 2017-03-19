/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de prueba para los métodos correspondientes a la clase Modelo
 */
public class ModeloTest {

    @Before
    public void setUp() throws Exception {
        Modelo.cargarEscenario2();
    }

    /**
     * Prueba del método ObtenerPromedioEscenario1, de la clase Modelo.
     */
    @org.junit.Test
    public void testObtenerPromedioEscenario1() {
        //Modelo.cargarEscenario1();
        System.out.println("obtenerPromedioEscenario2");
        double expResult = 2.8;
        double result = Modelo.obtenerPromedioEscenario1();
        assertTrue((expResult - 0.1 < result)&&(result < expResult + 0.1));
    }
    /**
     * Prueba del método ObtenerVarianza, de la clase Modelo.
     */
    @Test
    public void testObtenerVarianza() {
        System.out.println("obtenerVarianza");
        double expResult = 0.43;
        double result = Modelo.obtenerVarianza();
        assertTrue((expResult - 0.05 < result)&&(result < expResult + 0.05));
    }

    
    /**
     * Prueba del método ObtenerDesviacionEstandar, de la clase Modelo.
     */
    @org.junit.Test
    public void testObtenerDesviacionEstandar() {
        System.out.println("obtenerDesviacionEstandar");
        double expResult = 0.66;
        double result = Modelo.obtenerDesviacionEstandar();
        assertTrue((expResult - 0.1 < result)&&(result < expResult + 0.1));
    }

    
    /**
     * Prueba del método ObtenerVs, de la clase Modelo.
     */
    @org.junit.Test
    public void testObtenerVs() {
        System.out.println("obtenerVs");
        double expResult = 4.39;
        double result = Modelo.obtenerVs();
        assertTrue((expResult - 0.1 < result)&&(result < expResult + 0.1));
    }

    /**
     * Prueba del método ObtenerS, de la clase Modelo.
     */
    @org.junit.Test
    public void testObtenerS() {
        System.out.println("obtenerS");
        double expResult = 8.5;
        double result = Modelo.obtenerS();
        assertTrue((expResult - 0.1 < result)&&(result < expResult + 0.1));
    }

    /**
     * Prueba del método ObtenerM, de la clase Modelo.
     */
    @org.junit.Test
    public void testObtenerM() {
        System.out.println("obtenerM");
        double expResult = 16.46;
        double result = Modelo.obtenerM();
        assertTrue((expResult - 0.1 < result)&&(result < expResult + 0.1));
    }

    /**
     * Prueba del método ObtenerL, de la clase Modelo.
     */
    @org.junit.Test
    public void testObtenerL() {
        System.out.println("obtenerL");
        double expResult = 31.88;
        double result = Modelo.obtenerL();
        assertTrue((expResult - 0.1 < result)&&(result < expResult + 0.1));
    }

    /**
     * Prueba del método ObtenerVl, de la clase Modelo.
     */
    @org.junit.Test
    public void testObtenerVl() {
        System.out.println("obtenerVl");
        double expResult = 61.71;
        double result = Modelo.obtenerVl();
        assertTrue((expResult - 0.1 < result)&&(result < expResult + 0.1));
    }    
}
