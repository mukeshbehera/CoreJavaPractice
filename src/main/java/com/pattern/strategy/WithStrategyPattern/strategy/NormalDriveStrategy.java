package com.pattern.strategy.WithStrategyPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
