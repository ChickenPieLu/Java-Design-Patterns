package observer;
import java.util.*;

public class ConcreateSubject implements Subject{
    private List<Observer> userList = new ArrayList<>();
    private String information;

    public void addUser(Observer user){
        userList.add(user);
    }

    public void removeUser(Observer user){
        userList.remove(user);
    }

    public void notifyUsers(){
        for (Observer user: userList){
            user.update();
        }
    }

    public void changeInformation(String information){
        System.out.println("Subject information change: "+ information);
        this.information = information;
        notifyUsers();
    }

    public String getInformation(){
        return this.information;
    }
}
