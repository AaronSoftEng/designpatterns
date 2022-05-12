/**
 * @author Aaron L. Keys
 */
package strategy;

public class Queen extends Character {
    /**
     * @param name is the name of the Queen
     */
    public Queen(String name) {
        super(name);
        weaponBehavior = new WeaponKnife();
    }
    /**
     * @return The weapon attack of the Queen's knife.
     */
    public String attack() {
        return weaponBehavior.attack();
    }
    /**
     * @param wb is the type of weapon that will be used, such as a WeaponKnife().
     */
    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }
    /**
     * @return The name and type of character.
     */
    public String toString() {
        return this.name + " is a beautiful queen";
    }
}
