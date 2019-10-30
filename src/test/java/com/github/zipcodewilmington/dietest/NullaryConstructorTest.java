package com.github.zipcodewilmington.dietest;

import com.github.zipcodewilmington.Die;
import org.junit.Assert;
import org.junit.Test;

public class NullaryConstructorTest {

    @Test
    public void test1(){
        // given
        Integer expectedFaceValues = null;
        Integer expectedNumberOfFaces = 6;

        // when
        Die die = new Die();
        Integer actualFaceValues = die.getCurrentFacesValue();
        Integer actualNumberOfFaces = die.getNumberOfFaces();

        // then
        Assert.assertEquals(expectedFaceValues, actualFaceValues);
        Assert.assertEquals(expectedNumberOfFaces, actualNumberOfFaces);
    }
}
