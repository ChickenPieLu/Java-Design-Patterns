package composite;
import test.ATest;
import java.util.*;

public class TestComposite extends ATest{
    public static void main(String[] args) {
        List<ToDoList> totalList = new ArrayList<ToDoList>();
        //adding a project
        List<ToDoList> cookingList = new ArrayList<>();
        cookingList.add(new ToDo("learn pizza"));
        cookingList.add(new ToDo("learn pasta"));
        cookingList.add(new ToDo("learn jiaozi"));
        cookingList.add(new ToDo("learn noodle"));
        ToDoList cook = new Project("Cooking",cookingList);
        //adding some other todos
        totalList.add(cook);
        totalList.add(new ToDo("learn Japanese"));
        totalList.add(new ToDo("learn Fanch"));
        //putting them into the outest project
        ToDoList p = new Project("TO-DO-LIST", totalList);
        /*Should look like
         * Project TO-DO-LIST:
         * Project Cooking:
         * learn pizza
         * learn pasta
         * learn jiaozi
         * learn noodle
         * End of Project Cooking
         * learn Japanese
         * learn Franch
         * End of Project TO-DO-LIST
         */
        print(p.getTasks());
    }
}
