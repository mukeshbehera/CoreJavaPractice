package com.pattern.strategy.WithStrategyPattern;

import com.pattern.strategy.WithStrategyPattern.strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
