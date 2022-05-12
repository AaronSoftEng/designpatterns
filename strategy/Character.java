/**
 * @author Aaron L. Keys
 */
package strategy;

public abstract class Character {
    protected String name;
    protected WeaponBehavior weaponBehavior;

    /**
     * @param name is the name of the character.
     */
    public Character(String name) {
        this.name = name;
    }

    /**
     * @return The weapon attack of the specified character.
     */
    public abstract String attack();

    /**
     * @param wb is the type of weapon that will be used, such as WeaponSword().
     */
    public abstract void setWeaponBehavior(WeaponBehavior wb);

    /**
     * @return The name and type of character.
     */
    public abstract String toString();
}