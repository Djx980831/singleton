package singleton;

public class StaticSingleton {
    private StaticSingleton(){
    }

    private static class Singleton{
        static StaticSingleton singleton = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return Singleton.singleton;
    }

}
