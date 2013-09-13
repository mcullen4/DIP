package dip.lab1.student.solution1;

import dip.lab1.student.solution1.HRService.WageType;

/**
 * This was modified to make Employee an interface - all methods but 
 * the common method were deleted from here and put in their respective
 * classes
 *
 * Michele Cullen
 */
public interface Employee {
    

    public abstract double getAnnualCompensation();
    public abstract WageType getWageType();

}
