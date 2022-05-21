package factory;

public abstract class ToyStore extends Puzzle {
    
    public String orderPuzzle(String type) {
        Puzzle newPuzzle = createPuzzle(type);
        newPuzzle.assemble();
        newPuzzle.boxPuzzle();
        return newPuzzle.pieces.toString();
    }

    public abstract Puzzle createPuzzle(String type);
}
