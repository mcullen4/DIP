/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Michele
 */
public class GUIOutput implements MessageOutput {
    
    
    
    @Override
    public void displayMessage(String message){
    JOptionPane.showMessageDialog(null,message);
            }
    
}
