/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guirender;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

/**
 *
 * @author working
 */
public class Escuchador2Botones implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem aux = (JMenuItem)e.getSource(); 
        if (aux.getText().equals("Nuevo")){
          System.out.println("Nuevo");
        }
        
        if (aux.getText().equals("Abrir")){
            System.out.println("Abrir");
        }
        
     // switch
     // presentación de como funciona el Cast de datos en java
    }
    
}
