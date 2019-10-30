package com.github.zipcodewilmington.bintest;

import com.github.zipcodewilmington.Bin;
import org.junit.Assert;
import org.junit.Test;

public class ConstructorTest {
    @Test
    public void test1(){
        Integer expectedFaceValueToCheck = null;
        Integer expectedNumberOfOccurrences  = 0;

        Bin bin = new Bin(expectedFaceValueToCheck);
        Integer actualValueToTrack = bin.getFaceValueToBeTracked();
        Integer actualNumberOfOccurrences = bin.getNumberOfOccurances();

        Assert.assertEquals(expectedFaceValueToCheck, actualValueToTrack);
        Assert.assertEquals(expectedNumberOfOccurrences, actualNumberOfOccurrences);
    }



    @Test
    public void test2(){
        Integer expectedFaceValueToCheck = 1;
        Integer expectedNumberOfOccurrences  = 0;

        Bin bin = new Bin(expectedFaceValueToCheck);
        Integer actualValueToTrack = bin.getFaceValueToBeTracked();
        Integer actualNumberOfOccurrences = bin.getNumberOfOccurances();

        Assert.assertEquals(expectedFaceValueToCheck, actualValueToTrack);
        Assert.assertEquals(expectedNumberOfOccurrences, actualNumberOfOccurrences);
    }



          @Test
          public void test3(){
        Integer expectedFaceValueToCheck = 2;
        Integer expectedNumberOfOccurrences  = 0;

        Bin bin = new Bin(expectedFaceValueToCheck);
        Integer actualValueToTrack = bin.getFaceValueToBeTracked();
        Integer actualNumberOfOccurrences = bin.getNumberOfOccurances();

        Assert.assertEquals(expectedFaceValueToCheck, actualValueToTrack);
        Assert.assertEquals(expectedNumberOfOccurrences, actualNumberOfOccurrences);
    }




        @Test
        public void test4(){
        test(99);
        Integer expectedFaceValueToCheck = 2;
        Integer expectedNumberOfOccurrences  = 0;

        Bin bin = new Bin(expectedFaceValueToCheck);
        Integer actualValueToTrack = bin.getFaceValueToBeTracked();
        Integer actualNumberOfOccurrences = bin.getNumberOfOccurances();

        Assert.assertEquals(expectedFaceValueToCheck, actualValueToTrack);
        Assert.assertEquals(expectedNumberOfOccurrences, actualNumberOfOccurrences);
        }

        private void test(Integer expectedFaceValueToCheck) {


            Integer expectedNumberOfOccurrences = 0;

            Bin bin = new Bin(expectedFaceValueToCheck);
            Integer actualValueToTrack = bin.getFaceValueToBeTracked();
            Integer actualNumberOfOccurrences = bin.getNumberOfOccurances();

            Assert.assertEquals(expectedFaceValueToCheck, actualValueToTrack);
            Assert.assertEquals(expectedNumberOfOccurrences, actualNumberOfOccurrences);

        }
    }