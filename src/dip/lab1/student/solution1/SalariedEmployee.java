package dip.lab1.student.solution1;

import dip.lab1.student.solution1.HRService.WageType;

/**
 * A subclass of Employee
 *
 * Michele Cullen
 */
public class SalariedEmployee implements Employee {
    
    private final WageType WAGE_TYPE;
    
    private double annualSalary;
    private double annualBonus;

    /** default constructor notes - I removed the default constructor because
     * by forcing the data which all employees would have at hire, it eliminates
     * the need for verification of completion of this information. 
     */
    

    /**
     * Convenience constructor. I added the wageType variable to the constructor
     
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
        WAGE_TYPE=WageType.SALARIED;
    }
    
    @Override
   public double getAnnualCompensation(){
     double annualCompensation = annualSalary+annualBonus;  
      
   return annualCompensation;
   }
   
    @Override
   public WageType getWageType(){
       return WAGE_TYPE;
   }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
    
    
   }
    
