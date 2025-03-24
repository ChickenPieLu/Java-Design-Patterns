package composite;

public class ToDo implements ToDoList{
    private String name;

    public ToDo(String name){
        this.name = name;
    }

    public String getTasks(){
        return name;
    }
}
