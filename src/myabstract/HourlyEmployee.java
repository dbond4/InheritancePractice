/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author F03 H4MM3R
 */
public class HourlyEmployee extends Employee{
    
    private int hourlyPay;
    public void payEmployee(){
        System.out.println("Dollar Dollar Bill YO!");
    }
    public void getPromoted(){
        System.out.println("GOOD JOB, you're promoted!");
    }

    /**
     * @return the hourlyPay
     */
    public int getHourlyPay() {
        return hourlyPay;
    }

    /**
     * @param hourlyPay the hourlyPay to set
     */
    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
}
