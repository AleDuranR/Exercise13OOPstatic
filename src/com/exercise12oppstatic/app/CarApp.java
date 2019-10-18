package com.exercise12oppstatic.app;

import com.exercise12oppstatic.model.Car;
public class CarApp {

	public static void main(String[] args) {
		Car carIvan = new Car();
		Car carUriel = new Car();
		Car carPablo = new Car();
		Car carJorge = new Car();
		Car carDaniel = new Car();
		Car carManuel = new Car();
		
		carIvan.setSerialNumber("1");
		carIvan.setNumberDoors(4);
		carIvan.setBrand("Volvo");
		
		carUriel.setSerialNumber("2");
		carUriel.setNumberDoors(4);
		carUriel.setBrand("Volvo");
		
		carPablo.setSerialNumber("3");
		carPablo.setNumberDoors(4);
		carPablo.setBrand("Volvo");
		
		carJorge.setSerialNumber("4");
		carJorge.setNumberDoors(4);
		carJorge.setBrand("Honda");
		
		carDaniel.setSerialNumber("5");
		carDaniel.setNumberDoors(4);
		carDaniel.setBrand("Honda");
		
		carManuel.setSerialNumber("5");
		carManuel.setNumberDoors(4);
		carManuel.setBrand("Honda");
		
		System.out.println(carIvan.ToString());
		System.out.println(carUriel.ToString());
		System.out.println(carPablo.ToString());
		System.out.println(carJorge.ToString());
		System.out.println(carDaniel.ToString());
		System.out.println(carManuel.ToString());
		carIvan.CarIsCoupe(true);
		System.out.println(carIvan.ToString());
		System.out.println(carUriel.ToString());
		System.out.println(carPablo.ToString());
		System.out.println(carJorge.ToString());
		System.out.println(carDaniel.ToString());
		System.out.println(carManuel.ToString());
		
	}

}
