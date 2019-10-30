package com.github.zipcodewilmington.dietest;

import com.github.zipcodewilmington.Die;
import org.junit.Assert;
import org.junit.Test;

public class RollTest {
    @Test(expected = NullPointerException.class)
    public void test1() {
        // given
        Integer numberOfFaces = null;
        Die die = new Die(numberOfFaces);
        // when
        die.roll();
    }

    @Test (expected = IllegalArgumentException.class)

    public void test2() {
        // given
        Integer numberOfFaces = 1;
        Die die = new Die(numberOfFaces);
        // when
        die.roll();
    }

    @Test
    public void test3() {
        // given
        Integer numberOfFaces = 2;
        Integer unexpected = null;
        Die die = new Die(numberOfFaces);
        // when
        die.roll();
        die.roll();
        Integer actual = die.getCurrentFacesValue();
        // then
        Assert.assertNotEquals(unexpected, actual);
    }

    @Test
    public void test4() {
        // given
        Integer numberOfFaces = 3;
        Integer unexpected = null;
        Die die = new Die(numberOfFaces);
        // when
        die.roll();
        die.roll();
        Integer actual = die.getCurrentFacesValue();
        // then
        Assert.assertNotEquals(unexpected, actual);
    }

}

