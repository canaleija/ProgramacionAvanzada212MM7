/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionavanzada212mm7;

import introduccion.Alumno;
import introduccion.Fecha;
import introduccion.Persona;
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
        
        // variable tipo: Fecha id: 
//        Fecha hoy = new Fecha();
//        // modificar ni para ver sus atributos
//        hoy.setDia(16);
//        hoy.setMes(4);
//        hoy.setAnio(2021);
//        
//        System.out.println(hoy.getDia()+"/"+hoy.getMes()+"/"+hoy.getAnio());
//        
//        Fecha manana = new Fecha(16,4,2021);
//        manana.setDia(17);
//       
//        System.out.println(manana.getDia()+"/"+manana.getMes()+"/"+manana.getAnio());

        Persona beto = new Persona();
       
        System.out.println();
        
        Alumno martha = new Alumno("Martha","Centro 125","Mexicana", 23, 1);
      
        
        System.out.println();
        // Todas las clases se identifica la 1er letra con mayúscula
        // Las clases ademas que permiten crear plantillas para generar objetos 
        // tambien me ayudan a crear nuevos tipos de datos
    }
    
}
