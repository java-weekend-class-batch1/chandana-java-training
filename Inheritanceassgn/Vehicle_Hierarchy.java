package com.training.Inheritanceassgn;


class Vehicle {
	    protected String make;
	    protected String model;
	    protected int year;

	    public Vehicle(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	    public String getDetails() {
	        return make + " " + model + " (" + year + ")";
	    }
	}

	class Car extends Vehicle {

	    private int seatingCapacity;

	    public Car(String make, String model, int year, int seatingCapacity) {
	        super(make, model, year);
	        this.seatingCapacity = seatingCapacity;
	    }

	    @Override
	    public String getDetails() {
	        return super.getDetails() + " | Seats: " + seatingCapacity;
	    }
	}

	class Truck extends Vehicle {

	    private double cargoCapacity;
	    public Truck(String make, String model, int year, double cargoCapacity) {
	        super(make, model, year);
	        this.cargoCapacity = cargoCapacity;
	    }

	    @Override
	    public String getDetails() {
	        return super.getDetails() + " | Cargo Capacity: " + cargoCapacity + " tons";
	    }
	}

	public class Vehicle_Hierarchy{
	    public static void main(String[] args) {
	        Vehicle[] vehicles = new Vehicle[3];

	        vehicles[0] = new Car("Toyota", "Innova", 2022, 7);
	        vehicles[1] = new Truck("Tata", "Ace", 2021, 1.5);
	        vehicles[2] = new Car("Hyundai", "i20", 2023, 5);

	        for (Vehicle v : vehicles) {
	            System.out.println(v.getDetails());
	        }
	    }
}