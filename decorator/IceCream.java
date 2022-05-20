package decorator;

public abstract class IceCream {

    protected String description;
    protected double cost = 0.0;

    public String toString() {
        return description;
    }

    public abstract double getCost();
}