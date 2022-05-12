/**
 * @author Aaron L. Keys
 */
package strategy;

public class King extends Character {
    /**
     * @param name is the name of the King
     */
    public King(String name) {
        super(name);
        weaponBehavior = new WeaponSword();
    }
    /**
     * @return The weapon attack of the King's sword.
     */
    public String attack() {
        return weaponBehavior.attack();
    }
    /**
     * @param wb is the type of weapon that will be used, such as a WeaponSword().
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