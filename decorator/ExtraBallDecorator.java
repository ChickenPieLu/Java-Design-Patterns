package decorator;

public class ExtraBallDecorator extends Decorator{

    private final double cost = 3.0;

    public ExtraBallDecorator(IIceCream iceCream){
        super(iceCream);
    }

    @Override
    public double cost(){
        return cost + iceCream.cost();
    }

    @Override
    public String description(){
        return iceCream.description() + ", Extra Ball";
    }
}
