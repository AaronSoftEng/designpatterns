package strategy;

public abstract class Character {
    protected String name;
    protected WeaponBehavior weaponBehavior;

    public Character(String name) {
        this.name = name;
    }

    public abstract String attack();

    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }

    public abstract String toString();
}