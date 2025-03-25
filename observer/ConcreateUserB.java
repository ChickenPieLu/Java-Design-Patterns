package observer;

public class ConcreateUserB implements Observer{
    private String info = "no info now";
    private ConcreateSubject subject;

    public ConcreateUserB(ConcreateSubject subject){
        this.subject = subject;
    }

    public void update(){
        this.info = this.subject.getInformation();
        System.out.println("UserB recieved info: "+info);
    }
}
