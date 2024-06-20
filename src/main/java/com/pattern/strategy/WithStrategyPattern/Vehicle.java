package com.pattern.strategy.WithStrategyPattern;

import com.pattern.strategy.WithStrategyPattern.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy obj){
        this.driveStrategy = obj;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
