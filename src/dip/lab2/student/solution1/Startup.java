package dip.lab2.student.solution1;

// An useful import if you need it.
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Scanner;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
    
       
    
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
 
    public static void main(String[] args) {
        
        
       Scanner keyboard = new Scanner (System.in); 
       
        
        
        
//       TipCalculator service = new BaggageServiceTipCalculator(
//                BaggageServiceTipCalculator.ServiceQuality.FAIR,5);
                
       TipCalculator service = new FoodServiceTipCalculator
               (FoodServiceTipCalculator.ServiceQuality.GOOD,25.00); 
       
       
      TipService ts = new TipService();
      
      System.out.println("The tip should be " + ts.getCalculatedTip(service) + ".");
        
    }
    
    

}
