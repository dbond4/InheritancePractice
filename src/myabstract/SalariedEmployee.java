/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author F03 H4MM3R
 */
public class SalariedEmployee extends Employee{
    private int salaryPay;
    private int vacationDays;
    private int numYearsWorked;
    private String coolNickName;
    
    public void takeVacation(){
        System.out.println("See you in 2 weeks!");
    }
    public void attendMeeting(){
        System.out.println("Snooze time.");
    }
    public void pretendToWork(){
        System.out.println("15 minutes of real work.");
    }
    public void takeBreak(){
        System.out.println("How bout them Packers...");
    }

    /**
     * @return the salaryPay
     */
    public int getSalaryPay() {
        return salaryPay;
    }

    /**
     * @param salaryPay the salaryPay to set
     */
    public void setSalaryPay(int salaryPay) {
        this.salaryPay = salaryPay;
    }

    /**
     * @return the vacationDays
     */
    public int getVacationDays() {
        return vacationDays;
    }

    /**
     * @param vacationDays the vacationDays to set
     */
    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    /**
     * @return the numYearsWorked
     */
    public int getNumYearsWorked() {
        return numYearsWorked;
    }

    /**
     * @param numYearsWorked the numYearsWorked to set
     */
    public void setNumYearsWorked(int numYearsWorked) {
        this.numYearsWorked = numYearsWorked;
    }

    /**
     * @return the coolNickName
     */
    public String getCoolNickName() {
        return coolNickName;
    }

    /**
     * @param coolNickName the coolNickName to set
     */
    public void setCoolNickName(String coolNickName) {
        this.coolNickName = coolNickName;
    }
}
