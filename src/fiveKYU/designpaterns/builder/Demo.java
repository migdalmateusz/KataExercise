package fiveKYU.designpaterns.builder;

import fiveKYU.designpaterns.builder.builders.CarBuilder;
import fiveKYU.designpaterns.builder.builders.CarManualBuilder;
import fiveKYU.designpaterns.builder.cars.Car;
import fiveKYU.designpaterns.builder.cars.Manual;
import fiveKYU.designpaterns.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
