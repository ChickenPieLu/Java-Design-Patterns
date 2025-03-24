package factoryMethod;

public class ConcreateFactory implements IFactory{
    private int counter;

    public ConcreateFactory(){
        this.counter = 0;
    }

    public ConcreatePhone createPhone(){
        if (counter > 3){
            counter = 0;
        }
        switch (counter) {
            case 0:
                counter++;
                return new ConcreatePhone("Iphone 15", 512,8);
            case 1:
                counter++;
                return new ConcreatePhone("Iphone 15 Plus", 512,8);
            case 2:
                counter++;
                return new ConcreatePhone("Iphone 15 Pro", 512,8);
            case 3:
                counter++;
                return new ConcreatePhone("Iphone 15 Pro Max", 512,8);
            default:
                return new ConcreatePhone("Iphone 15", 512,8);
        }
        
    }
}
