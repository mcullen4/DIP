/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Michele
 */
public class KeyboardInput implements MessageInput {
    
    Scanner keyboard = new Scanner(System.in);
    
    private String message;
    
    @Override
    public String getMessage(){
        System.out.println ("Enter your daily tip now.");
        message=keyboard.next();
        if(message == null){
        message="I guess there won't be a daily tip today";
    }
        return message;
    }

    
    
    
    
}
