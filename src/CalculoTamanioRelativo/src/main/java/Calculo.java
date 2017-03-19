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

/**
 * Clase que representa una fila en la tabla de calculo.
 */
public class Calculo {
    private double datoEntrada ;
    //Calculo1 Corresponde al cálculo del Ln(xi)
    private double calculo1;
    
    /**
     * Constructor de la clase Calculo
     * @param datoNuevo ingresa el dato de la fila, además realiza el cálculo 1 
     * correspondiente a Ln(xi)
     */
    public Calculo(double datoNuevo) {
        datoEntrada = datoNuevo;
        calculo1 = Math.log(datoEntrada);
    }
    public double getCalculo1(){
        return calculo1;
    }  
}
