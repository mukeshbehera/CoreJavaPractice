package com.pattern.strategy.WithStrategyPattern;

import com.pattern.strategy.WithStrategyPattern.strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
