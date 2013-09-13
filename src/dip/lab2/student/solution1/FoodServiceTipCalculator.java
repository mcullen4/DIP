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
public class FoodServiceTipCalculator implements TipCalculator {
    
    Scanner keyboard = new Scanner(System.in);
    
    private static final double MIN_BILL = 0.00;
  
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    

    private double bill;
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;
    
    private double tipRate;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
        this.setTipPercentage();    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        tip = bill * tipRate;
        
        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    
    private void setTipPercentage(){
        //tipRate needs to be validated
        System.out.println("You indicated the service quality was  "+
                serviceQuality+".  What percentage tip would you like to leave?");
        tipRate=keyboard.nextDouble();
    
    
    }
}
