package decorator;

public abstract class Decorator implements IIceCream{
    protected IIceCream iceCream;
    
    public Decorator(IIceCream iceCream){
        this.iceCream = iceCream;
    }

    public double cost(){
        return iceCream.cost();
    }

    public String description(){
        return ", None";
    }
}
