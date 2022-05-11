package strategy;

public class King extends Character {
    
    public King(String name) {
        super(name);
        weaponBehavior = new WeaponSword();
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