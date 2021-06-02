/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author working
 */
public class AbstraccionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClaseB aux = new ClaseB(); // ClaseA y ClaseB
        aux.compartamiento1();
        aux.metodo1();
        aux.metodoAbstracto();
        
        // Los objetos se comportan como se c o n s t r u y e n
        Alumno juan = new Alumno();
        Profesor pedro = new Profesor();
        Tecnico maria = new Tecnico();
        
        Omega aux2 = new Omega() {
            @Override
            public void bailar() {
          
            }

            @Override
            public void comer() {
                
            }

            @Override
            public void cantar() {
                System.out.println("Shakira!!!!");
            }
        };
        
        
        FiestaOmega fiesta = new FiestaOmega();
        fiesta.recibirInvitado(maria);
        fiesta.recibirInvitado(juan);
        fiesta.recibirInvitado(pedro);
        fiesta.recibirInvitado(aux2);
               
        
        
        
    }
    
}
