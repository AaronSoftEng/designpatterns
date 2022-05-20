package decorator;

public class Vanilla extends ScoopDecorator {

    public Vanilla(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "vanilla";
        this.flavorCost = 1.25;
    }

    public String toString() {
        if(this.numScoops == 1) {
            return iceCream.toString() + " a scoop of " + flavor + " ice cream, ";
        } else {
            return iceCream.toString() + numScoops + " scoops of " + flavor + " ice cream, ";
        }
        
    }
    public double getCost() {
        return iceCream.getCost() + flavorCost * numScoops;
    }
}
