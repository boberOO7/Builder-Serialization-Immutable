package com.liakhovskyi;

public class Computer {

    private String processor;
    private String graphicCard;
    private String motherboard;
    private int numberOfCoolers;
    private int ram;
    private int storageCapacity;

    public Computer(String processor
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

    public static class Builder {

        private String processor;
        private String graphicCard;
        private String motherboard;
        private int numberOfCoolers;
        private int ram;
        private int storageCapacity;

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setGraphicCard(String graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }

        public Builder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Builder setNumberOfCoolers(int numberOfCoolers) {
            this.numberOfCoolers = numberOfCoolers;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorageCapacity(int storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }

        public Computer build() {
            return new Computer(processor, graphicCard, motherboard, numberOfCoolers, ram, storageCapacity);
        }
    }
}
