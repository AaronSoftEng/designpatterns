package factory;

public class FisherPriceStore extends ToyStore {
    
    /**
     * If the user passes in color it will return a PlasticColorPuzzle,
     * If the user passes in animal it will return a PlasticAnimalPuzzle
     * Otherwise null
     * @param type
     * @return
     */
    public Puzzle createPuzzle(String type) {
        if(type == PlasticColorPuzzle)
        return PlasticColorPuzzle
    }
}
