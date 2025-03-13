package com.pattern.abstractfactory;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Rendering a windows-style checkbox.");
    }
}
