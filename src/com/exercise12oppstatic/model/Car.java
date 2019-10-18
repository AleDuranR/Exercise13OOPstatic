package com.exercise12oppstatic.model;

public class Car {
	private String serialNumber;
	private static int numberDoors;
	private boolean isCoupe = false;
	private String brand;
	
	public Car() {
	}
	
	public Car(String serialNumber, int numberDoors, String brand) {
		this.serialNumber = serialNumber;
		this.numberDoors = numberDoors;
		this.brand = brand;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String SerialNumBber) {
		this.serialNumber = serialNumber;
	}
	
	public int getNumberDoors() {
		return numberDoors;
	}
	
	public void setNumberDoors(int numberDoors) {
		this.numberDoors = numberDoors;
	}
	
	public void CarIsCoupe(boolean isCoupe) {
		this.isCoupe = isCoupe;
		if(this.isCoupe) {
			this.numberDoors = 2;
		}
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String ToString() {
		return "Serial number: " + this.serialNumber+"  Number Doors "+numberDoors+ " Brand "+ brand;
	}
}
