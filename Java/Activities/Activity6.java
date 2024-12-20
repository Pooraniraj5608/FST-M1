package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane{
	
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTakeOffTime;
	private Date lastLandingTime;
	
	public Plane(int maxPassengers){
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<String>();
	}
	
	public void onboard(String passenger) {
        this.passengers.add(passenger);
    }

    public Date takeOff() {
        this.lastTakeOffTime = new Date();
        return lastTakeOffTime;
    }

    public void land() {
        this.lastLandingTime = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return this.lastLandingTime;
    }

    public List<String> getPassengers() {
        return this.passengers;
    }
	
}


public class Activity6 {
	
	public static void main(String[] args) throws InterruptedException {
		
        Plane b747 = new Plane(10);
        //Add passengers on the list
        b747.onboard("John");
        b747.onboard("Steve");
        b747.onboard("Anna");
        
        //Plane takes off
        System.out.println("Plane took off at: " + b747.takeOff());
        
        //Print list of people on board
        System.out.println("People on the plane: " + b747.getPassengers());
        
        //Flying.....
        Thread.sleep(5000);
        
        //Plane has landed
        b747.land();
        
        //Plane lands
        System.out.println("Plane landed at: " + b747.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + b747.getPassengers());
    }

	}


