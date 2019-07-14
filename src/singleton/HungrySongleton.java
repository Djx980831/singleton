package singleton;

public class HungrySongleton {

    private HungrySongleton() {
    }

    public static HungrySongleton single = new HungrySongleton();

    public static HungrySongleton getInstance(){
        return single;
    }

}
