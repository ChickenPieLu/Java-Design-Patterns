package singleton;
import test.ATest;

public class TestSingleton extends ATest{
    public static void main(String[] args) {
        Singleton.getInstance();
        print(Singleton.getInstance().toString());
        Singleton.getInstance().setData(100);
        print(Singleton.getInstance().toString());
    }
}
