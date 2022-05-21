package factory;

public class PlasticAnimalPuzzle extends Puzzle {
    
    public PlasticAnimalPuzzle() {
        this.name = "Animal Puzzle by Fisher Price";
        this.material = "plastic";
        this.pieces.add("Fox");
        this.pieces.add("Elephant");
        this.pieces.add("Giraffe");
        this.pieces.add("Owl");
        this.pieces.add("Monkey");
    }
}
