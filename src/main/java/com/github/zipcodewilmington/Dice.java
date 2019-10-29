package com.github.zipcodewilmington;

public class Dice {
    private final Integer numberOfTosses;
    private final Die[] dice;

    public Dice(Integer numberOfDice, Integer numberOfTosses) {
        this.numberOfTosses = numberOfTosses;
        this.dice = new Die[numberOfDice];
    }
}
