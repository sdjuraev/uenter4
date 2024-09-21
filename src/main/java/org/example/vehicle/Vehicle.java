package org.example.vehicle;

import org.example.vehicle.FuelType;

import java.util.Date;

public class Vehicle {
    public String name;
    public Date year;
    public String model;
    public String color;
    public FuelType fuelType;

    public Vehicle(){}
    public Vehicle(String name, Date year, String model, String color, FuelType fuelType) {
        this.name = name;
        this.year = year;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
    }

    public void run(){

    }

    @Override
    public String toString() {
        return "Model of vehicle:"+model +" color: "+color+"Fuel Type: "+fuelType;
    }
}
