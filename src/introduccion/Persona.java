/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion;

/**
 *
 * @author working
 */
public class Persona {
    
    // reutilización de codigo
    
    
    private String nombre;
    private String dom;
    private int edad;
    private String nacionalidad;

    public Persona() {
         System.out.println();
        this.nombre = "";
        this.dom ="desconocido";
        this.edad = 0;
        this.nacionalidad = "desconocida";
                
    }

    public Persona(String nombre, String dom, int edad, String nacionalidad) {
         System.out.println();
        this.nombre = nombre;
        this.dom = dom;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the dom
     */
    public String getDom() {
        return dom;
    }

    /**
     * @param dom the dom to set
     */
    public void setDom(String dom) {
        this.dom = dom;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    
    
    
}
