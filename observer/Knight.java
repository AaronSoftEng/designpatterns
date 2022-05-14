package observer;

public class Knight implements Observer {
    private int warning;
    private Subject watchman;

    public Knight(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    public void update(int warning) {
        this.warning = warning;

        if(warning == 1) {
            System.out.println("Knight: Helps everyone get home safe");
        } else if (warning == 2) {
            System.out.println("Knight: Prepares for battle");
        } else {
            System.out.println("Unknown Warning.");
        }
    }
}
