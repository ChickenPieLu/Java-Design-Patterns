package state;

public class YellowLightState implements State{
    public void handle(TrafficSim sim){
        System.out.println("Yellow Light is on. Vehicles stopping...");
        State nextState = new RedLightState();
        sim.setState(nextState);
        System.out.println("Next upcomming light is: " + nextState);
    }

    public String toString(){
        return "Yellow Light";
    }
}
