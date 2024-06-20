package com.pattern.strategy.WithStrategyPattern.strategy;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special Drive Capability");
    }
}
