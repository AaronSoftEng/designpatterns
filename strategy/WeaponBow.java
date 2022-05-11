package strategy;

public class WeaponBow implements WeaponBehavior {
    
    public String attack() {
        //Randomly returns one of possible strings
        String draw = "Draw and loose an arrow";
        String shoot = "Shoot arrow high in the sky";
        int low = 1;
        int high = 2;
        int rndm = (int)(Math.random() * (high - low + 1) + low);
        if (rndm == low) {
            return draw;
        } else {
            return shoot;
        }
    }
}
