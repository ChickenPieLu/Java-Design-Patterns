package factoryMethod;

public class ConcreatePhone extends IPhone{
    public ConcreatePhone(String name, int storage, int memory){
        this.name = name;
        this.storage = storage;
        this.memory = memory;
    }
}
