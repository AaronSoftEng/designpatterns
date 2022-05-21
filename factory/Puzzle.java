package factory;

import java.util.*;

public class Puzzle {
    protected String name;
    protected String material;
    protected ArrayList<String> pieces;

    public String assemble() {
        return  "putting together a " + name + "\n" +
                "This puzzle is made out of  " + material + "\n" +
                "Adding the following pieces " + pieces.toString();
    }

    public String boxPuzzle() {
        return "putting the " + name + "in a box";
    }
}
