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
public class Alumno extends Persona {
    
    // para que un alumno pueda existir se tiene que generar una instancia
    // y para generar la instancia se tiene que ejecutar el metodo constrcutor
    // Como el alumno ya es tmb una persona, tambien se tiene que crear como tal

    private int semestre;

 
    public Alumno() {
        super();
        System.out.println();
        this.semestre = 0;
    }

    public Alumno(String nombre, String dom, String nacionalidad, int edad, int semestre) {
        super(nombre, dom, edad, nacionalidad);
        System.out.println();
        this.semestre = semestre;
    }

    
    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
    
}
