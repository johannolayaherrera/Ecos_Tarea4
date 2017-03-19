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
 * Clase que carga los archivos que se usan para las pruebas
 */
 public class ArchivoCargue {
    private static ArrayList<Double> escenario = new ArrayList<>();
    
    /**
     * Carga el escenario 1
     * @return retorna en un arreglo los valores correspondientes al escenario 1 Pgs/Chapter
     */
    public static ArrayList<Double> darEscenario1(){
        escenario.clear();
        escenario.add(7.0);
        escenario.add(12.0);
        escenario.add(10.0);
        escenario.add(12.0);
        escenario.add(10.0);
        escenario.add(12.0);
        escenario.add(12.0);
        escenario.add(12.0);
        escenario.add(12.0);
        escenario.add(8.0);
        escenario.add(8.0);
        escenario.add(8.0);
        escenario.add(20.0);
        escenario.add(14.0);
        escenario.add(18.0);
        escenario.add(12.0);

        return escenario;
    }
    /**
     * Carga el escenario 2
     * @return retorna en un arreglo los valores correspondientes al escenario 2  LOC/Method
     */
    public static ArrayList<Double> darEscenario2(){
        escenario.clear();
        escenario.add(6.0);
        escenario.add(6.0);
        escenario.add(8.3333);
        escenario.add(10.3333);
        escenario.add(12.3333);
        escenario.add(16.4);
        escenario.add(20.5);
        escenario.add(21.75);
        escenario.add(22.25);
        escenario.add(23.0);
        escenario.add(28.3333);
        escenario.add(29.0);
        escenario.add(55.8);

        return escenario;
    }
    
}
