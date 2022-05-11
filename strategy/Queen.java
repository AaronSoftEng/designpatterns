package strategy;

public class Queen extends Character {
    
    public Queen(String name) {
        super(name);
        weaponBehavior = new WeaponKnife();
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
