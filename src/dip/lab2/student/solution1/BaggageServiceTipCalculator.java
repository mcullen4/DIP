package dip.lab2.student.solution1;

import java.util.Scanner;

 

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator{
    
    Scanner keyboard = new Scanner (System.in); 
     
    private double tipRate;
    private double baseTipPerBag = 1.00;
    private int bagCount;
//    public enum ServiceQuality {
//        GOOD, FAIR, POOR
//    }
    private ServiceQuality serviceQuality;

    
    
    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);
        this.setBaseTipPerBag();
        this.setTipPercentage();
        
     
        
      
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables
        tip=baseTipPerBag * bagCount * (1+tipRate);
        return tip;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public int getBagCount() {
        return bagCount;
    }
    
 
    
//Changed the bag count edit to one - you wouldn't tip if they didn't carry any
    public final void setBagCount(int bagCount) {
        if(bagCount < 1) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to one");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    private void setBaseTipPerBag() {
        //This needs to be validated
        System.out.println("What would you like the base tip per bag to be?");
        baseTipPerBag = keyboard.nextDouble();
               
        
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        
    }

    
    
    
  
    private void setTipPercentage(){
        //tipRate needs to be validated
        System.out.println("You indicated the service quality was  "+
                serviceQuality+".  What percentage tip would you like to leave?");
        tipRate=keyboard.nextDouble();
    
    
    }
    
}
