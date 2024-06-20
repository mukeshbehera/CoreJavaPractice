package com.pattern.strategy.WithStrategyPattern;

import com.pattern.strategy.WithStrategyPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
