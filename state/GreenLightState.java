package state;

public class GreenLightState implements State{
    public void handle(TrafficSim sim){
        System.out.println("Green Light is on. Vehicles passing...");
        State nextState = new YellowLightState();
        sim.setState(nextState);
        System.out.println("Next upcomming light is: " + nextState);
    }

    public String toString(){
        return "Green Light";
    }
}
