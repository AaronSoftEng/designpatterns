package decorator;

public class Bowl extends IceCream {
    
    public Bowl() {
        //The cost isn't increased, so no change to the cost is made.
        this.description = "Bowl";
    }

    public String toString() {
        return this.description + ",";
    }
    public double getCost() {
       return this.cost;
    }
}
