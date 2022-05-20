package decorator;

public class Chocolate extends ScoopDecorator {
    
    public Chocolate(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "chocolate";
        this.flavorCost = 1.5;
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
