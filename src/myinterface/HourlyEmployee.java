/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author F03 H4MM3R
 */
public class HourlyEmployee implements Employee{
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
}
