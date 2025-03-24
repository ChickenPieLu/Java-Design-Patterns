package decorator;
//concreate decorator
public class CookieDecorator extends Decorator{
    private IceCream iceCream;
    private final double cost = 1.0;

    public CookieDecorator(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public double cost(){
        return cost + iceCream.cost();
    }

    @Override
    public String description(){
        return iceCream.description() + ", Cookie";
    }
}
