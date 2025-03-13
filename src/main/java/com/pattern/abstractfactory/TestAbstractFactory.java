package com.pattern.abstractfactory;

/**
 * Abstract Factory Pattern
 *
 * <p>
 * The Abstract Factory Pattern is a creational design pattern that lets you
 * produce families of related objects without specifying their concrete
 * classes.
 * <p>
 * The Abstract Factory Pattern is a good alternative to the Factory Method.
 * Usage: GUI toolkits (e.g., Swing or AWT).
 */
public class TestAbstractFactory {
    public static void main(String[] args) {

        // use windows factory
        GUIFactory windowsFactory = new WindowsFactory();
        Application windowsApp = new Application(windowsFactory);
        System.out.println("Windows UI:");
        windowsApp.renderUI();

        System.out.println();

        // use macos factory
        GUIFactory macosFactory = new MacOSFactory();
        Application macosApp = new Application(macosFactory);
        System.out.println("MacOS UI:");
        macosApp.renderUI();
    }
}

/*
 * output:
 * Windows UI:
 * Rendering a Windows-style button.
 * Rendering a Windows-style checkbox.
 * MacOS UI:
 * Rendering a MacOS-style button.
 * Rendering a MacOS-style checkbox.
 */
