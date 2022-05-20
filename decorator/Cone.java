package decorator;

public class Cone extends IceCream {
    private ConeType coneType;
    
    public Cone(ConeType coneType) {
        this.coneType = coneType;
        if(this.coneType == ConeType.WAFFLE_CONE) {
            this.cost = cost + 1.2;
            this.description = ConeType.WAFFLE_CONE.toString().toLowerCase().replace('_', ' ');
        } else if (this.coneType == ConeType.SUGAR_CONE) {
            this.cost = cost + .75;
            this.description = ConeType.SUGAR_CONE.toString().toLowerCase().replace('_', ' ');

        } else if (this.coneType == ConeType.CHOCOLATE_DIPPED_CONE) {
            this.cost = cost + 1.5;
            this.description = ConeType.CHOCOLATE_DIPPED_CONE.toString().toLowerCase().replace('_', ' ');
        } else {
            this.cost = cost + 1.8;
            this.description = ConeType.PRETZEL_CONE.toString().toLowerCase().replace('_', ' ');
        }
        
    }
    public String toString() {

        return this.description + ", ";
    }

    public double getCost() {
        return this.cost;
    }
}
