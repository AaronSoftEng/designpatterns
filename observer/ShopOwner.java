package observer;

public class ShopOwner implements Observer {
    private int warning;
    private Subject watchman;

    public ShopOwner(Observer observer) {
        this.watchman = observer;
    }

    public void update(int warning) {
        this.warning = warning;
    }
}
