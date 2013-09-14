/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Michele
 */
public class ConsoleOutput implements MessageOutput {
    
    @Override
    public void displayMessage(String message){
        System.out.println(message);
    }
    
}
