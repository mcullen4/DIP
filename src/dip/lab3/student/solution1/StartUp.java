/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Michele
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            
        
        MessageInput messageInput = new FileInput();
        MessageOutput messageOutput = new ConsoleOutput();
        
        MessengerService messengerService = new MessengerService(messageInput,messageOutput);
        messengerService.displayMessage();
        
    }
}