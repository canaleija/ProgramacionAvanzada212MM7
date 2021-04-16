/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion;

/**
 *
 * @author working
 */// las llaves me definen el contexto de la clase
public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;
    // metodo constructor por defecto
    public Fecha(){
        this.dia = 0;
        this.mes = 0;
        this.anio = 0;
    }
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    // POO
    // definir un conjunto de operaciones permitan modifcar y consultar los valores de los 
    // atributos
    // set(establecer) / get(obtener?)
    // acceso /valorRetorno/ identificador / parametros / implementación
    public void setDia (int dia){
        this.dia = dia;
    }
    public int getDia(){
        return this.dia;
    }
    
    public void setMes(int mes){
        this.mes =mes;
    }
    public int getMes (){
        return this.mes;
    }
    
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    public int getAnio(){
        return this.anio;
    }
}
