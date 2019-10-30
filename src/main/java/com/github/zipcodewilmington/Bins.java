package com.github.zipcodewilmington;

public class Bins {

    private final Bin[] bins;

    public Bins(Integer minFaceValue, Integer maxFaceValue) {
        Integer numberOfBins = maxFaceValue - minFaceValue;
        this.bins = new Bin[numberOfBins];

        for (int currentindex = 0; currentindex < bins.length; currentindex++) {
            Integer currentValue = minFaceValue + currentindex;
            bins[currentindex] = new Bin(currentValue);

        }
    }

    public Bin getBin(Integer faceValueToTrack) {
        for (int currentindexi = 0; currentindexi < bins.length; currentindexi++) {
            Bin bin = bins[currentindexi];
            Integer bineFaceValue = bin.getFaceValueToBeTracked();
            if (faceValueToTrack.equals(bineFaceValue)) {
                return bin;
            }
        }
        return null;

    }

    public void incrementBin(Integer faceValueToIncrement) {
        Bin bin = getBin(faceValueToIncrement);
        bin.increment();
    }

    public Bin[] getBins() {
        return bins;
    }
}
