package com.pattern.factory;

public class Factory2 {

    public static void main(String[] args) {
        Computer laptop = ComputerFactory.getComputer("laptop");
        laptop.assemble();

        Computer desktop = ComputerFactory.getComputer("desktop");
        desktop.assemble();
    }
}

interface Computer{
    void assemble();
}

class Laptop implements Computer{
    @Override
    public void assemble() {
        System.out.println("Assembling a Laptop");
    }
}

class Desktop implements Computer{
    @Override
    public void assemble() {
        System.out.println("Assembling a Desktop");
    }
}

class ComputerFactory{
    public static Computer getComputer(String type){
        if (type.equalsIgnoreCase("laptop")){
            return new Laptop();
        } else if (type.equalsIgnoreCase("desktop")) {
            return new Desktop();
        }
        return null;
    }
}
