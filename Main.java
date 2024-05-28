package org.vehicles;

public class Main {
	public static void main(String[] args) {
		System.out.println("Vehicle Information");
		Vehicle vehicle = new Vehicle("Black", "Toyoto", "Camry", 2000);
		vehicle.info();
		System.out.println();
		
		System.out.println("Car Information");
		Car car = new Car("White", "Honda", "Civic", 2001, 4, "Automatic");
		car.info();
		System.out.println();
		
		System.out.println("Truck Information");
		Truck truck = new Truck("Orange", "Ford", "F-150", 2002, 4, 1000);
		truck.info();
		System.out.println();
		
		System.out.println("ElectricCar Information");
		ElectricCar ele  = new  ElectricCar("Blue", "Tesla", "Model S", 2003, 4, "Automatic", 100.00, 200.00);
	    ele.info();	
	    System.out.println();
	    
	    System.out.println("GasolineCar Information");
	    GasolineCar gas = new GasolineCar("Red", "Chevrolet", "Malibu", 2004, 4, "Manual", 20.00, 25.00);
	    gas.info();
	    System.out.println();
	}
 
}

 class Vehicle {
	String color;
	String make;
	String model;
	int year;
	
	public Vehicle (String color, String make, String model, int year) {
		this.color = color; 
		this.make = make;
		this.model = model;
		this.year = year;
		
	}
		
	 public void info () {
			System.out.println("Color : "+color + ",  Make :"+make +",  Model : "+model +",  Year : "+year);			
		}
	}

class Car extends Vehicle {
	int numDoors;
	String transmissionType;
	
	public Car (String color, String make, String model, int year, int numDoors,String transmissionType ) {
		super(color, make, model,  year);
		this.numDoors = numDoors;
		this.transmissionType = transmissionType;
		
	}
	@Override
	public void info ()  {
		System.out.println("color :"+color + ",  Make :"+make +",  Model : "+model +",  Year : "+year +",  NoOfDoors : "+numDoors +", TransmissionType : "+transmissionType);

	}
}

class Truck extends Vehicle {
	int bedSize;
	int towingCapacity;
	
	public Truck (String color, String make, String model, int year, int bedSize, int towingCapacity ) {
		super(color, make, model,  year);
		this.bedSize = bedSize;
		this.towingCapacity = towingCapacity;
	}
	
	@Override
	public void info () {
		System.out.println("color :"+color+  ",  make :"+make+  ",  model :"+model+  "year :"+year+ ",  bedSize :"+bedSize+ ",  towingCapacity :"+towingCapacity );
		
	}
}
class ElectricCar extends Car {
	double batteryCapacity;
	double range;
	
	public ElectricCar(String color, String make, String model, int year, int numDoors,String transmissionType, double batteryCapacity, double range ) {
		super( color,  make,  model,  year, numDoors, transmissionType );
		this.batteryCapacity=batteryCapacity;
		this.range=range;
	}
	@Override
	public void info() {
		System.out.println ("color :"+color+ ",  make :"+make+  ",  model :"+model+  ",  year :"+year+  ",  NumDoors :"+numDoors+ ",  TransmissionType :"+transmissionType+ ",  batteryCapacity :"+batteryCapacity+ ",  Range :"+range);
		
	}
}

class GasolineCar extends Car {
	double fuelCapacity;
	double mpg;
	
	public GasolineCar(String color, String make, String model, int year, int numDoors, String transmissionType, double fuelCapacity, double mpg) {
		super( color,  make,  model,  year,  numDoors, transmissionType);
		this.fuelCapacity=fuelCapacity;
		this.mpg=mpg;
	}
	
	@Override
	public void info ()  {
		System.out.println("color :"+color+ ",  make :"+make+ ",  model :"+model+ ",  year :"+year+ ",  numDoors :"+numDoors+ ",  transmissionType :"+transmissionType+ ",  mpg :"+mpg );
		
	}
	
}


