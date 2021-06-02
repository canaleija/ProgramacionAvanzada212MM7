/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.HeadlessException;

/**
 *
 * @author working
 */
public class JFrameManita extends javax.swing.JFrame {

    public JFrameManita() {
        inicializarComponentes();
        
    }
     public JFrameManita(String titulo) {
        inicializarComponentes();
        setTitle(titulo);
    }
    

    private void inicializarComponentes() {
        setSize(400, 750);
        setVisible(true);
    }
    
    
    
}
