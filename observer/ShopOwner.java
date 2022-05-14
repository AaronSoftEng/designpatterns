package observer;

public class ShopOwner implements Observer {
    private int warning;
    private Subject watchman;

    public ShopOwner(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    public void update(int warning) {
        this.warning = warning;

        if(warning == 1) {
            System.out.println("ShopOwner: Close down shop and head home");
        } else if (warning == 2) {
            System.out.println("ShopOwner: Drops everything and find nearest hideout");
        } else {
            System.out.println("Unknown Warning.");
        }
    }
}
