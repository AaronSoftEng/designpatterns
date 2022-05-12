/**
 * @author Aaron L. Keys
 */
package strategy;

public class Troll extends Character {
    /**
     * @param name is the name of the Troll
     */
    public Troll(String name) {
        super(name);
        weaponBehavior = new WeaponAxe();
    }
    /**
     * @return The weapon attack of the Troll's knife.
     */
    public String attack() {
        return weaponBehavior.attack();
    }
    /**
     * @param wb is the type of weapon that will be used, such as a WeaponAxe().
     */
    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }
    /**
     * @return The name and type of character.
     */
    public String toString() {
        return this.name + " is a Noble King";
    }
}
