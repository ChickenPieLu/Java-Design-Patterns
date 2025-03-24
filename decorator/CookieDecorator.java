package decorator;
//concreate decorator
public class CookieDecorator extends Decorator{
    private IIceCream iceCream;
    private final double cost = 1.0;

    public CookieDecorator(IIceCream iceCream){
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
