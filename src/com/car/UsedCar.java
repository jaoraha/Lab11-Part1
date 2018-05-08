package com.car;

public class UsedCar extends Car {
	private double mileage;

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
	}

	public double getMileage() {
		return mileage;
	}

	public UsedCar(double mileage) {
		super();
		this.mileage = mileage;
	}

		@Override
		public String toString() {
			return String.format("%-10s %-10s %-10s $%.2f", make, model, year, price, mileage);
	}
		
	}

