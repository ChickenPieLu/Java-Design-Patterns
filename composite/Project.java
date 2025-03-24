package composite;
import java.util.List;

public class Project implements ToDoList{
    private String title;
    private List<ToDoList> list;

    public Project(String title, List<ToDoList> list){
        this.title = title;
        this.list = list;
    }

    public String getTasks(){
        String result = "Project "+title+": \n";
        for (ToDoList ls: list){
            result += ls.getTasks() + "\n";
        }
        result += "End of Project " + title;
        return result;
    }
}
