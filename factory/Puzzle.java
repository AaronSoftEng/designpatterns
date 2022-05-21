package factory;

import java.util.*;

public class Puzzle {
    protected String name;
    protected String material;
    protected ArrayList<String> pieces;
    protected ArrayList<String> colors;
    public Puzzle() {
        
    }

    public String assemble() { //toString method
        String result = "";

        result += "Putting together a " + name + "\n" +
        "This puzzle is made out of  " + material + "\n" +
        "Adding the following pieces " + "\n";
        for(String piece: pieces) {
            result += piece + "\n";
        }
        return result;
    }

    public String boxPuzzle() {
        return "Putting the " + name + "in a box";
    }
}
