package singleton;

public class HungrySingleton {

    private HungrySingleton() {
    }

    public static HungrySingleton single = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return single;
    }

}
