package decorator;

public class ExtraBallDecorator extends Decorator{
    private IIceCream iceCream;
    private final double cost = 3.0;

    public ExtraBallDecorator(IIceCream iceCream){
        this.iceCream = iceCream;
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
