package state;

public class RedLightState implements State{
    public void handle(TrafficSim sim){
        System.out.println("Red Light is on. Vehicles waiting...");
        State nextState = new GreenLightState();
        sim.setState(nextState);
        System.out.println("Next upcomming light is: " + nextState);
    }

    public String toString(){
        return "Red Light";
    }
}
