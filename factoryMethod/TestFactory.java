package factoryMethod;
import test.ATest;

public class TestFactory extends ATest{
    public static void main(String[] args) {
        ConcreateFactory A = new ConcreateFactory();
        ConcreatePhone a = A.createPhone();
        ConcreatePhone b = A.createPhone();
        ConcreatePhone c = A.createPhone();
        ConcreatePhone d = A.createPhone();
        print(a.toString()+b.toString()+c.toString()+d.toString());
    }
    
}
