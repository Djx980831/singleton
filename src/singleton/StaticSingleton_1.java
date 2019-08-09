package singleton;

public class StaticSingleton_1 {
    private StaticSingleton_1(){}

    private static StaticSingleton_1 singleton_1 = null;

    static {
        singleton_1 = new StaticSingleton_1();
    }

    public static StaticSingleton_1 getInstance_1(){
        return singleton_1;
    }

}
