package com.github.zipcodewilmington;

public class Bin {

    private final Integer faceValueToBeTracked;
    private Integer numberOfOccurances;

    public Bin(Integer faceValueToBeTracked){
        this.faceValueToBeTracked = faceValueToBeTracked;
        this.numberOfOccurances = 0;
    }
    public Integer getNumberOfOccurances() {
        return numberOfOccurances;
    }

    public Integer getFaceValueToBeTracked() {
        return faceValueToBeTracked;
    }

    public void increment() {
        numberOfOccurances++;
    }
}
