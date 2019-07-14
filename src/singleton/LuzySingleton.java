package singleton;

public class LuzySingleton {

    private LuzySingleton() {
    }

    public static LuzySingleton single;

    public static LuzySingleton getInstance(){
        if(single == null){
            single = new LuzySingleton();
        }
       return single;
    }
}
