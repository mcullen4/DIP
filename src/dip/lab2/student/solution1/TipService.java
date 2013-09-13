/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Michele
 */
public class TipService {
    
    private TipCalculator tipCalculator;
    
      
    public TipService(TipCalculator t){
    tipCalculator = t;
    }
    public double getTip(){
        return tipCalculator.getTip();
    }
       
    public double getTip(TipCalculator t){
        return t.getTip();
    }
}
