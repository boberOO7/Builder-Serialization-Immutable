package com.liakhovskyi;

public final class ImmutablePeople {

    private final String lastName;
    private final String firstName;
    private final int weight;
    private final int height;
    private final DateOfBirth dateOfBirth;


    public ImmutablePeople(String lastName, String firstName, int weight, int height, DateOfBirth dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
        DateOfBirth cloneDateOfBirth = new DateOfBirth();
        cloneDateOfBirth.setDay(dateOfBirth.getDay());
        cloneDateOfBirth.setMonth(dateOfBirth.getMonth());
        cloneDateOfBirth.setYear(dateOfBirth.getYear());
        this.dateOfBirth = cloneDateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public DateOfBirth getDateOfBirth() {
        DateOfBirth cloneDateOfBirth = new DateOfBirth();
        cloneDateOfBirth.setDay(this.dateOfBirth.getDay());
        cloneDateOfBirth.setMonth(this.dateOfBirth.getMonth());
        cloneDateOfBirth.setYear(this.dateOfBirth.getYear());
        return cloneDateOfBirth;
    }
}
