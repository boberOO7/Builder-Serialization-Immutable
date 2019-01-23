package com.liakhovskyi;

public class Main {
    public static void main(String[] args) {
        Computer myNewComputer = new Computer.Builder()
                .setMotherboard("ASUS ROG STRIX Z390-H GAMING")
                .setProcessor("Intel® Core™ i7-9700K ")
                .setGraphicCard("ASUS GeForce RTX 2080 Dual")
                .setStorageCapacity(4)
                .setRam(32)
                .setNumberOfCoolers(5)
                .build();
        System.out.println("My new computer has:\n\tGraphic card -- "
                + myNewComputer.getGraphicCard()
                + "\n\tProcessor -- "
                + myNewComputer.getProcessor()
                + "\n\tMotherboard -- "
                + myNewComputer.getMotherboard()
                + "\n\tRAM -- "
                + myNewComputer.getRam()
                + " Gb"
                + "\n\tSSD -- "
                + myNewComputer.getStorageCapacity()
                + " Tb"
                + "\n\tNumber of coolers -- "
                + myNewComputer.getNumberOfCoolers());
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
