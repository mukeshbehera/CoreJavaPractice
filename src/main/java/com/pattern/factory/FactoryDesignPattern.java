package com.pattern.factory;

// Product interface
interface Product {
    void create();
}

// Concrete product implementations
class ConcreteProductA implements Product {
    @Override
    public void create() {
        System.out.println("Creating Product A");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void create() {
        System.out.println("Creating Product B");
    }
}

// Factory interface
interface ProductFactory {
    Product createProduct();
}

// Concrete factory implementations
class ConcreteFactoryA implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

class ConcreteFactoryB implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}

// Client code
public class FactoryDesignPattern {
    public static void main(String[] args) {
        // Create a factory for Product A
        ProductFactory factoryA = new ConcreteFactoryA();
        // Use the factory to create a product
        Product productA = factoryA.createProduct();
        // Call the create method on the product
        productA.create();

        // Create a factory for Product B
        ProductFactory factoryB = new ConcreteFactoryB();
        // Use the factory to create a product
        Product productB = factoryB.createProduct();
        // Call the create method on the product
        productB.create();
    }
}