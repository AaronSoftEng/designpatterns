package strategy;

public class Troll extends Character {

    public Troll(String name) {
        super(name);
        weaponBehavior = new WeaponAxe();
    }

    public String attack() {
        return weaponBehavior.attack();
    }

    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }
    public String toString() {
        return this.name + " is a Noble King";
    }
}
