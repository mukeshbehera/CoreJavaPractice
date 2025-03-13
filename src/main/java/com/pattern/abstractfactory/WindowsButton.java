package com.pattern.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a windows-style button.");
    }
}
