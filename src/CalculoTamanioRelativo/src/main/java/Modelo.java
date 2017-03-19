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

import java.util.ArrayList;

/**
 * Clase Modelo el cual es cargado para hacer las operaciones correspondientes.
 */
public class Modelo {
    private static ArrayList<Calculo> datosEscenario1 = new ArrayList<>();
    
    private static ArchivoCargue cargue = new ArchivoCargue();
    double promedio1 =0;
    
    /**
     * Carga el escenario 1 Tabla 2. Pgs/Chapter
     */
    public static void cargarEscenario1(){
        datosEscenario1.clear();
        for (double dato : ArchivoCargue.darEscenario1()){
            Calculo calculo = new Calculo(dato);
            datosEscenario1.add(calculo);
        }
    }
    
    /**
     * Carga el escenario 2 Tabla 1. LOC/Method
     */
    public static void cargarEscenario2(){
        datosEscenario1.clear();
        for (double dato : ArchivoCargue.darEscenario2()){
            Calculo calculo = new Calculo(dato);
            datosEscenario1.add(calculo);
        }
    }
    
    public static double obtenerPromedioEscenario1(){
        double acumuladorCalculo1 = 0;
        
        for (Calculo dato : datosEscenario1){
            acumuladorCalculo1 += dato.getCalculo1();
        }
        return acumuladorCalculo1/(datosEscenario1.size());
    }
    
    public static double obtenerVarianza(){
        double promedio = obtenerPromedioEscenario1();
        double acumCalculo2 = 0;
        
        for (Calculo dato : datosEscenario1){
            acumCalculo2 += Math.pow((dato.getCalculo1()-promedio), 2);
        }
        return acumCalculo2/(datosEscenario1.size()-1);
    }
    
    /**
     * Obtiene la desviación estandar
     * @return retorna desviación estandar según el escenario cargado
     */
    public static double obtenerDesviacionEstandar(){
        return Math.sqrt(obtenerVarianza());
    }
    
    /**
     * Obtiene el valor de Vs
     * @return retorna Vs según el escenario cargado
     */
    public static double obtenerVs(){
        
        return ((double) Math.round(Math.exp(obtenerPromedioEscenario1()-(2*obtenerDesviacionEstandar())) * 100) / 100);
    }
    
    /**
     * Obtiene S
     * @return retorna S según el escenario cargado
     */
    public static double obtenerS(){
        
        return ((double) Math.round(Math.exp(obtenerPromedioEscenario1()-(obtenerDesviacionEstandar())) * 100) / 100);
    }
    
    /**
     * Obtiene M
     * @return retorna M según el escenario cargado
     */
    public static double obtenerM(){
        
        return ((double) Math.round((double) Math.round(Math.exp(obtenerPromedioEscenario1()) * 100) / 100 * 100) / 100);
    }
    
    /**
     * Obtiene L
     * @return retorna L según el escenario cargado
     */
    public static double obtenerL(){
        
        return ((double) Math.round(Math.exp(obtenerPromedioEscenario1()+(obtenerDesviacionEstandar())) * 100) / 100);
    }
    
    /**
     * Obtiene VL
     * @return retorna VL según el escenario cargado
     */
    public static double obtenerVl(){
        
        return ((double) Math.round(Math.exp(obtenerPromedioEscenario1()+(2*obtenerDesviacionEstandar())) * 100) / 100);
    }
    
    
    
    

    
}
