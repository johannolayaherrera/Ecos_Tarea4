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
import spark.*;
import static spark.Spark.*;
import static spark.SparkBase.*;

/**
 * Clase Controlador encargada de recibir las peticiones y realizar las
 * acciones correspondientes.
 */
public class Controlador {
    
    public static void main(String[] args) {
        
        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");
        
        /**
         * Método para la petición de Escenario_1
         */
        get("/Escenario_1", (req, res) -> {
            Modelo.cargarEscenario2();
            return  "<br>Prueba Assignment Kit for Program 4 <br>" +
                    " Tabla 1 (LOC/Method)"
                    + "<br><br><table border = '1'>"
                    + "<tr>"
                    + "<td>VS : " + String.valueOf(Modelo.obtenerVs()) + "</td>" 
                    + "<td>S : " + String.valueOf(Modelo.obtenerS()) + "</td>" 
                    + "<td>M : " + String.valueOf(Modelo.obtenerM()) + "</td>" 
                    + "<td>L : " + String.valueOf(Modelo.obtenerL()) + "</td>" 
                    + "<td>VL : " + String.valueOf(Modelo.obtenerVl()) + "</td>"  
                    +"</tr>";
        });
        
        /**
         * Método para la petición de Escenario_2
         */
        get("/Escenario_2", (req, res) -> {
            Modelo.cargarEscenario1();
            return  "<br>Prueba Assignment Kit for Program 4 <br>" +
                    " Tabla 2 (Pgs/Chapter)"
                    + "<br><br><table border = '1'>"
                    + "<tr>"
                    + "<td>VS : " + String.valueOf(Modelo.obtenerVs()) + "</td>" 
                    + "<td>S : " + String.valueOf(Modelo.obtenerS()) + "</td>" 
                    + "<td>M : " + String.valueOf(Modelo.obtenerM()) + "</td>" 
                    + "<td>L : " + String.valueOf(Modelo.obtenerL()) + "</td>" 
                    + "<td>VL : " + String.valueOf(Modelo.obtenerVl()) + "</td>"  
                    +"</tr>";
        });

    }
}
