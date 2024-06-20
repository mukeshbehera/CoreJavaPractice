package com.other;

public class ImmutableClass {

    public static void main(String[] args) {
        Address address = new Address("Chennai", "Tamil Nadu");
        Employee employee = new Employee("Mike", 15, address);

        System.out.println("Original Employee Obj: \n" + employee);

        address.setCity("Mumbai");
        address.setState("Maharashtra");
        System.out.println("Employee Obj after local variable address change \n" + employee);

        Address empAddress = employee.getAddress();
        empAddress.setCity("Jaipur");
        empAddress.setState("Rajasthan");
        System.out.println("Employee Obj after employee address change \n" + employee);
    }
}



final class Employee{
    private final String name;
    private final int age;
    private final Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address.getCity(), address.getState());
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public Address getAddress() {
        return new Address(address.getCity(), address.getState());
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", address=" + address + '}';
    }
}


class Address{
    private String city;
    private String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}
    public String getState() {return state;}
    public void setState(String state) {this.state = state;}

    @Override
    public String toString() {
        return "Address{" + "city='" + city + '\'' + ", state='" + state + '\'' + '}';
    }
}

