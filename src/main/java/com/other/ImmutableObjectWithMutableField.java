package com.other;

import java.util.Date;

public final class ImmutableObjectWithMutableField {
    private final String name;
    private final Date dateOfBirth; // Mutable field

    public ImmutableObjectWithMutableField(String name, Date dateOfBirth) {
        this.name = name;
        // Create a defensive copy of the Date to ensure immutability
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    public String getName() {
        return name;
    }

    // Provide a defensive copy to ensure immutability
    public Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime());
    }

    public static void main(String[] args) {
        Date mutableDate = new Date();
        ImmutableObjectWithMutableField immutableObject = new ImmutableObjectWithMutableField("John Doe", mutableDate);

        System.out.println("Original Date: " + mutableDate);
        System.out.println("Immutable Object's Date: " + immutableObject.getDateOfBirth());

        // Attempt to modify the mutableDate after creating the immutable object
        mutableDate.setTime(System.currentTimeMillis() + 1000);
        System.out.println("Modified Date: " + mutableDate);
        System.out.println("Immutable Object's Date (after modification): " + immutableObject.getDateOfBirth());
    }
}