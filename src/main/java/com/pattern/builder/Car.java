package com.pattern.builder;

public class Car {
    private final String engine;
    private final int wheels;
    private final String color;
    private final boolean sunroof;

    public Car(CarBuilder carBuilder) {
        this.engine = carBuilder.engine;
        this.wheels = carBuilder.wheels;
        this.color = carBuilder.color;
        this.sunroof = carBuilder.sunroof;
    }

    @Override
    public String toString() {
        return "Car{"
               + "engine='"
               + engine
               + '\''
               + ", wheels="
               + wheels
               + ", color='"
               + color
               + '\''
               + ", sunroof="
               + sunroof
               + '}';
    }

    // static nested builder class
    public static class CarBuilder {
        private final String engine;
        private final int wheels;
        private String color;
        private boolean sunroof;

        public CarBuilder(String engine, int wheels) { // required parameters
            this.engine = engine;
            this.wheels = wheels;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
