/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author F03 H4MM3R
 */
public class SalariedEmployee implements Employee{
    public void fireEmployee(){
        System.out.println("YOUR FIRED!!");
    }
    public void hireEmployee(){
        System.out.println("Your hired, gab a seat.");
    }
    public void getCoffee(){
        System.out.println("Get me a coffee, cream, no sugar.");
    }
    public void takeMemo(){
        System.out.println("Write this down.");
    }
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
}
