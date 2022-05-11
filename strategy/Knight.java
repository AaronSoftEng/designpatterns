package strategy;

public class Knight extends Character {
    
    public Knight(String name) {
        super(name);
        weaponBehavior = new WeaponBow();
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
