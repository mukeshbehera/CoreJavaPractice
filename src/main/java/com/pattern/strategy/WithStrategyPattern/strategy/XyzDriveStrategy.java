package com.pattern.strategy.WithStrategyPattern.strategy;

public class XyzDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("XYZ Drive Capability");
    }
}
