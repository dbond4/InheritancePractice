/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author F03 H4MM3R
 */
public class Employee {
    
    private String name;
    private String position;
    private int hireDate;
    private int age;
    
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
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the hireDate
     */
    public int getHireDate() {
        return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
}
