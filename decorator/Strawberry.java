package decorator;

public class Strawberry extends ScoopDecorator {
    
    public Strawberry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "strawberry";
        this.flavorCost = 1.4;
    }

    public String toString() {
        if(this.numScoops == 1) {
            return iceCream.toString() + "a scoop of " + flavor + " ice cream";
        } else {
            return iceCream.toString() + numScoops + " scoops of " + flavor + " ice cream";
        }
    }
    public double getCost() {
        return iceCream.getCost() + flavorCost * numScoops;
    }
}
