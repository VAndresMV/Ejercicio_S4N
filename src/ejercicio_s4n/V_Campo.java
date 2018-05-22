/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_s4n;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author MyA
 */
public class V_Campo {
    
    public void Numero(KeyEvent evt){
        char tipo=evt.getKeyChar();
        if(!Character.isDigit(tipo) || Character.isSpaceChar(tipo)){
            evt.consume();
        }
    }
    
    
}
