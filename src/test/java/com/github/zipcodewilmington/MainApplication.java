package com.github.zipcodewilmington;

public class MainApplication {
    public static void main(String[] args) {
        Integer numberOfDice = 2;
        Integer numberOfTosses = 9999999;
        Simulation simulation = new Simulation(numberOfDice, numberOfTosses);
        simulation.run();
        simulation.printResults();
    }
}
