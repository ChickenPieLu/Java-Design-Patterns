package decorator;
//concreate component
public class ChocolateIceCream implements IIceCream{
    private final double COST = 10.0;

    public double cost(){
        return COST;
    }

    public String description(){
        return "Chocolate Ice Cream";
    }
}
