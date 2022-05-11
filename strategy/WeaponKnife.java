package strategy;

public class WeaponKnife implements WeaponBehavior {
    public String attack() {
        //Randomly returns one of possible strings
        String slice = "Slice with knife";
        String jab = "Jab with a knife";
        String sneak = "Sneak up on opponent with knife";
        int low = 1;
        int high = 3;
        int rndm = (int)(Math.random() * (high - low + 1) + low);
        
        if (rndm == low) {
            return slice;
        } else if (rndm == high) {
            return sneak;
        } else {
            return jab;
        }
    }
}
