package decorator;

public class CookieDecorator extends Decorator{
    private final double cost = 1.0;

    public CookieDecorator(IIceCream iceCream){
        super(iceCream);
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
