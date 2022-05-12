/**
 * @author Aaron L. Keys
 */
package strategy;

public class Knight extends Character {
    /**
     * @param name is the name of the Knight
     */
    public Knight(String name) {
        super(name);
        weaponBehavior = new WeaponBow();
    }
    /**
     * @return The weapon attack of the Knight's Bow.
     */
    public String attack() {
        return weaponBehavior.attack();
    }
    /**
     * @param wb is the type of weapon that will be used, such as a WeaponBow().
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
