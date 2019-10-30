package com.github.zipcodewilmington;

import java.util.Formatter;

public class Simulation {


    private final Integer numberOfDice;
    private final Integer numberOfRolls;
    private Bins bins;

    public Simulation(Integer numberOfDice, Integer numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfRolls = numberOfTosses;
    }

    public void run() {
        Dice dice = new Dice(numberOfDice, 6);
        Integer minimumValueToTrack = dice.getMinRoll();
        Integer maximumValueToTrack = dice.getMaxRoll();
        this.bins = new Bins(minimumValueToTrack, maximumValueToTrack);
        for (int currentindex = 0; currentindex < numberOfRolls; currentindex++) {
            Integer rollValue = dice.rollAndSum();
            bins.incrementBin(rollValue);

        }
    }

    public Double getPercentageOfOccurrences(Integer faceValueToCheck) {
        Bin bin = bins.getBin(faceValueToCheck);
        Integer numberOfOccurrences = bin.getNumberOfOccurances();
        Double ratio = numberOfOccurrences.doubleValue() / numberOfRolls;
        Double percentage = ratio * 100;
        return percentage;
    }

    public String toString() {
        Formatter output = new Formatter();
        Bin[] binArray = bins.getBins();
        for(Bin bin : binArray) {
            // doing math
            Integer faceValue = bin.getFaceValueToBeTracked();
            Double percentage = getPercentageOfOccurrences(faceValue);

            // formatting string
            Integer starCount = percentage.intValue();
            String stars = new String(new char[starCount]).replace("\0", "*");
            output.format("%d : %d: %.2f %s%n", faceValue, bin.getNumberOfOccurances(), percentage, stars);
        }

         return output.toString();
    }


    public void printResults() {
        System.out.println(toString());
    }
}
