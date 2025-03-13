package com.pattern.abstractfactory;

public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a MacOS-style button.");
    }
}
