package dip.lab1.student.solution1;

import dip.lab1.student.solution1.HRService.WageType;

/**
 * An implementation sub-class of an Employee. 
 *
 * @Michele Cullen
 */
public class HourlyEmployee implements Employee {
    
    private final WageType WAGE_TYPE;
    
    private double hourlyRate;
    private double totalHrsForYear;
    
    
    /** default constructor. I removed the default constructor   /**
     * Convenience constructor. 
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     * @param WAGE_TYPE = type of wages paid to employee
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        this.hourlyRate=hourlyRate;
        this.totalHrsForYear=totalHrsForYear;
        WAGE_TYPE=WageType.HOURLY;
    }

    @Override
    public double getAnnualCompensation(){
    double annualCompensation = hourlyRate*totalHrsForYear;
    
    return annualCompensation;
    }
    
    @Override
    public WageType getWageType(){
        return WAGE_TYPE;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }
    
    
}
