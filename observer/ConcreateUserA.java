package observer;

public class ConcreateUserA implements Observer{
    private String info = "no info now";
    private ConcreateSubject subject;

    public ConcreateUserA(ConcreateSubject subject){
        this.subject = subject;
    }

    public void update(){
        this.info = this.subject.getInformation();
        System.out.println("UserA recieved info: "+info);
    }
}
