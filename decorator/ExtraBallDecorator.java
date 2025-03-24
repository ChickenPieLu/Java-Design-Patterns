package decorator;
//Concreate Decorator
public class ExtraBallDecorator extends Decorator{
    private IceCream iceCream;
    private final double cost = 3.0;

    public ExtraBallDecorator(IceCream iceCream){
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
