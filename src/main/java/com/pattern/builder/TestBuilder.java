package com.pattern.builder;

public class TestBuilder {
    public static void main(String[] args) {

        // Build a car with required(engine and wheels) and optional parameters
        Car car1 = new Car.CarBuilder("V8", 4).setColor("Black")
                                              .setSunroof(true)
                                              .build();

        System.out.println(car1);

        // Build a car with required(engine and wheels) and optional parameters
        Car car2 = new Car.CarBuilder("V6", 4).setColor("Red")
                                              .setSunroof(false)
                                              .build();

        System.out.println(car2);
    }
}

/*
 *  output:
 *  Car{engine='V8', wheels=4, color='Black', sunroof=true}
 *  Car{engine='V6', wheels=4, color='Red', sunroof=false}
 */
