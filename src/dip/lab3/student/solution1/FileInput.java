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
    private String [] messageArray = new String[4];
    private File file;
    private String randomMessage;
    private int arraySize = 1;

 
    
    
    @Override
    public String getMessage() {
    //arraySize=getArraySize();
    Scanner inputFile;
    
    try{    
    file = new File("Messages.txt");    
    inputFile = new Scanner(file);
   
    while(inputFile.hasNext())
    {
       int counter = 0; 
     
     messageArray[counter]=inputFile.nextLine();
     System.out.println(messageArray[counter]);
     counter++;
    }
    
    inputFile.close();
    message=getRandomMessage();
    }
    catch (FileNotFoundException e)
    {
        System.out.println("File not found");
    }
        
    return message;
    
    }
    
    
        
    private String getRandomMessage(){
    
    Random randomNumbers = new Random();
    
    int number = randomNumbers.nextInt(5); 
    
    randomMessage = messageArray[number];
        
    return randomMessage;
    }
    
//    private int getArraySize(){
//    Scanner inputFile;
//    
//    try{    
//    file = new File("Messages.txt");    
//    inputFile = new Scanner(file);
//   
//    while(inputFile.hasNext())
//    {
//        
//     arraySize++;
//    }
//    
//    inputFile.close();
//    
//    }
//    catch (FileNotFoundException e)
//    {
//        System.out.println("File not found");
//    }
//    
//    
//    return arraySize;
//    }
    
}
