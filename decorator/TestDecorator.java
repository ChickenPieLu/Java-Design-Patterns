package decorator;
import test.ATest;

public class TestDecorator extends ATest{
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateIceCream();
        iceCream = new CookieDecorator(iceCream);
        print(iceCream.description() + "\n Cost: " + iceCream.cost());
        iceCream = new ExtraBallDecorator(iceCream);
        print(iceCream.description() + "\n Cost: " + iceCream.cost());
    }
}
