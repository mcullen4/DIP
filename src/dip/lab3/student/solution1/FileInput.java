/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Michele
 */
public class FileInput implements MessageInput {
    private String message;
    private String [] messageArray = new String[0];
    private File file;
    private String randomMessage;
    private int counter = 0;

 
    
    
    @Override
    public String getMessage() {
    //arraySize=getArraySize();
        
    Scanner inputFile;
    
    try{    
    file = new File("Messages.txt");    
    inputFile = new Scanner(file);
   
    while(inputFile.hasNext())
    {
       
     String [] temp = new String[messageArray.length+1];
     System.arraycopy(messageArray, 0, temp, 0, messageArray.length);
     messageArray=temp;
     messageArray[counter]=inputFile.nextLine();
     counter++;
    }
    
    inputFile.close();
   
    }
    catch (FileNotFoundException e)
    {
        System.out.println("File not found");
    }
    message=getRandomMessage();    
    return message;
    
    }
    
    
        
    private String getRandomMessage(){
    /**This method chooses a random number between 0 and one less than the 
        messageArray length and then returns the message that is stored in 
        the array**/
    Random randomNumbers = new Random();
    
    int number = randomNumbers.nextInt(messageArray.length); 
    randomMessage = messageArray[number];
       
    return randomMessage;
    }
    

    
}
