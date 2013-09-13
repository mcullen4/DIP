package dip.lab1.student.solution1;

import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @Michele Cullen
 */
public class HRService {
    
    
    public enum WageType {
        SALARIED,
        HOURLY
    }

    

    /**
     * This is a truly horrible way to make decisions. Very rigid and fragile!
     * @param e - an employee object (not truly polymorphic!)
     * employeeType - a String identifying the employee type. A constant
     * (see above) should be used for this, but can you guarantee it will be?
     * Are there other options? Hint: enum
     * @return the annual compensation for supported employee types
     */
    public double getAnnualCompensationForEmployee(Employee e)
    {
        double annualCompensation=e.getAnnualCompensation();
        return annualCompensation;
    }


    public WageType getWageType(Employee e)
    {
        WageType wageType = e.getWageType();
        return wageType;
    }
    
}
