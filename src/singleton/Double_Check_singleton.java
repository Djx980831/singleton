package singleton;

public class Double_Check_singleton {


    private Double_Check_singleton(){
    }

    public static Double_Check_singleton singleton;

    public static Double_Check_singleton getInstance(){
        if (singleton == null){
            synchronized (Double_Check_singleton.class){
                if(singleton == null){
                    singleton = new Double_Check_singleton();
                }
            }
        }
        return singleton;
    }
}

