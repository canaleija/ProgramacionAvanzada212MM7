/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionavanzada212mm7;

import introduccion.Fecha;
/**
 *
 * @author working
 */
public class ProgramacionAvanzada212MM7 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        System.out.print("Hola mundo!");
        // variable tipo: Fecha id: 
        Fecha hoy = new Fecha();
        hoy.dia = 24;
        hoy.mes=3;
        hoy.anio=2021;
        Fecha manana = new Fecha();
        System.out.println();
        // Todas las clases se identifica la 1er letra con mayúscula
        // Las clases ademas que permiten crear plantillas para generar objetos 
        // tambien me ayudan a crear nuevos tipos de datos
    }
    
}
