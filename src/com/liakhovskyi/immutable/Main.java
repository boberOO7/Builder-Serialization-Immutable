package com.liakhovskyi.immutable;

public class Main {
    public static void main(String[] args) {
        System.out.println("verification of immutability");
        DateOfBirth dateOfBirth = new DateOfBirth();
        dateOfBirth.setDay(1);
        dateOfBirth.setMonth(1);
        dateOfBirth.setYear(1992);
        ImmutablePeople people = new ImmutablePeople("Liakhovskyi"
                , "Vasilios"
                , 75
                , 182
                , dateOfBirth);

        System.out.println(people.getFirstName()
                + " year of birth before modification = "
                + people.getDateOfBirth().getYear());

        dateOfBirth.setYear(2000);
        people.getDateOfBirth().setYear(2020);

        System.out.println(people.getFirstName()
                + " year of birth after modification = "
                + people.getDateOfBirth().getYear());
    }
}
