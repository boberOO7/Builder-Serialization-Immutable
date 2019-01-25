package com.liakhovskyi.pattern.builder;

public class Main {
    public static void main(String[] args) {
        Computer myNewComputer = new Computer.ComputerBuilder()
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
    }
}
