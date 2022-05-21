package factory;

public abstract class ToyStore extends Puzzle {
    
    public String orderPuzzle(String type) {
        Puzzle newPuzzle = createPuzzle(type);
        assemble();
        bo
        return newPuzzle.;
    }

    public abstract Puzzle createPuzzle(String type);
}
