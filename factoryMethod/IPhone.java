package factoryMethod;

public abstract class IPhone {
    protected String name;
    protected int storage;
    protected int memory;

    public String getName(){
        return name;
    }

    public int getStorage(){
        return storage;
    }

    public int getMemory(){
        return memory;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStorage(int storage){
        this.storage = storage;
    }

    public void setMemory(int memory){
        this.memory = memory;
    }

    public String toString(){
        return ("Phone:" + name + "Storage:" + storage + "Memory:" + memory);
    }
}

