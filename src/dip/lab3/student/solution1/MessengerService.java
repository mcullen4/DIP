/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Michele
 */
public class MessengerService {
  
    
    
    private MessageInput messageInput;
	private MessageOutput messageOutput;
        
        public MessengerService( MessageInput messageInput, MessageOutput messageOutput ) {
		this.messageInput = messageInput;
                this.messageOutput = messageOutput;
	}
        
        public void displayMessage() {
            String message = messageInput.getMessage();
            messageOutput.displayMessage(message);
            
	}
}
