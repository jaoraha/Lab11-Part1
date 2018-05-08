package com.car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Grand Circus Motors admin console!");

		int numCars = Validator.getInt(scan, "How many cars are you entering: ");
		
		int counter = 1;
		int counter2 = 1;

		ArrayList<Car> carList = new ArrayList<>();

		for (int i = 0; i < numCars; i++) {
			String make = Validator.isEmpty(scan, "Enter Car #" + counter + " Make: ");
			String model = Validator.isEmpty(scan, "Enter Car #" + counter + " Model: ");
			int year = Validator.getInt(scan, "Enter Car #" + counter + " Year: ", 1886, 2018);
			double price = Validator.getDouble(scan, "Enter Car #" + counter + " Price: ");
			carList.add(new Car(make, model, year, price));
			counter++;
		}

		System.out.println("Current Inventory:");
		for (int i = 0; i < numCars; i++) {
			counter2++;
			System.out.println(counter2 - 1 + ". " + carList.get(i));
		}

	}

}
