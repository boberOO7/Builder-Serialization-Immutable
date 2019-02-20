package com.liakhovskyi.pattern.builder;

public class Computer {
    private String processor;
    private String graphicCard;
    private String motherboard;
    private int numberOfCoolers;
    private int ram;
    private int storageCapacity;

    private Computer(String processor
            , String graphicCard
            , String motherboard
            , int numberOfCoolers
            , int ram
            , int storageCapacity) {
        this.processor = processor;
        this.graphicCard = graphicCard;
        this.motherboard = motherboard;
        this.numberOfCoolers = numberOfCoolers;
        this.ram = ram;
        this.storageCapacity = storageCapacity;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public int getNumberOfCoolers() {
        return numberOfCoolers;
    }

    public int getRam() {
        return ram;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public static class ComputerBuilder {
        private String processor;
        private String graphicCard;
        private String motherboard;
        private int numberOfCoolers;
        private int ram;
        private int storageCapacity;

        public ComputerBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public ComputerBuilder setGraphicCard(String graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }

        public ComputerBuilder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public ComputerBuilder setNumberOfCoolers(int numberOfCoolers) {
            this.numberOfCoolers = numberOfCoolers;
            return this;
        }

        public ComputerBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setStorageCapacity(int storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }

        public Computer build() {
            return new Computer(processor, graphicCard, motherboard, numberOfCoolers, ram, storageCapacity);
        }
    }
}
