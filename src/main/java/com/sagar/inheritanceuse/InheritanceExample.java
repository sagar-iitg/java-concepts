package com.sagar.inheritanceuse;

class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

class Audi extends Car {

    private String series;

    public Audi(String brand, String model, int year, String series) {
        super(brand, model, year);
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "series='" + series + '\'' +
                "} " + super.toString();
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota", "Camry", 2020);
        System.out.println("Car:");
        System.out.println(car);


        // Create an Audi object
        Audi audi = new Audi("Audi", "A4", 2021, "A4 Series");
        System.out.println("\nAudi:");
        System.out.println(audi);
    }
}
