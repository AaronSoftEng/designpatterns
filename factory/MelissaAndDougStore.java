package factory;

public class MelissaAndDougStore extends ToyStore {

        public Puzzle createPuzzle(String type) {
        if(type == WoodAnimalPuzzle) {

        }
        return WoodColorPuzzle;
    }
}
