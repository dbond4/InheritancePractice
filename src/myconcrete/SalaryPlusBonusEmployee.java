/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author F03 H4MM3R
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private int bonus;
    public void quarterlyBonus(){
        System.out.println("Clark gets a swimming pool!");
    }

    /**
     * @return the bonus
     */
    public int getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
