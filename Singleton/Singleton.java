package singleton;

public class Singleton{
    private static Singleton instance = null;
    private int data = 0;

    private Singleton(){
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        System.out.println("setting data to: " + data);
        this.data = data;
    }

    @Override
    public String toString(){
        return "data: " + data;
    }

}