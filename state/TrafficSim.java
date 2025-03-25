package state;

public class TrafficSim {
    private State light;

    public static void print(String message){
        System.out.println(message);
    }
    public TrafficSim(){
        this.light = new GreenLightState();
        print("Simulation started. Default Light: Green");
    }

    public void setState(State light){
        this.light = light;
    }

    public void changeLight(){
        light.handle(this);
    }
}
