package activities;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car(String color, String transmission, int make){
		this.color = color;
		this.transmission = transmission;
		this.tyres = 4;
		this.doors = 4;
		this.make = make;
	}
	
	public void displayCharacteristics() {
		System.out.println("color: " +color);
		System.out.println("transmission: " +transmission);
		System.out.println("year of make: " +make);
		System.out.println("No. of tyres: " +tyres);
		System.out.println("No. of doors: " +doors);
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward");
	}
	
	public void brake() {
		System.out.println("Car is stopped");
	}

}
