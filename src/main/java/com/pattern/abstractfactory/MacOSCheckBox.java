package com.pattern.abstractfactory;

public class MacOSCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Rendering a MacOS-style checkbox.");
    }
}
