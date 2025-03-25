package observer;

public class TestObserver {
    public static void main(String[] args) {
        ConcreateSubject subject = new ConcreateSubject();
        subject.addUser(new ConcreateUserA(subject));
        subject.addUser(new ConcreateUserB(subject));
        subject.changeInformation("your vinagar my salt");
        subject.changeInformation("I am your father");
    }
}
